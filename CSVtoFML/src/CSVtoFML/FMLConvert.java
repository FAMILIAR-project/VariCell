package CSVtoFML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import Exceptions.ErrorInFMLConversion;
import FeatureName.FeatureName;
import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import fr.unice.polytech.modalis.familiar.interpreter.VariableNotExistingException;
import fr.unice.polytech.modalis.familiar.operations.FDOverApproximationStrategy;
import fr.unice.polytech.modalis.familiar.operations.FMLMergerBDD;
import fr.unice.polytech.modalis.familiar.operations.Mode;
import fr.unice.polytech.modalis.familiar.parser.VariableAmbigousConflictException;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.FeatureModel;

/**
 * Class used to convert a ConversionModel into a Feature model containing all
 * the variability of each ConversionModelArray (or views) composing the
 * ConversionModel. This class gives facilities to get metrics for the
 * conversion, get accessors for the intermediary FAMILIAR scripts and to
 * convert these script to the final feature model.
 * 
 * @author Charles Vanbeneden
 * edited by Taran
 */

public class FMLConvert {

	/**
	 * Reserved keyword for the identifier
	 */
	private static final String KEYWORD_ID = "ID";

	/**
	 * Targeted model we want to process to construct a feature model it
	 * includes all relevant information needed, including data content + user
	 * knowledge / directives
	 */
	protected ConversionModel _conversionModel;

	private HashMap<String, ArrayList<String>> _identifiors;
	private Set<String> _viewNameSet;
	/**
	 * Namespace mainly used to perform some checking. This set collects the
	 * different feature names that will be used. This set is thus used to
	 * generate artificial feature names when necessary.
	 */
	private Set<String> _nameSpace;

	/**
	 * The root feature name specified by the user and to be included in the
	 * resulting feature model
	 */
	protected String _rootFeatureName;

	/**
	 * (composed) primary keys -- provided by the composition model (see
	 * documentation there)
	 */
	protected ArrayList<String> _compositeKey;
	protected Map<String, String> _entriesFMStep1;
	protected Map<String, String> _identifiantScriptStep2;
	protected List<String> _finalScriptStep3 = null;
	protected Boolean _noFinalMerge = false;
	protected String _scriptFAMILIAR = "";
	protected String _finalFM = "";
	protected Boolean _cleanUpFinalFM = false;
	protected Random _generator;
	protected Integer _numberOptional;
	protected Integer _numberMandatory;
	protected Integer _numberDead;
	protected Integer _numberTextual;
	protected Integer _numberMultiValue;

	/**
	 * if set to true, primary identifiers appear in the resulting feature model
	 */
	protected Boolean _showID;

	private Map<String, Map<String, String>> _localNameSpaces;
	protected Skeleton _skeleton;

	/**
	 * whether or not the optimization that consists in using the skeleton is
	 * performed
	 */
	protected Boolean _skeletonOptimisation;
	/**
	 * Associated to ValueMode.Mandatory
	 */
	protected Set<String> _mandatoryValues;
	/**
	 * Associated to ValueMode.Optional
	 */
	protected Set<String> _optionalValues;
	/**
	 * Associated to ValueMode.Dead
	 */
	protected Set<String> _deadValues;
	
	protected Boolean multivaluesMovement = false;

	/**
	 * Side-effect : launch the conversion.
	 * 
	 * @param conversionModel
	 *            ConversionModel to convert into a FM
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	public FMLConvert(ConversionModel conversionModel) throws ErrorInFMLConversion {
		this(conversionModel, true, false);
	}

	/**
	 * Side-effect : launch the conversion.
	 * 
	 * @param conversionModel
	 *            ConversionModel to convert into a FM.
	 * @param showID
	 *            True = show entities names into the final feature model.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	public FMLConvert(ConversionModel conversionModel, Boolean showID) throws ErrorInFMLConversion {
		this(conversionModel, showID, false);
	}

	/**
	 * Side-effect : launch the conversion.
	 * 
	 * @param conversionModel
	 *            ConversionModel to convert into a FM.
	 * @param showID
	 *            True = show entities names into the final feature model.
	 * @param skeletonOptimisation
	 *            True = optimize the FAMILIAR merge operator with the
	 *            construction of a skeleton of the final feature model.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	public FMLConvert(ConversionModel conversionModel, Boolean showID, Boolean skeletonOptimisation) throws ErrorInFMLConversion {

		_skeletonOptimisation = skeletonOptimisation;

		setFinalMerge(true);

		/****** init the internal structure of FMLConvert ******/
		_conversionModel = conversionModel;
		_nameSpace = new HashSet<String>();
		_identifiors = new HashMap<String, ArrayList<String>>();
		_viewNameSet = new HashSet<String>();
		_localNameSpaces = new HashMap<String, Map<String, String>>();
		_generator = new Random();
		_numberOptional = 0;
		_numberMandatory = 0;
		_numberDead = 0;
		_numberTextual = 0;
		_numberMultiValue = 0;

		/****** collect user directives ******/
		// must be specified by the user
		_rootFeatureName = conversionModel.getRootFeatureName();
		// optionally specified by the user
		_compositeKey = new ArrayList<String>(Arrays.asList(conversionModel.getComposedIDArray()));
		// optionally specified by the user (by default, true)
		_showID = showID;

		/**** construct the skeleton hierarchy *****/
		_skeleton = new Skeleton(_rootFeatureName);
		valueModeInit();
	}

	private void valueModeInit() {
		_mandatoryValues = new HashSet<String>();
		_mandatoryValues.add("YES");
		//_mandatoryValues.add("Man");
		_optionalValues = new HashSet<String>();
		_optionalValues.add("N_A");
		_optionalValues.add("OPT");
		_optionalValues.add("OPTIONAL");
		_deadValues = new HashSet<String>();
		_deadValues.add("NO");

		_mandatoryValues.add("TRUE");
		_optionalValues.add("PARTIAL");
		_optionalValues.add("PLUGIN");
		_deadValues.add("FALSE");
	}

	/**
	 * Process the conversion.
	 * 
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	public void convert() throws ErrorInFMLConversion {
		// setting identifiers in the namespace + some consistency
		init();

		collectVariableViews(); // for each entity

		constructFMbyEntity(); // i.e., combine all previous views

		mergeAllFMs();
	}

	/**
	 * Process the conversion but without merging at the end.
	 * 
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	public void convertWithoutMerging() throws ErrorInFMLConversion {
		// setting identifiers in the namespace + some consistency
		init();

		collectVariableViews(); // for each entity

		constructFMbyEntity(); // i.e., combine all previous views

	}

	/**
	 * The optimization that consists in using the skeleton is performed.
	 */
	public void activateSqueletonOptimisation() {
		_skeletonOptimisation = true;
	}

	/**
	 * A composed ID is unique (e.g., there is no two entries with Nvidia) and
	 * is considered as a special value TODO consider two alternative
	 * strategies: (1) but the composed ID as a child feature of the primary ID,
	 * e.g., ATI : Nvidia ; (2) the composed ID is a child feature of, say,
	 * "Brand"
	 * 
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private void makeComposedIDValid() throws ErrorInFMLConversion {
		int i = 0;
		String tmp = "";
		// Make all the composedID names valid
		while (i < _compositeKey.size()) {
			tmp = makeNameValid(_compositeKey.get(i));
			if (tmp.compareTo("") == 0)
				throw new ErrorInFMLConversion("Bad composed ID name !");
			_compositeKey.set(i, tmp);
			if (_showID)
				_skeleton.getIdentifiors().add(new SkeletonIdentifierGroup(tmp));
			// the composed ID is considered as an identifier as such (e.g.,
			// NVdia Unique composed ID name)
			if (!_nameSpace.add(tmp))
				throw new ErrorInFMLConversion("Duplicated composed ID Name !");
			// identifier should be unique => so composed identifier
			i++;
		}
	}

	/**
	 * Transform the head of the given ConversionModelArray into a valid form
	 * (correct names,...) and makes some checks on the head.
	 * 
	 * @param convArr
	 *            ConversionModelArray to make valid.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private void makeHeadValid(ConversionModelArray convArr) throws ErrorInFMLConversion {
		int i = 0;
		String tmp;
		Set<String> tmpNameSpace = new HashSet<String>();
		// Head checks
		while (i < convArr.getNbActualColumns()) {
			tmp = makeNameValid(convArr.getLabel(i));

			// every head names must be unique
			if (!tmpNameSpace.add(tmp))
				throw new ErrorInFMLConversion("All the col names must be unique for a single ConversionModelArray!");

			// TODO ne va jamais arriver
			if (!_nameSpace.add(tmp)) {
				if (!_compositeKey.contains(tmp))
					convArr.renameLabel(i, tmp + "_" + (tmp.hashCode() + convArr.hashCode()));
			}
			// make all head names valid
			convArr.renameLabel(i, makeNameValid(convArr.getLabel(i)));

			i++;
		}
	}

	/**
	 * Checks if the given ConversionModelArray is valid.
	 * 
	 * @param convModelTmp
	 *            ConversionModelArray to check.
	 * @return A set containing all the identifiers of the given
	 *         ConversionModelArray.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private Set<String> conversionModelChecks(ConversionModelArray convModelTmp) throws ErrorInFMLConversion {
		// no ConversionModel representation should be null
		if (convModelTmp == null || convModelTmp.getNbActualColumns() < 1 || convModelTmp.getNbActualRows() == 0)
			throw new ErrorInFMLConversion("One of the ConversionModelArray objects is null!");

		makeHeadValid(convModelTmp);

		// Heading must contain all composed ID
		if (_compositeKey.size() != 0 && !convModelTmp.isLabel(_compositeKey))
			throw new ErrorInFMLConversion("One of the specified ConversionModelArray doesn't contains the composed label.");

		// Unique meta-name
		if (!_nameSpace.add(makeNameValid(convModelTmp.getViewName())))
			throw new ErrorInFMLConversion("One of you view is use an already used name ! " + convModelTmp.getViewName());

		// Fill tmpNameSpace = union of all entity ids.
		Iterator<String> entityIT = convModelTmp.getRowIdentifierIterator();
		Set<String> tmpNameSpace = new HashSet<String>();
		String tmp;
		while (entityIT.hasNext()) {
			tmp = makeNameValid(entityIT.next());
			// verify if the entity id name is unique in the ConversionModel
			if (!tmpNameSpace.add(tmp))
				throw new ErrorInFMLConversion("Already used entity id name in the same ConversionModelArray. An id must be unique ! "
						+ tmp);
		}
		return tmpNameSpace;
	}

	/**
	 * All values are normalized and put into the namespace. We verify that all
	 * values respect the namespace consistency rules, i.e., identifiers should
	 * be unique
	 * 
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	protected void init() throws ErrorInFMLConversion {
		_nameSpace.add(KEYWORD_ID);
		_rootFeatureName = makeNameValid(_rootFeatureName);
		if (_rootFeatureName == null || makeNameValid(_rootFeatureName).compareTo("") == 0)
			throw new ErrorInFMLConversion("The root feature name isn't correct!");
		_nameSpace.add(_rootFeatureName);
		this.makeComposedIDValid();
		if (_conversionModel.getTotalView() == 0)
			throw new ErrorInFMLConversion("No conversion array given with the conversion model. Nothing to do.");
		Iterator<ConversionModelArray> convArrIterator = _conversionModel.getViewsIterator();
		Set<String> tmpNameSpace2 = new HashSet<String>();
		String tmp;
		ConversionModelArray con;
		while (convArrIterator.hasNext()) {
			con = convArrIterator.next();
			tmpNameSpace2.addAll(conversionModelChecks(con));
			if (con.getNbSubViews() > 0) {
				Iterator<ConversionModelArray> subVIT = con.getSubViewsIterator();
				ConversionModelArray con2;
				while (subVIT.hasNext()) {
					con2 = subVIT.next();
					tmpNameSpace2.addAll(conversionModelChecks(con2));
				}
			}

		}
		Iterator<String> entityIT = tmpNameSpace2.iterator();
		// Verify if all the id names aren't reserved yet.
		while (entityIT.hasNext()) {
			tmp = entityIT.next();
			if (!_nameSpace.add(tmp))
				throw new ErrorInFMLConversion("Already used entity id name ! " + tmp);
		}
	}
	
	

	/**
	 * @param name
	 * @return
	 *         A canonical form of the name to avoid interoperability issues,
	 *         e.g., with FAMILIAR that does not support special characters
	 *         "-,;:/"...
	 */
	public static String makeNameValid(String name) {
		if (name == null || name.compareTo("") == 0)
			return "";
		
		if (FeatureName.isQuotable(name)) {
			return FeatureName.quote(name); 
		}
		
		name = name.replace(System.getProperty("line.separator"), "");
		String validName = "";
		int i = 0;
		boolean firstCharPassed = false;
		char charr;
		int cha;
		while (i < name.length()) {
			charr = name.charAt(i);
			cha = (int) charr;
			if (!firstCharPassed) {
				if (cha > 47 && cha < 58) {
					validName = "X";
					name = "X" + name;
					firstCharPassed = true;
				} else if (cha > 96 && cha < 123) {
					validName = "" + (char) (cha - 32);
					firstCharPassed = true;
				} else if (cha > 64 && cha < 91) {
					validName = "" + charr;
					firstCharPassed = true;
				} else {
					firstCharPassed = false;
				}
			} else if ((cha > 47 && cha < 58) || (cha > 64 && cha < 91) || cha == 95 || (cha > 96 && cha < 123)) {
				validName = validName + charr;
			} else // {
					// if (cha != 32) {
			if (cha == 47 || cha == 92 || cha == 46)
				validName = validName + "_";
			// }
			// }
			i++;
		}
		return validName;
	}

	/**
	 * @param value
	 *            Value to determine if it's multivalued.
	 * @param convModArr
	 *            Associated ConversionModelArray.
	 * @return True if the value is multi-valued, e.g., Linux;Windows;MacOS
	 *         where ';' is the separator given by the ConversionModelArray.
	 */
	private Boolean isMultiValued(String value, ConversionModelArray convModArr) {
		// TODO: (not really important - mini extension) several separators may
		// exist, even of a single ConvertionModelArray
		return value.contains(convModArr.getMultiValuedSeparator());
	}

	/**
	 * Operated some checks on composed ids.
	 * 
	 * @param value
	 *            Value to check for composed id.
	 * @param label
	 *            Value associated label.
	 * @param identifiorArray
	 *            Array of composed identifiers (corresponding label names).
	 * @param convModArr
	 *            Associated ConversionModelArray.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private void checkComposedID(String value, String label, ArrayList<String> identifiorArray, ConversionModelArray convModArr)
			throws ErrorInFMLConversion {
		if (isMultiValued(value, convModArr))
			throw new ErrorInFMLConversion("One of your composed ID value is multivalued... Col : " + label);
		value = FMLConvert.makeNameValid(value);
		int tmp = _compositeKey.indexOf(label);
		try {
			// Check if the composed id is the same for all
			// primary id.
			label = identifiorArray.get(tmp);
			if (label.compareTo(value) != 0)
				throw new ErrorInFMLConversion(
						"One of the composed id isn't unique. You can't make several entries for the same entity with different composed names. "
								+ value + " " + label);
		} catch (IndexOutOfBoundsException e) {
			_nameSpace.add(value);
			identifiorArray.add(tmp, value);
			if (_showID) {
				SkeletonIdentifierGroup tmpIden = _skeleton.getIdentifior(label);
				if (tmpIden == null)
					throw new ErrorInFMLConversion("Error creating the skeleton. The composed ID parent " + label + " isn't created yet...");
				tmpIden.getIdentifiers().add(value);
			}
		}
	}

	public Integer getNbMultiValued() {
		return _numberMultiValue;
	}

	/**
	 * In case value is a multivalued value. Makes a sub-production for the
	 * different values with the associated relation (OR, XOR, Mandatory,
	 * Optional).
	 * 
	 * @param value
	 *            Multivalued value. Ex : Windows;Linux;MacOS.
	 * @param labelName
	 *            Value associated label.
	 * @param convModArr
	 *            Associated ConversionModelArray.
	 * @param tmpSubProduction
	 *            Passed by reference. Above level production.
	 * @param tmpProd
	 *            Passed by reference. String containing all sub productions of
	 *            the FM.
	 * @param tmpConstraint
	 *            Passed by reference. String containing all constraints of the
	 *            FM.
	 * @param squeletonCharacteristic
	 *            Associated Characteristic.
	 * @return True if the parent characteristic must be mandatory. False if it
	 *         must be optional.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private ValueMode populateMultiValue(String value, String labelName, ConversionModelArray convModArr, StringBuilder tmpSubProduction,
			StringBuilder tmpProd, StringBuilder tmpConstraint, SkeletonCharacteristic squeletonCharacteristic) throws ErrorInFMLConversion {
		// multivalued handling

		assert (isMultiValued(value, convModArr));
		_numberMultiValue++;

		String[] splitted = value.split(convModArr.getMultiValuedSeparator());
		StringBuilder tmpProTMP = new StringBuilder();
		tmpProTMP.append(labelName + " : ");

		MultiValuedMode mode = convModArr.getMultivaluedModeForLabel(labelName);
		if (mode == null)
			throw new ErrorInFMLConversion("The label " + labelName + " doesn't exists! Should never happend...");

		if (mode == MultiValuedMode.XOR || mode == MultiValuedMode.OR)
			tmpProTMP.append("(");
		int k = 0;
		int l = 0;
		int nbr;
		int nbr2;
		String stuck;
		String prod;
		ValueMode mod = ValueMode.Mandatory;
		while (l < splitted.length) {
			stuck = FMLConvert.makeNameValid(splitted[l].trim());
			nbr = _numberDead + _numberOptional;
			nbr2 = _numberTextual;
			prod = transformValueToProd(stuck, FMLConvert.makeNameValid(convModArr.getViewName()), labelName, tmpConstraint,
					squeletonCharacteristic);
			if (_numberDead + _numberOptional != nbr + 1)
				mod = ValueMode.Optional;
			if (nbr2 + 1 == _numberTextual) {
				// there was a spec value
				if (mode == MultiValuedMode.XOR || mode == MultiValuedMode.OR)
					if (k == 0)
						tmpProTMP.append(prod);
					else
						tmpProTMP.append(" | " + prod);
				else if (mode == MultiValuedMode.Optional)
					tmpProTMP.append(" [" + prod + "]");
				else
					tmpProTMP.append(" " + prod);
				squeletonCharacteristic.getSpecialCharacteristics().add(prod.toString());
				k++;
			}
			l++;
		}
		if (mode == MultiValuedMode.XOR)
			tmpProTMP.append(") ; ");
		else if (mode == MultiValuedMode.OR)
			tmpProTMP.append(")+ ; ");
		else
			tmpProTMP.append(" ; ");
		if (k > 0)
			tmpProd.append(tmpProTMP);
		return mod;
	}

	/**
	 * In case of a traditional value.
	 * 
	 * @param squeletonView
	 *            Associated Squeleton view.
	 * @param labelName
	 *            Associated label.
	 * @param convModArr
	 *            Associated ConversionModelArray.
	 * @param value
	 *            Value to populate.
	 * @param tmpSubProduction
	 *            Passed by reference. Above level production.
	 * @param tmpProd
	 *            Passed by reference. String containing all sub productions of
	 *            the FM.
	 * @param tmpConstraint
	 *            Passed by reference. String containing all constraints of the
	 *            FM.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private void populateValue(SkeletonView squeletonView, String labelName, ConversionModelArray convModArr, String value,
			StringBuilder tmpSubProduction, StringBuilder tmpProd, StringBuilder tmpConstraint) throws ErrorInFMLConversion {
		SkeletonCharacteristic squeletonCharacteristic = squeletonView.getCharacteristic(labelName);
		if (squeletonCharacteristic == null) {
			squeletonCharacteristic = new SkeletonCharacteristic(labelName);
			squeletonView.getCharacteristics().add(squeletonCharacteristic);
		}
		ValueMode mod;

		if (isMultiValued(value, convModArr)) {
			mod = populateMultiValue(value, labelName, convModArr, tmpSubProduction, tmpProd, tmpConstraint, squeletonCharacteristic);
		}
		// Yes, No, N/A, Partial, value, etc.
		else {
			value = FMLConvert.makeNameValid(value);
			String prod = transformValueToProd(value, FMLConvert.makeNameValid(convModArr.getViewName()), labelName, tmpConstraint,
					squeletonCharacteristic);
			mod = getValueMode(value);
			if (mod == ValueMode.Textual) // there was a spec value
				tmpProd.append(labelName + " : " + prod + " ; ");
		}
		if (mod == ValueMode.Optional || mod == ValueMode.Dead) {
			tmpSubProduction.append(" [" + labelName + "]");
			squeletonCharacteristic.setOptional(true);
		} else
			// textual or mandatory
			tmpSubProduction.append(" " + labelName);

	}

	/**
	 * Generate the content of the feature model corresponding to one
	 * entry/entity/product and one view
	 * 
	 * @param id
	 *            identifier of entry/entity/product
	 * @param cells
	 *            data content
	 * @param convModArr
	 * @param squeletonView
	 * @param tmpSubProduction
	 *            Passed by reference. First productions of the associated FM.
	 * @param tmpProd
	 *            Passed by reference. Sub-productions of the associated FM.
	 *            the FM.
	 * @param tmpConstraint
	 *            Passed by reference. Constraints of the associated FM.
	 *            FM.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private void entryFeatureModelGenHandling(String id, Iterator<String> cells, ConversionModelArray convModArr,
			SkeletonView squeletonView, StringBuilder tmpSubProduction, StringBuilder tmpProd, StringBuilder tmpConstraint)
			throws ErrorInFMLConversion {
		String labelName;
		String value;
		String validID = FMLConvert.makeIdentifierValid(id);
		ArrayList<String> arr;
		if (!_identifiors.containsKey(validID)) {
			arr = new ArrayList<String>();
			arr.ensureCapacity(_compositeKey.size());
			_identifiors.put(validID, arr);
		} else
			arr = _identifiors.get(validID);

		int i = 0;
		// for each value of the entry/entity/product
		while (cells.hasNext()) {
			// MultiValued value handling
			value = cells.next();
			// label name of the current value
			labelName = convModArr.getLabel(i);
			// Composed id handling
			if (_compositeKey.contains(labelName))
				checkComposedID(value, labelName, arr, convModArr);
			else
				// value handling
				populateValue(squeletonView, labelName, convModArr, value, tmpSubProduction, tmpProd, tmpConstraint);
			i++;
		}

		// subviews handling

		if (convModArr.getNbSubViews() > 0) {
			Iterator<ConversionModelArray> ite = convModArr.getSubViewsIterator();
			ConversionModelArray convMod;
			StringBuilder tmpSubProduction2 = new StringBuilder();
			while (ite.hasNext()) {
				convMod = ite.next();
				tmpSubProduction.append(" " + convMod.getViewName());

				if (!convMod.isIdentifier(id))
					throw new ErrorInFMLConversion("The subview doesn't contain the specified identifier. View : " + convMod.getViewName()
							+ " - Identifier " + id);

				SkeletonView v;
				if (!squeletonView.isSubView(convMod.getViewName())) {
					v = new SkeletonView(convMod.getViewName());
					squeletonView.addSubView(v);
				} else
					v = squeletonView.getSubView(convMod.getViewName());

				_viewNameSet.add(FMLConvert.makeNameValid(convMod.getViewName()));
				tmpSubProduction2 = new StringBuilder();
				tmpSubProduction2.append(convMod.getViewName() + " : ");
				entryFeatureModelGenHandling(id, convMod.getRowValuesIterator(id), convMod, v, tmpSubProduction2, tmpProd, tmpConstraint);
			}

			tmpProd.append(tmpSubProduction2.toString());
		}
	}

	/**
	 * Generate a feature model corresponding to one entry/entity/product and
	 * one view Entity+View => Feature Model.
	 * 
	 * @param id
	 *            Identifier of entry/entity/product
	 * @param cells
	 *            Data content associated to the view and entity
	 * @param convModArr
	 *            Associated ConversionModelArray.
	 * @param squeletonView
	 *            Associated Squeleton View.
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	private void entryFeatureModelGen(String id, Iterator<String> cells, ConversionModelArray convModArr, SkeletonView squeletonView)
			throws ErrorInFMLConversion {
		String validViewName = FMLConvert.makeNameValid(convModArr.getViewName());
		// creation of the entry FAMILIAR fm.
		StringBuilder tmpSubProduction = new StringBuilder();
		StringBuilder tmpProd = new StringBuilder();
		StringBuilder tmpConstraint = new StringBuilder();

		entryFeatureModelGenHandling(id, cells, convModArr, squeletonView, tmpSubProduction, tmpProd, tmpConstraint);


		if(multivaluesMovement)	composeMultivaluesXorGroups(tmpSubProduction, tmpProd);

		// end of the FAMILIAR fm
		_entriesFMStep1.put(FMLConvert.makeIdentifierValid(id) + "_" + validViewName, "FM (" + validViewName + " : " + tmpSubProduction + " ; "
				+ tmpProd + tmpConstraint + " )");
	}

	private static String makeIdentifierValid(String name) {
		if (name == null || name.compareTo("") == 0)
			return "";
		
		name = name.replace(System.getProperty("line.separator"), "");
		String validName = "";
		int i = 0;
		boolean firstCharPassed = false;
		char charr;
		int cha;
		while (i < name.length()) {
			charr = name.charAt(i);
			cha = (int) charr;
			if (!firstCharPassed) {
				if (cha > 47 && cha < 58) {
					validName = "X";
					name = "X" + name;
					firstCharPassed = true;
				} else if (cha > 96 && cha < 123) {
					validName = "" + (char) (cha - 32);
					firstCharPassed = true;
				} else if (cha > 64 && cha < 91) {
					validName = "" + charr;
					firstCharPassed = true;
				} else {
					firstCharPassed = false;
				}
			} else if ((cha > 47 && cha < 58) || (cha > 64 && cha < 91) || cha == 95 || (cha > 96 && cha < 123)) {
				validName = validName + charr;
			} else // {
					// if (cha != 32) {
			if (cha == 47 || cha == 92 || cha == 46)
				validName = validName + "_";
			// }
			// }
			i++;
		}
		return validName;
	}

	/**
	 * @param value
	 *            Non multivalued value to normally process.
	 * @param viewName
	 *            Associated viewName.
	 * @param characteristicName
	 *            Associated characteristic name.
	 * @param tmpProd
	 *            Passed by reference. Sub-productions of the associated FM.
	 *            the FM.
	 * @param tmpConstraint
	 *            Passed by reference. Constraints of the associated FM.
	 *            FM.
	 * @param squeletonCharacteristic
	 *            Associated squeleton Characteristic.
	 */
	public String transformValueToProd(String value, String viewName, String characteristicName, StringBuilder tmpConstraint,
			SkeletonCharacteristic squeletonCharacteristic) {
		String tmpProd = "";
		// case insensitive
		
		// TODO: AM check
		ValueMode mod = getValueMode(value); //getValueMode(characteristicName); //
		if (mod == ValueMode.Mandatory) {
			_numberMandatory = _numberMandatory + 1;
		} else if (mod == ValueMode.Dead) {
			tmpConstraint.append(viewName + " -> !" + characteristicName + "; ");
			_numberDead = _numberDead + 1;
		} else if (mod == ValueMode.Optional) {
			_numberOptional = _numberOptional + 1;
		} /*
		 * else if (isPartial(value)) {
		 * tmpConstraint.append(viewName + " -> " + characteristicName + "; ");
		 * _numberPartial = _numberPartial + 1;
		 * }
		 */else if (mod == ValueMode.Textual) {
			/*
			 * Textual value. So, we created a sub-production containing
			 * the value...
			 */
			String tmpx;
			String tmpxx;
			Map<String, String> corrs = _localNameSpaces.get(characteristicName);
			if (corrs == null) {
				HashMap<String, String> localMap = new HashMap<String, String>();
				tmpx = addToNameSpace(value);
				localMap.put(value, tmpx);
				_localNameSpaces.put(characteristicName, localMap);
			} else {
				tmpxx = corrs.get(value);
				if (tmpxx == null) {
					tmpx = addToNameSpace(value);
					corrs.put(value, tmpx);
				} else
					tmpx = tmpxx;
			}
			squeletonCharacteristic.getSpecialCharacteristics().add(tmpx);
			tmpProd = tmpx;
			_numberTextual = _numberTextual + 1;
		} else {
			// Should never append
			System.err.println("Unknown value type!");
		}
		return tmpProd;
	}

	private ValueMode getValueMode(String value) {
		for (String tmp : _mandatoryValues)
			if (value.compareToIgnoreCase(tmp) == 0)
				return ValueMode.Mandatory;
		for (String tmp : _optionalValues)
			if (value.compareToIgnoreCase(tmp) == 0)
				return ValueMode.Optional;
		for (String tmp : _deadValues)
			if (value.compareToIgnoreCase(tmp) == 0)
				return ValueMode.Dead;
		return ValueMode.Textual;
	}

	/**
	 * For each entity, generate the FM corresponding to the view
	 * Entity x View = FM generation
	 * 
	 * @return A map whose form is "id_view => FM"
	 *         e.g., MoinMoin_Datastorage => FM (Datastorage : () ; )
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 * 
	 *             TODO: Map<Entity, String>
	 *             Entity ->* View
	 *             for each entity view, there is an FM
	 */
	public Map<String, String> collectVariableViews() throws ErrorInFMLConversion {
		if (_entriesFMStep1 != null)
			return _entriesFMStep1;
		_entriesFMStep1 = new HashMap<String, String>();
		ConversionModelArray convArr = null;
		Iterator<String> ids;
		SkeletonView squeletonView;
		Iterator<ConversionModelArray> convArrIT = _conversionModel.getViewsIterator();

		// for each *concern* specification (ConversionModelArray)... aka View
		// of the SPL
		// basically, it is *one* CSV file that describes the features of *one*
		// concern, for a set of products
		while (convArrIT.hasNext()) {
			convArr = convArrIT.next();

			_viewNameSet.add(FMLConvert.makeNameValid(convArr.getViewName()));

			// 1. we create a view and add the view to the squeleton
			squeletonView = new SkeletonView(convArr.getViewName());
			_skeleton.getViews().add(squeletonView);

			// 2. return the set of product identifiers
			// in order to iterate for each entity
			ids = convArr.getRowIdentifierIterator();
			// for each entry/entity/product
			while (ids.hasNext()) {
				String id = ids.next();
				entryFeatureModelGen(id, convArr.getRowValuesIterator(id), convArr, squeletonView);
			}
		}
		return _entriesFMStep1;
	}

	/**
	 * Side-effect : _nameSpace.<br />
	 * In FAMILIAR a name must be unique. So, this function is used to give
	 * unique names to each feature that will be created in the final feature
	 * model. If you want to get a valid FAMILIAR name, you call this function
	 * with the given name. If the given name doesn't already exists, you'll get
	 * in return the same name. Otherwise, you'll get an unique name that isn't
	 * already given to another feature.
	 * 
	 * @param name
	 *            Name to add to the name space.
	 * @return The valid name that was effectively put into the name space if
	 *         the given name was already in the name space.
	 */
	protected String addToNameSpace(String name) {
		while (!_nameSpace.add(makeNameValid(name))) {
			String[] splitted = name.split("_");
			if (splitted.length > 1) {
				String nameFinal = "";
				int i = 0;
				while (i < splitted.length - 1) {
					if (nameFinal.compareTo("") == 0) {
						nameFinal = splitted[i];
					} else {
						nameFinal = nameFinal + "_" + splitted[i];
					}
					i++;
				}
				Integer value;
				try {
					value = Integer.parseInt(splitted[splitted.length - 1]);
					value = (nameFinal.hashCode() + _generator.nextInt() + name.hashCode() + i) * 2;

				} catch (NumberFormatException e) {
					value = nameFinal.hashCode() + name.hashCode();
					nameFinal = nameFinal + "_" + splitted[splitted.length - 1];
				}
				if (value < 0)
					value = -value;
				name = nameFinal + "_" + value;

			} else
				name = makeNameValid(name + "_" + name.hashCode());
		}
		return name;
	}

	/**
	 * Create one comprehensive feature model by entity basically
	 * combine/aggregate all previous views into an integrated feature model for
	 * each entity
	 * 
	 * @return A map "id => FM" where is an identifier of an entity/product and
	 *         FM is the aggregated FM
	 * @throws ErrorInFMLConversion
	 *             Throws if there was an error during the conversion. Show the
	 *             e.getMessage() for more information.
	 */
	public Map<String, String> constructFMbyEntity() throws ErrorInFMLConversion {
		if (getNumberEntriesFeatureModel() == 0)
			throw new ErrorInFMLConversion("No entry feature model to merge.");
		if (_identifiantScriptStep2 != null)
			return _identifiantScriptStep2;

		_identifiantScriptStep2 = new HashMap<String, String>();
		Iterator<String> iter = _identifiors.keySet().iterator();
		Iterator<String> it;
		Iterator<String> it2;
		ArrayList<String> composedNameValues;
		String entityIdentifier = "";
		String out = "";
		String tmp = "";
		String tmpSubProd = "";

		Set<SkeletonIdentifierGroup> squeletonIdentifiors = _skeleton.getIdentifiors();
		SkeletonIdentifierGroup defaultSkeletonIdentifior = null;
		if (_showID) {
			defaultSkeletonIdentifior = new SkeletonIdentifierGroup(KEYWORD_ID);
			squeletonIdentifiors.add(defaultSkeletonIdentifior);
		}
		// aggregating entry fm to id fm
		while (iter.hasNext()) {
			entityIdentifier = iter.next();
			composedNameValues = _identifiors.get(entityIdentifier);
			out = "FM(" + _rootFeatureName + " : ID ";
			// For composed name values.
			if (composedNameValues.size() != 0) {
				tmpSubProd = "";
				it = composedNameValues.iterator();
				it2 = _compositeKey.iterator();
				while (it.hasNext()) {
					tmp = it2.next();
					out = out + tmp + " ";
					tmpSubProd = tmpSubProd + tmp + " : " + it.next() + " ; ";
				}
			}
			if (_showID) {
				out = out + "; ID : " + entityIdentifier + " ; ";
				defaultSkeletonIdentifior.getIdentifiers().add(entityIdentifier);
			} else
				out = out + "; ";
			// TODO: aggregate is also possible!
			out = out + tmpSubProd + ")" + System.getProperty("line.separator") + "foreach(f in " + entityIdentifier + "_*) do"
					+ System.getProperty("line.separator") + "insert f into fm_" + entityIdentifier + "." + _rootFeatureName + " with mand"
					+ System.getProperty("line.separator") + "end";
			if (!_showID)
				out = out + System.getProperty("line.separator") + "removeFeature fm_" + entityIdentifier + ".ID";
			_identifiantScriptStep2.put("fm_" + entityIdentifier, out);
		}
		return _identifiantScriptStep2;

	}

	/**
	 * @return The generated Skeleton.
	 */
	public Skeleton getSkeleton() {
		return _skeleton;
	}

	/**
	 * Final step of the process. Add to the temp FAMILIAR script the final
	 * merge instruction of each entity FM.
	 * 
	 * @throws ErrorInFMLConversion
	 *             Thrown if the previous step wasn't successful.
	 */
	public List<String> mergeAllFMs() throws ErrorInFMLConversion {
		if (getNbIdentifierScript() == 0)
			throw new ErrorInFMLConversion("No identifier feature model to merge.");
		if (_finalScriptStep3 != null)
			return _finalScriptStep3;
		_finalScriptStep3 = new ArrayList<String>();
		if (!_skeletonOptimisation)
			// merging all the id fm into a final fm
			_finalScriptStep3.add("finalFM = merge sunion fm_*");
		// _finalScriptStep4.add("println finalFM");
		return _finalScriptStep3;
	}

	/**
	 * @return The number of temporary entry feature model generated in step 2.
	 */
	public Integer getNumberEntriesFeatureModel() {
		return _entriesFMStep1.size();
	}

	/**
	 * @return The number of temporary identifier feature model generated in
	 *         step 3.
	 */
	public Integer getNbIdentifierScript() {
		return _identifiantScriptStep2.size();
	}

	/**
	 * @return Number of different feature name. This number might be the same
	 *         number as the number of different feature of the final feature
	 *         model.
	 */
	public Integer getNameSpaceSize() {
		return _nameSpace.size();
	}

	/**
	 * @return A set containing every names of feature.
	 */
	public Set<String> getNameSpace() {
		return this._nameSpace;
	}

	/**
	 * @return The root feature name given by the user.
	 */
	public String getRootFeatureName() {
		return this._rootFeatureName;
	}

	/**
	 * @return Number of lines of the temp script of the step 3.
	 */
	public Integer getNbLineScriptFinalStep() {
		return _finalScriptStep3 == null ? 0 : _finalScriptStep3.size();
	}

	/**
	 * @return The number of encountered N/A values.
	 */
	public Integer getNbOptionalValue() {
		return _numberOptional;
	}

	/**
	 * @return The number of encountered Yes values.
	 */
	public Integer getNbMandatoryValue() {
		return _numberMandatory;
	}

	/**
	 * @return The number of encountered No values.
	 */
	public Integer getNbDeadValue() {
		return _numberDead;
	}

	/**
	 * @return The number of encountered textual values.
	 */
	public Integer getNbTextualValue() {
		return _numberTextual;
	}

	/**
	 * 
	 * @return
	 */
	public Set<String> getViewsNameSet() {
		return _viewNameSet;
	}

	public ConversionModel getConversionModel() {
		return _conversionModel;
	}

	/**
	 * @return The number of views.
	 */
	public Integer getNbView() {
		return getViewsNameSet().size();
	}

	/**
	 * Delete an entity among all views.
	 * 
	 * @param entityName
	 *            Entity to remove.
	 * @return True if the operation was a success. False otherwise.
	 */
	public Boolean deleteEntity(String entityName) {
		try {
			if (constructFMbyEntity().remove("fm_" + entityName) == null)
				return false;
			Iterator<String> viewNamesIterator = getViewsNameSet().iterator();
			while (viewNamesIterator.hasNext())
				deleteViewEntity(entityName, viewNamesIterator.next());
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * Delete an entity for a given entity.
	 * 
	 * @param entityName
	 *            Entity name to delete.
	 * @param viewName
	 *            Concerned view name.
	 * @return True if the operation was a success. False otherwise.
	 */
	public Boolean deleteViewEntity(String entityName, String viewName) {
		try {
			if (collectVariableViews().remove(entityName + "_" + viewName) == null)
				return false;

			Boolean tm = false;
			Iterator<String> it = _viewNameSet.iterator();
			while (it.hasNext()) {
				viewName = it.next();
				tm = tm || collectVariableViews().containsKey(entityName + "_" + viewName);
			}
			if (!tm)
				constructFMbyEntity().remove("fm_" + entityName);

			return true;
		} catch (ErrorInFMLConversion e) {
			e.printStackTrace();
		}
		return true;
	}

	/*
	 * _mandatoryValues = new HashSet<String>();
	 * _mandatoryValues.add("YES");
	 * _optionalValues = new HashSet<String>();
	 * _optionalValues.add("N_A");
	 * _optionalValues.add("OPT");
	 * _optionalValues.add("OPTIONAL");
	 * _deadValues = new HashSet<String>();
	 * _deadValues.add("NO");
	 */
	/**
	 * Default Mandatory value is : YES <br />
	 * Case insensitive!<br />
	 * Please use naming convention of FAMILIAR : letter first (better upper
	 * letter) and no special character as : space, "'"(������! ... But underscore
	 * is accepted.
	 * 
	 * @param mandatoryValues
	 *            A set of different String values that represent a Mandatory
	 *            characteristic in the data (values).
	 */
	public void setBehaviourMandatoryValues(Set<String> mandatoryValues) {
		_mandatoryValues = mandatoryValues;
	}

	/**
	 * Default Optional values are : N_A, OPT, OPTIONAL<br />
	 * Case insensitive!<br />
	 * Please use naming convention of FAMILIAR : letter first (better upper
	 * letter) and no special character as : space, "'"(������! ... But underscore
	 * is accepted.
	 * 
	 * @param optionalValues
	 *            A set of different String values that represent an Optional
	 *            characteristic in the data (values).
	 */
	public void setBehaviourOptionalValues(Set<String> optionalValues) {
		_optionalValues = optionalValues;
	}

	/**
	 * A dead characteristic means that that characteristic is present in the
	 * feature model but can't be selected. Semantically speaking, that
	 * construction is useful.<br />
	 * <br />
	 * Default Optional values are : No<br />
	 * Case insensitive!<br />
	 * Please use naming convention of FAMILIAR : letter first (better upper
	 * letter) and no special character as : space, "'"(������! ... But underscore
	 * is accepted.<br />
	 * 
	 * @param optionalValues
	 *            A set of different String values that represent a Dead
	 *            characteristic in the data (values).
	 */
	public void setBehaviourDeadValues(Set<String> deadValues) {
		_deadValues = deadValues;
	}

	/**
	 * @param finalMerge
	 *            True = Make the final merge.
	 */
	public void setFinalMerge(Boolean finalMerge) {
		_noFinalMerge = !finalMerge;
	}

	/**
	 * @return The step 1 FAMILIAR tmp script converted to a String.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion. Please
	 *             refer to e.getMessage() for more information.
	 */
	public String step1ToString() throws ErrorInFMLConversion {
		Iterator<String> tmp2 = this.collectVariableViews().keySet().iterator();
		String out = "";
		String tmp;
		while (tmp2.hasNext()) {
			tmp = tmp2.next();
			out = out + tmp + " = " + this.collectVariableViews().get(tmp) + System.getProperty("line.separator")
					+ System.getProperty("line.separator");
		}
		return out;
	}

	/**
	 * @return The step 2 FAMILIAR tmp script converted to a String.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion. Please
	 *             refer to e.getMessage() for more information.
	 */
	public String step2ToString() throws ErrorInFMLConversion {
		Iterator<String> tmp3 = constructFMbyEntity().keySet().iterator();
		String out = "";
		String tmp;
		while (tmp3.hasNext()) {
			tmp = tmp3.next();
			out = out + tmp + " = " + constructFMbyEntity().get(tmp) + System.getProperty("line.separator")
					+ System.getProperty("line.separator");
		}
		return out;
	}

	/**
	 * @return The step 3 FAMILIAR tmp script converted to a String.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion. Please
	 *             refer to e.getMessage() for more information.
	 */
	public String step3ToString() throws ErrorInFMLConversion {
		String out = "";
		if (!_noFinalMerge) {
			if (getNbIdentifierScript() == 1) {
				out = out + "//You are trying to merge an unique feature model in step4. Merge operation ignored."
						+ System.getProperty("line.separator");
			} else {
				Iterator<String> tmp4 = mergeAllFMs().iterator();
				String tmp;
				while (tmp4.hasNext()) {
					tmp = tmp4.next();
					out = out + tmp + System.getProperty("line.separator");
				}
			}
		}
		return out;
	}

	/**
	 * @return The complete FAMILIAR tmp script.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion. Please
	 *             refer to e.getMessage() for more information.
	 */
	public String getFinalFAMILIARScript() throws ErrorInFMLConversion {
		if (_scriptFAMILIAR.compareTo("") == 0) {
			_scriptFAMILIAR = this.step1ToString() + this.step2ToString() + this.step3ToString();
		}
		return _scriptFAMILIAR;
	}
	
	private Map<String,String> filterMapKeyContains(String containedString, Map<String, String> toFilter){
		Map<String, String> out = new HashMap<String, String>();
		Iterator<String> keyIT = toFilter.keySet().iterator();
		String key;
		while(keyIT.hasNext()){
			key = keyIT.next();
			if(key.contains(containedString))
				out.put(key, toFilter.get(key));
		}
		return out;
	}

	public String getFinalFAMILIARScriptOrdered(Boolean removeVariable) throws ErrorInFMLConversion {
		if (_scriptFAMILIAR.compareTo("") == 0) {
			Map<String, String> step1Script = collectVariableViews();
			Map<String, String> step2Script = constructFMbyEntity();
			Iterator<String> step3Script = mergeAllFMs().iterator();
			Iterator<String> iter = _identifiors.keySet().iterator();
			String entityName;
			Map<String, String> step1EntityGroupScript;
			Iterator<String> keySet;
			String step1Key;
			// for each entity name
			String removesInstr;
			while (iter.hasNext()) {
				entityName = iter.next();
				step1EntityGroupScript = filterMapKeyContains(entityName + "_", step1Script);
				keySet = step1EntityGroupScript.keySet().iterator();
				step1Key = "";
				removesInstr = "";
				while(keySet.hasNext()){
					step1Key = keySet.next();
					removesInstr = removesInstr + "removeVariable " + step1Key  + System.getProperty("line.separator");
					_scriptFAMILIAR = _scriptFAMILIAR + step1Key + " = " + step1EntityGroupScript.get(step1Key) + System.getProperty("line.separator");
				}
				_scriptFAMILIAR = _scriptFAMILIAR + "fm_" + entityName + " = " +  step2Script.get("fm_" + entityName) + System.getProperty("line.separator");
				if(removeVariable)
				_scriptFAMILIAR = _scriptFAMILIAR + removesInstr + System.getProperty("line.separator");
			}
			
			String tmp;
			while(step3Script.hasNext()){
				tmp = step3Script.next();
				_scriptFAMILIAR = _scriptFAMILIAR + tmp + System.getProperty("line.separator");
			}
		}
		return _scriptFAMILIAR;
	}

	/**
	 * @return The complete FAMILIAR tmp script without the merging at the end
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion. Please
	 *             refer to e.getMessage() for more information.
	 */
	public String getFinalFAMILIARScriptWithoutFinalMerging() throws ErrorInFMLConversion {
		if (_scriptFAMILIAR.compareTo("") != 0)
			return _scriptFAMILIAR;
		_scriptFAMILIAR = this.step1ToString() + this.step2ToString();
		return _scriptFAMILIAR;
	}
	
	/**
	 * @return String representation of the final feature model resulting of the
	 *         script generated.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was a problem during the conversion or
	 *             parsing the final script to get the final Feature Model.
	 */
	
	public String getFinalFeatureModel(Boolean verbose) throws ErrorInFMLConversion {
		return getFinalFeatureModel(verbose, FMLShell.instantiateStandalone(System.in));
	}

	/**
	 * @param shell to parse the 
	 * @return String representation of the final feature model resulting of the
	 *         script generated.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was a problem during the conversion or
	 *             parsing the final script to get the final Feature Model.
	 */
	public String getFinalFeatureModel(Boolean verbose, FMLShell shell) throws ErrorInFMLConversion {
		if (_noFinalMerge)
			throw new ErrorInFMLConversion(
					"You ask for the final feature model, but you specified you didn't wanted the final fm to be merged.");
		if (getNbIdentifierScript() == 1)
			return "//You are trying to merge an unique feature model in step4. Merge operation ignored.";

		if (_finalFM.compareTo("") != 0)
			return _finalFM;
		
		shell.setVerbose(verbose);
		FeatureModelVariable finalFM = null;
		if (!_skeletonOptimisation) {
			try {
				shell.parse(getFinalFAMILIARScript());
				finalFM = (FeatureModelVariable) shell.getCurrentEnv().getVariable("finalFM");
			} catch (Exception e) {
				throw new ErrorInFMLConversion(e);
			}

			/*
			 * // for SPLOT conversion test
			 * shell.parse(getFinalFAMILIARScript());
			 * shell.parse("finalSPLOT = convert finalFM into SPLOT");
			 * StringVariable finalFIDE = null; try { FMLCommandInterpreter
			 * _environment = null; finalFIDE = (StringVariable)
			 * shell.getCurrentEnv().getVariable("finalSPLOT"); } catch
			 * (Exception e) { throw new ErrorInFMLConversion(e); } _finalFM
			 * =finalFIDE.getVal();
			 */
			/*
			 * shell.parse(getFinalFAMILIARScript()); FeatureModelVariable
			 * finalFIDE = null; try { FMLCommandInterpreter _environment =
			 * null; finalFIDE = (FeatureModelVariable)
			 * shell.getCurrentEnv().getVariable("finalFM"); } catch (Exception
			 * e) { throw new ErrorInFMLConversion(e); } _finalFM
			 * =finalFIDE.toDOT();
			 */
			// return finalFIDE.getVal();

			_finalFM = "FM(" + finalFM.getSpecificValue() + ")";
		} else {
			// TODO test
			Iterator<String> iter = _identifiantScriptStep2.keySet().iterator();
			String identifior;
			List<FeatureModel<String>> identifierList = new ArrayList<FeatureModel<String>>();
			FeatureModel<String> identifierFM = null;
			List<FeatureModelVariable> lfmvs = new ArrayList<FeatureModelVariable>();
			try {
				shell.parse(getFinalFAMILIARScript() + System.getProperty("line.separator") + "skeletonFM = "
						+ getSkeleton().toFMLFeatureModel());
				while (iter.hasNext()) {
					identifior = iter.next();
					FeatureModelVariable fmv = ((FeatureModelVariable) shell.getCurrentEnv().getVariable(identifior));
					lfmvs.add(fmv);
					
					identifierFM = fmv.getFm();
					identifierList.add(identifierFM);
				}
				//FeatureModelVariable skeletonVar = (FeatureModelVariable) shell.getCurrentEnv().getVariable("skeletonFM");
				
				
				
				FeatureModelVariable mergedFM = new FMLMergerBDD(lfmvs, FDOverApproximationStrategy.SYNCHRONIZED_FLA).mergeFMs(Mode.StrictUnion);//, true);
				mergedFM.setIdentifier("skeletonFM") ; 
				return mergedFM.getSyntacticalRepresentationWithoutCst();
			}
				
//				Formula<String> formulaMerged = FMLCommandInterpreter.getMerger().mergeFM(identifierList, Mode.StrictUnion);
//				Formula<String> formulaSkeleton = skeletonVar.getFormula();
//				Formula<String> diffFormula = MergeAnalyzer.diff(formulaMerged, formulaSkeleton);
//
//				// input: fmv (le FM squelette)
//				// diffFormula: la formule que tu as calcul��� pour le diff
//
//				AllConfigsBDD allBDD = new AllConfigsBDD(FMLCommandInterpreter.getBuilder());
//				Set<Set<String>> sols = allBDD.process(diffFormula);
//				Set<Expression<String>> sexpr = new HashSet<Expression<String>>();
//				for (Set<String> sol : sols) {
//					Set<FeatureNode<String>> fnodes = new HashSet<FeatureNode<String>>();
//					for (String fsol : sol) {
//						fnodes.add(skeletonVar.getFm().getDiagram().findVertex(fsol));
//					}
//					Expression<String> esol = MergeAnalyzer.mkCNF(fnodes);
//					esol = esol.not();
//					Set<String> ftsNotIn = new HashSet<String>(skeletonVar.getFm().features());
//					ftsNotIn.removeAll(sol);
//					// FMLShell.getInstance().printDebugMessage("ftsNotIn=" +
//					// ftsNotIn);
//					Expression<String> eNotIn = new Expression<String>(ExpressionType.TRUE);
//					for (String ftNotIn : ftsNotIn) {
//						eNotIn = eNotIn.and(new Expression<String>(ExpressionType.NOT, ftNotIn, null));
//					}
//					sexpr.add(new Expression<String>(ExpressionType.IMPLIES, eNotIn, esol));
//				}
//				Expression<String> diffExpression = MergeAnalyzer.mkConjunction(sexpr);
//				skeletonVar.getFm().addConstraint(diffExpression);
//				for (Expression<String> expression : sexpr) {
//					if (!skeletonVar.getFm().addConstraint(expression)) {
//						FMLShell.getInstance().printDebugMessage("\t\tOuuuups, constraint implies by the feature model");
//					}
//				}
//				System.out.println("#sexpr=" + sexpr.size());
//				_finalFM = skeletonVar.getFm().toString();
//				System.out.println("#passe");
			catch (Exception e) {
				throw new ErrorInFMLConversion(e);
			}
		}
		return _finalFM;
	}

	/**
	 * Utilitary function.
	 * 
	 * @param path
	 *            Path of the file you want to write in.
	 * @param content
	 *            Content to put in the file.
	 * @return True if the file was correctly written. False otherwise.
	 */
	protected Boolean writeToFile(String path, String content) {
		try {
			// Create file
			FileWriter fstream = new FileWriter(path);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(content);
			// Close the output stream
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Write the final FAMILIAR script to the file <i>path</i>.
	 * 
	 * @param path
	 *            Path of the file you want to write in.
	 * @return True if the final FAMILIAR script is written to the specified
	 *         file. False otherwise.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion.
	 */
	public Boolean writeFinalFAMILIARScriptToFile(String path) throws ErrorInFMLConversion {
		return writeToFile(path, getFinalFAMILIARScript());
	}

	/**
	 * Write the skeleton feature model to the file path. This feature model
	 * will be put into the skeletonFeatureModelName FAMILIAR variable.
	 * 
	 * @param path
	 *            Path to the file you want to write in.
	 * @param skeletonFeatureModelName
	 *            Name that will have the skeleton feature model.
	 * @return True in case of success. False otherwise.
	 */
	public Boolean writerSkeletonToFile(String path, String skeletonFeatureModelName) {
		return writeToFile(path, skeletonFeatureModelName + " = " + getSkeleton().toFMLFeatureModel());
	}

	/**
	 * Write the final FAMILIAR feature model with the name <i>varName</i> to
	 * the file <i>path</i>.
	 * 
	 * @param path
	 *            Path of the file you want to write in.
	 * @param varName
	 *            Name to give to the final feature model.
	 * @return True if the final feature model is written to the specified file.
	 *         False otherwise.
	 * @throws ErrorInFMLConversion
	 *             Thrown if there was an error during the conversion.
	 */
	public Boolean writeFinalFeatureModelToFile(String path, String varName, Boolean verbose, FMLShell shell) throws ErrorInFMLConversion {
		if (varName.compareTo("") == 0)
			throw new ErrorInFMLConversion("Invalid varName input!");
		return writeToFile(path, makeNameValid(varName) + " = " + getFinalFeatureModel(verbose, shell));
	}
	
	public Boolean writeFinalFeatureModelToFile(String path, String varName, Boolean verbose) throws ErrorInFMLConversion {
		return writeFinalFeatureModelToFile(path, varName, verbose, FMLShell.instantiateStandalone(System.in));
	}
	
	/*
	 * added by Taran
	 * AM: very bad idea to re-execute the FAMILIAR script!
	 */
	@Deprecated
	public FeatureModelVariable getFinalFM(String name) throws VariableNotExistingException, VariableAmbigousConflictException, ErrorInFMLConversion {
		FMLShell shell = FMLShell.instantiateStandalone(System.in);
		shell.parse(getFinalFAMILIARScript());
		return (FeatureModelVariable) shell.getCurrentEnv().getVariable(name);
	}

	

	/**
	 * Show a bench of stats to the console.
	 */
	public void showStats() {
		int ent = getConversionModel().getTotalEntity();
		int dim = getConversionModel().getTotalDimension();
		System.out.println("-Base");
		System.out.println("#Files : " + getConversionModel().getTotalView());
		System.out.println("#Dimension : " + getConversionModel().getTotalDimension());
		System.out.println("#Rows : " + getConversionModel().getTotalRows());
		System.out.println("#Entity : " + ent);
		System.out.println("#Values : " + getConversionModel().getTotalDimension() * ent);
		System.out.println();
		int entity = getConversionModel().getTotalEntity();
		System.out.println("-filtered");
		System.out.println("#Files : " + getConversionModel().getTotalFilteredView());
		System.out.println("#Label : " + getConversionModel().getTotalFilteredDimension());
		System.out.println("#Values : " + ((ent * dim) - (getConversionModel().getTotalDimension() * entity)));
		System.out.println("#Replaced Values : " + getConversionModel().getTotalReplacedValues());
		System.out.println("-kept");
		System.out.println("#View : " + getConversionModel().getTotalView());
		System.out.println("#Dimension : " + getConversionModel().getTotalDimension());
		System.out.println("#Rows : " + getConversionModel().getTotalRows());
		System.out.println("#Values : " + (getConversionModel().getTotalDimension() * entity));
		System.out.println();
		System.out.println("--FML--");
		System.out.println("#Different Features : " + getNameSpaceSize());
		System.out.println("#Step 1 Entries FMs : " + getNumberEntriesFeatureModel());
		System.out.println("#Step 2 Entity FMs : " + getNbIdentifierScript());
		System.out.println("#Step 3 lines : " + getNbLineScriptFinalStep());
		System.out.println("-Values");
		System.out.println("#Yes : " + getNbMandatoryValue());
		System.out.println("#No : " + getNbDeadValue());
		System.out.println("#N/A : " + getNbOptionalValue());
		System.out.println("#Special Values : " + getNbTextualValue());
		System.out.println("Total : " + (getNbMandatoryValue() + getNbDeadValue() + getNbOptionalValue() + getNbTextualValue()));
		System.out.println();

	}

	public void deactivateShowID() {
		_showID = false; 		
	}
	
	public Set <String> getOptValues() {
		return _optionalValues;
	}
	
	public Set <String> getDeadValues() {
		return _deadValues;
	}

	/**
	 * Compose Xor-groups for moved multivalues
	 * 
	 * @param tmpSubProduction
	 *            Passed by reference. First productions of the associated FM.
	 * @param tmpProd
	 *            Passed by reference. Sub-productions of the associated FM.
	 *            the FM.
	 * @param tmpConstraint
	 *            Passed by reference. Constraints of the associated FM.
	 *            FM.
	 *            
	 * remark: there is no multivalues in table inside content (except of "Xor" values)
	 */
	private void composeMultivaluesXorGroups(StringBuilder tmpSubProduction, StringBuilder tmpProd) {
		Map<Integer, Vector<String>> xorGroups = new HashMap<Integer, Vector<String>>();		//<labelId, xor-group>
		String[] prod = null;
		String[] array = null;
		Integer key = -1;
		Vector<String> multivalues = null;

		prod = tmpProd.toString().split(" ; ");
		
		//form xor-groups for moved multivalues
		for(int i = 0 ; i < prod.length ; i++ ) {
			multivalues = new Vector<String>();
			array = prod[i].split(" : ");
			if(array.length > 1) {
				key = new Integer(array[1].split("_")[0].substring(1));
				//check whether there is multivalue(s) corresponding to the dimension or not
				if(xorGroups.containsKey(key)) {
					multivalues = xorGroups.get(key);
					multivalues.add(array[0]);
					xorGroups.remove(key);
					xorGroups.put(key, multivalues);
				} else {
					multivalues.add(array[0]);
					xorGroups.put(key, multivalues);
				}
			}
		}
		//System.out.println(xorGroups);
				
		//attach formed xor-groups
		Set<Integer> keys = xorGroups.keySet();
		Iterator<Integer> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			key = keysIt.next();
			if(xorGroups.get(key).size() > 1) {
				multivalues = xorGroups.get(key);
				for(int i = 0 ; i < multivalues.size() ; i++ ) {
					if(i==0) tmpSubProduction.append(" (" + multivalues.get(i));
					else tmpSubProduction.append("|" + multivalues.get(i));
					
					//remove a multivalue since now it is combined in the group
					tmpSubProduction.delete(tmpSubProduction.lastIndexOf(" " + multivalues.get(i) + " "), tmpSubProduction.lastIndexOf(" " + multivalues.get(i) + " ")+multivalues.get(i).length()+1);
				}
				tmpSubProduction.append(")");
			}
		}
				
		//clear third level productions
		tmpProd.delete(0, tmpProd.length());
	}
	
	public void setMultivaluesMovement(boolean flag) {
		multivaluesMovement = flag;
	}
	
	public ValueMode getValueModePublic(String value) {
		return getValueMode(value);
	}
}
