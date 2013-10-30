package CSVtoFML;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.VariCellStandaloneSetup;
import org.xtext.example.mydsl.variCell.DataView;
import org.xtext.example.mydsl.variCell.Default;
import org.xtext.example.mydsl.variCell.ExceptFeature;
import org.xtext.example.mydsl.variCell.ExceptProduct;
import org.xtext.example.mydsl.variCell.FeatureInclusionExclusion;
import org.xtext.example.mydsl.variCell.ImportViews;
import org.xtext.example.mydsl.variCell.ItemRelation;
import org.xtext.example.mydsl.variCell.Key;
import org.xtext.example.mydsl.variCell.KindRelation;
import org.xtext.example.mydsl.variCell.Mandatory;
import org.xtext.example.mydsl.variCell.OnlyFeature;
import org.xtext.example.mydsl.variCell.OnlyProduct;
import org.xtext.example.mydsl.variCell.ParsingConfiguration;
import org.xtext.example.mydsl.variCell.ProductInclusionExclusion;
import org.xtext.example.mydsl.variCell.Rewriting;
import org.xtext.example.mydsl.variCell.SToFMModel;
import org.xtext.example.mydsl.variCell.ScopingFeatures;
import org.xtext.example.mydsl.variCell.ScopingProducts;
import org.xtext.example.mydsl.variCell.ScopingView;
import org.xtext.example.mydsl.variCell.StructuringInformation;
import org.xtext.example.mydsl.variCell.SyntacticalInterpretation;

import Exceptions.ErrorInFMLConversion;
import Exceptions.NotValidCSVFileException;

import com.google.inject.Injector;

/**
 * @author mathieuacher Domain-Specific Language for extracting feature models
 *         from sources (e.g., CSV)
 */

public class StoFMLReader {

	public static final String FILE_EXTENSION = "varicell" ; //"stofm";
	
	/**
	 * Xtext facilities to parse
	 */
	private Injector _injector;
	private Resource _resource;
	private XtextResourceSet _resourceSet;

	/**
	 * the model to analyze (Xtext creates the model object)
	 */
	private SToFMModel _model;
	
	
	/**
	 * conversion model to be populated 
	 */
	private ConversionModel _cm ; 
	
	

	public StoFMLReader() {
	
	}

	/**
	 * @param instrs
	 * @throws IOException
	 * @throws ErrorInFMLConversion
	 * @throws NotValidCSVFileException
	 * @throws StoFMException
	 */
	public FMLConvert execute(String instrs) throws IOException,
			NotValidCSVFileException, ErrorInFMLConversion, StoFMException {

		/***** 1. XText facilities to parse and populate the StoFM model *****/

		_injector = new VariCellStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		_resourceSet = _injector.getInstance(XtextResourceSet.class);
		_resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		_resource = _resourceSet.createResource(URI.createURI("dummy:/example"+ Math.abs(new Random().nextInt())
				+ "." + FILE_EXTENSION));
	

		// I/O errors
		if (_resource == null)
			throw new IOException("Unable to create the resource ");
		InputStream in = new ByteArrayInputStream(instrs.getBytes());
		// I/O errors
		try {
			_resource.load(in, _resourceSet.getLoadOptions());
		} catch (IOException e) {
			throw e;
		}

		// syntactic errors
		if (_resource.getErrors().size() > 0) {
			System.err.println("parsing errors "
					+ _resource.getErrors().toString()); // better
			return null;
		}

		if (_resource.getContents().size() == 0) {
			System.err.println("Warning: no command");
			return null;
		}

		/***** 2. at this step we can actually analyze the model *****/

		_model = (SToFMModel) _resource.getContents().get(0);
		return execute();

	}

	/**
	 * @param model
	 * @throws FileNotFoundException
	 * @throws NotValidCSVFileException
	 * @throws ErrorInFMLConversion
	 * @throws StoFMException
	 */
	public FMLConvert execute() throws FileNotFoundException,
			NotValidCSVFileException, ErrorInFMLConversion, StoFMException {
		
		
		String rootFeatureName = _model.getSplName().getName();

		// we want to populate a conversion model that contains all views (aka
		// ConversionModelArray)
		_cm = new ConversionModel(rootFeatureName);

		// apply to each view but can be overriden by directives related to a
		// specific view
		
		String sep = CSVParser.DEFAULT_SEPARATOR;
		String identifier = null; // currently, we obliged the user to specify
									// the identifier (TODO: (1) default
									// solution (2) can be overriden for each
									// view!)
		String defaultCharacter = CSVParser.DEFAULT_EMPTY_VALUE; // TODO: could be parameterized by the DSL
		Default df = _model.getDefault();
				
		if (df != null) {
			
			ParsingConfiguration pc = df.getConfigs();
			if (pc != null) {
				
			
				
				if (pc.getSeparator() != null)
					sep = pc.getSeparator().getSep();

				Key key = pc.getProductID();
				if (key != null) {
					EList<String> keys = key.getCid();
					identifier = keys.get(0); // just get the first key
				} else
					throw new StoFMException("Unknown key=" + key
							+ " not currently managed");
			}
	
		}
		
		if (identifier == null)
			throw new StoFMException("The key has not been specified!");
		
		// for each view
		ImportViews imp = _model.getImportViews();
		EList<DataView> views = imp.getViews();
		for (DataView dataView : views) {
			FileReader fileReader = new FileReader(dataView.getFile());
			String viewName = dataView.getViewname();
			

			// TODO: for each view, some directives can be specified
			CSVParser parser = new CSVParser(fileReader, sep, viewName,
					defaultCharacter, identifier);
			_cm.addView(parser);

			ScopingView sview = getScopingView(viewName);
			if (sview != null) {
				ScopingFeatures fts = sview.getFts();

				if (fts != null) {

					if (!(fts instanceof FeatureInclusionExclusion))
						throw new StoFMException(
								"Unknown scoping instruction fts=" + fts);

					FeatureInclusionExclusion ftsI = (FeatureInclusionExclusion) fts;
					ExceptFeature exceptFts = ftsI.getExcept();
					if (exceptFts != null) {
						EList<String> excepts = exceptFts.getFts();
						for (String exft : excepts) {
							if (!parser.filterColumn(exft))
								throw new StoFMException("Unknown feature "
										+ exft + " for view " + sview.getView());

						}
					}
					OnlyFeature onlyFts = ftsI.getOnly();
					if (onlyFts != null) {
						EList<String> onlys = onlyFts.getFts();
						if (!parser.filterKeepOnlyColumns(onlys))
							throw new StoFMException("Unknown features " + onlys);

					}

				}
				
				Rewriting rw = sview.getAlignment();
				if (rw != null) {
					
					String originalFt = rw.getOft() ;
					String newFt = rw.getNft() ;
					
					if (!parser.renameLabel(originalFt, newFt))
						throw new StoFMException("Cannot rename feature " + originalFt + " with " + newFt);
					
				}

			}
		}


		
		// TODO: refactoring
		if (df != null) {
			// same here
			ScopingProducts pdts = df.getProducts();

			if (pdts != null) {

				if (!(pdts instanceof ProductInclusionExclusion))
					throw new StoFMException("Unknown product instruction pdts="
							+ pdts);

				ProductInclusionExclusion pdtsI = (ProductInclusionExclusion) pdts;
				ExceptProduct exceptPdts = pdtsI.getExcept();
				if (exceptPdts != null) {
					EList<String> excepts = exceptPdts.getPds();
					for (String exc : excepts) {
						if (!_cm.filterEntity(exc))
							throw new StoFMException("Unknown product " + exc);

					}
				}
				OnlyProduct onlyPdts = pdtsI.getOnly();
				if (onlyPdts != null) {
					EList<String> onlys = onlyPdts.getPds();
					if (!_cm.filterKeepOnlyEntities(onlys))
						throw new StoFMException("Unknown products " + onlys);

				}

			}
			
		}
		
		StructuringInformation struct = _model.getSchema() ;
		if (struct != null) 
			parseStructuringInformation(struct);
		
		
		
		FMLConvert fmlConvert = new FMLConvert(_cm);
		
		// another pass (refactor)
		if (df != null) {
			ParsingConfiguration pc = df.getConfigs();
			if (pc != null) {
				SyntacticalInterpretation variabilityInterpret = pc.getSinterpret() ; // should work for views too
				if (variabilityInterpret != null) {
					Mandatory mand = variabilityInterpret.getYes();
					EList<String> mandValues = mand.getValues() ;
					System.out.println("====== mandValues=" + mandValues);
					fmlConvert.setBehaviourMandatoryValues(new HashSet<String>(mandValues)); // override?
				}
			}
		}

		// TODO: composed here
		return fmlConvert;

	}
	

	private void parseStructuringInformation(StructuringInformation struct) throws StoFMException {
		
		
		assert (struct != null);
		
		EList<ItemRelation> irels = struct.getRelations();
		for (ItemRelation irel : irels) {
			String view1 = irel.getView1();
			String view2 = irel.getView2();
			KindRelation rel = irel.getRel();
			
			if (rel == KindRelation.MOVE) {
				ConversionModelArray cma1 = _cm.getView(view1);
				ConversionModelArray cma2 = _cm.getView(view2);
				
				if (!cma2.aggregateWith(cma1)) 
					throw new StoFMException("Unable to move " + view1 + " in " + view2);
				
				// we remove the view
				if (!_cm.filterView(view1))
					throw new StoFMException("Unknown view " + view1 + " to move in");
				
			}
			else if (rel == KindRelation.COPY) {
				ConversionModelArray cma1 = _cm.getView(view1);
				ConversionModelArray cma2 = _cm.getView(view2);
				
				if (!cma2.aggregateWith(cma1)) 
					throw new StoFMException("Unable to copy " + view1 + " in " + view2);
				
				// contrary to moveIn, we do not remove the view
				
			}
			
			
			/*
			 * BELOW or ABOVE => move!
			 * 
			 */
			else if (rel == KindRelation.BELOW) {
				ConversionModelArray cma1 = _cm.getView(view1);
				ConversionModelArray cma2 = _cm.getView(view2);
				
				
				
				if (!cma2.addSubView(cma1)) 
					throw new StoFMException("Unable to move " + view1 + " below " + view2);
				
				// we remove the view
				if (!_cm.filterView(view1))
					throw new StoFMException("Unknown view " + view1 + " to move in");
				
			}
			
			else if (rel == KindRelation.ABOVE) {
				ConversionModelArray cma1 = _cm.getView(view1);
				ConversionModelArray cma2 = _cm.getView(view2);
				
				
				
				if (!cma1.addSubView(cma2)) 
					throw new StoFMException("Unable to move " + view1 + " above " + view2);
				
				// we remove the view
				if (!_cm.filterView(view2))
					throw new StoFMException("Unknown view " + view1 + " to move in");
				
			}
			
			else 
				throw new StoFMException("Unknown relation: " + rel + " (or currently unsupported");
						
		}
		
	}

	/**
	 * @param viewName
	 *            identifier of the view
	 * @return the view "block" (i.e., set of instructions) that describes the
	 *         view with identifier viewName null otherwise
	 */
	private ScopingView getScopingView(String viewName) {
		EList<ScopingView> sviews = _model.getScoping();
		for (ScopingView sview : sviews) {
			if (sview.getView().equals(viewName))
				return sview;
		}
		return null;
	}

	/**
	 * @param file
	 * @return 
	 * @throws IOException
	 * @throws ErrorInFMLConversion
	 * @throws NotValidCSVFileException
	 * @throws StoFMException
	 */
	public FMLConvert execute(File file) throws IOException,
			NotValidCSVFileException, ErrorInFMLConversion, StoFMException {

		BufferedReader br = new BufferedReader(new FileReader(file));
		String buff = "";
		StringBuilder sb = new StringBuilder();
		while ((buff = br.readLine()) != null) {
			sb.append(buff + System.getProperty("line.separator"));
		} // end while

		return execute(sb.toString());

	}

}
