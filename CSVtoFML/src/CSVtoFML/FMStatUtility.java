package CSVtoFML;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import FeatureName.FeatureName;
import fr.unice.polytech.modalis.familiar.experimental.FGroup;
import fr.unice.polytech.modalis.familiar.interpreter.VariableNotExistingException;
import fr.unice.polytech.modalis.familiar.parser.FMLCommandInterpreter;
import fr.unice.polytech.modalis.familiar.parser.VariableAmbigousConflictException;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.FeatureVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import fr.unice.polytech.modalis.familiar.variable.VariabilityOperatorVariable;
import fr.unice.polytech.modalis.familiar.variable.Variable;
import gsd.synthesis.Expression;

public class FMStatUtility {

	
	
	private FeatureModelVariable _fm;

	public FMStatUtility(FeatureModelVariable fm) {
		_fm = fm ; 
	}
	
	public Double getCrossTreeConstraints() {
		double result = (double) getNumberOfUniqueFeaturesInConstraints()/ _fm.nbFeatures();
		return (double) Math.round(result*1000)/1000;
	}
	
	//counts the number of unique features involved in the FM constraints 
	@SuppressWarnings("null")
	public Integer getNumberOfUniqueFeaturesInConstraints() {
		Iterator <Expression<String>> it = _fm.getAllConstraints().iterator();
		Expression<String> oneConstraint = null;
		ArrayList<String> uniqueFeatures =  new ArrayList<String>();
		Iterator<String> it1 = null;
		Boolean flag;
		String str = "";
		String left = "";		//feature-prerequisite in a constraint
		String right = "";		//feature-production in a constraint
		
		while(it.hasNext()) {
			oneConstraint = it.next();
			
			left = oneConstraint.getLeft().toString();
			right = oneConstraint.getRight().toString();
			if("!".equals(right.substring(0, 1))) right = right.substring(1);
			
			if(uniqueFeatures == null) {
				uniqueFeatures.add(left);
				uniqueFeatures.add(right);
			}
			else {
				//check whether feature-prerequisite has been met before
				flag = false;
				it1 = uniqueFeatures.iterator();
				while(it1.hasNext()) {
					str = it1.next();
					if(str.equals(left)) {
						flag = true;
						break;
					}
				}
				if(!flag) uniqueFeatures.add(left);

				//check whether feature-production has been met before
				flag = false;
				it1 = uniqueFeatures.iterator();
				while(it1.hasNext()) {
					str = it1.next();
					if(str.equals(right)) {
						flag = true;
						break;
					}
				}
				if(!flag) uniqueFeatures.add(right);
			}			
		}
		
		return uniqueFeatures.size();
	}
	
	/*
	 * output: number of mandatory features
	 * root feature does not have an operator
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Integer ManFeaturesNumber() throws Exception {
		String rootFeature = _fm.root().getValue();
		SetVariable features = (SetVariable) _fm.features();
		Set set = features.getVars();
		Iterator<FeatureVariable> it = set.iterator();
		FeatureVariable var = null;
		String command = "";
		Integer nbManFeatures = 0;
		
		while(it.hasNext()) {
			var = it.next();
			String ftName = var.getFtName() ; 
			ftName = FeatureName.quoteNeedsBe(ftName) ; 
			if(!ftName.equals(rootFeature)) {
				command = "\nop = operator " + _fm.getIdentifier() + "." + ftName + "\n";
				Variable op = _fm.getShell().parse(command);
				if(((VariabilityOperatorVariable) op).getFek()==FeatureEdgeKind.MANDATORY)
					nbManFeatures++;
			}
		}
		
		return nbManFeatures;
	}
	
	
	
	public Double getVariabilityRateForMergedFM() {
		double result = (double) 0.0;
		try {
			result = (double) ManFeaturesNumber()/ _fm.nbFeatures();
		} catch (Exception e) {e.printStackTrace();}
		
		result = 1 - result; 
		
		return (double) Math.round(result*1000)/1000;
	}
	
	public Integer getTopFeaturesNumber() throws VariableNotExistingException, VariableAmbigousConflictException {
		FMLCommandInterpreter _environment = null;
		String command = "";
		
		//retrieve number of direct children of the root feature, i.e. top features
		command = "s = children " + _fm.getIdentifier() + "." + _fm.root().getValue();
		_fm.getShell().parse(command);	
		_environment = _fm.getShell().getCurrentEnv();
		
		return ((SetVariable) _environment.getVariable("s")).size();
	}
	
	
	
	public Double getVariabilityRateForIntegratedFM() {
		double result = (double) 0.0;
		Set<FGroup> grMembers = _fm.getGroups();
		Iterator<FGroup> it = grMembers.iterator();
		int sum = 0;
		while(it.hasNext())
			sum += ((FGroup)it.next()).getSources().size();
		try {
			result = (double) (OptFeaturesNumber()- _fm.deads().size()+sum)/(_fm.nbFeatures()- _fm.deads().size());
		} catch (Exception e) {e.printStackTrace();} 
		
		return (double) Math.round(result*1000)/1000;
	}
	
	
	/*
	 * output: number of optional features
	 * root feature does not have an operator
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Integer OptFeaturesNumber() throws Exception {
		FMLCommandInterpreter _environment = null;
		String rootFeature = _fm.root().getValue();
		SetVariable features = (SetVariable) _fm.features();
		Set set = features.getVars();
		Iterator<FeatureVariable> it = set.iterator();
		FeatureVariable var = null;
		String command = "";
		Integer nbOptFeatures = 0;
		
		while(it.hasNext()) {
			var = it.next();
			String ftName = FeatureName.quoteNeedsBe(var.getFtName()) ; 
			if(!ftName.equals(rootFeature)) {
				command = "op = operator " + _fm.getIdentifier() + "." + ftName;
				_fm.getShell().parse(command);	
				_environment = _fm.getShell().getCurrentEnv();
				
				if(((VariabilityOperatorVariable) _environment.getVariable("op")).getFek()==FeatureEdgeKind.OPTIONAL)
					nbOptFeatures++;
			}
		}
		
		return nbOptFeatures;
	}
	
	//counts ratio of variability - the average number of children of the parent nodes (without leaves) in the FM tree
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Double getRatioOfVariability() {
		Set set = _fm.features().getVars();
		Iterator<FeatureVariable> it = set.iterator();
		FeatureVariable var = null;
		Integer sum = 0;
		Integer number = 0;
		
		while(it.hasNext()) {
			var = it.next();
			if(!var.children().isEmpty()) {
				sum += var.children().size();
				number++;
			}
		}
		
		double result = (double) sum/number;
		return (double) Math.round(result*1000)/1000;
	}
		
	//counts ratio of variability for 1st layer features - the average number of children of the 1st layer nodes (root feature - 0 layer)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Double getRatioOfVariabilityForFirstLayerFeatures() {
		Set set = _fm.features().getVars();
		Iterator<FeatureVariable> it = set.iterator();
		FeatureVariable var = null;
		Integer sum = 0;
		Integer number = 0;
		
		while(it.hasNext()) {
			var = it.next();
			if(!var.isRoot() && var.parent().isRoot()) {
				sum += var.children().size();
				number++;
			}
		}
		
		double result = (double) sum/number;
		return (double) Math.round(result*1000)/1000;
	}
		
	//counts ratio of variability for 2nd layer features - the average number of children of the 2nd layer nodes (root feature - 0 layer)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Double getRatioOfVariabilityForSecondLayerFeatures() {
		Set set = _fm.features().getVars();
		Iterator<FeatureVariable> it = set.iterator();
		FeatureVariable var = null;
		Integer sum = 0;
		Integer number = 0;
		
		while(it.hasNext()) {
			var = it.next();
			if(!var.isRoot() && !var.parent().isRoot() && var.parent().parent().isRoot()) {
				sum += var.children().size();
				number++;
			}
		}
		
		double result = (double) sum/number;
		return (double) Math.round(result*1000)/1000;
	}
		
	//counts #children of 3rd layer| - the total number of children of the 3rd layer nodes - multivalues (root feature - 0 layer)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Integer getNbNodesThirdLayer() {
		Set set = _fm.features().getVars();
		Iterator<FeatureVariable> it = set.iterator();
		FeatureVariable var = null;
		Integer sum = 0;
		
		while(it.hasNext()) {
			var = it.next();
			if(!var.isRoot() && !var.parent().isRoot() && var.parent().parent().isRoot())
				sum += var.children().size();
		}
		
		return sum;
	}
	
	public Double getFlexibilityOfConfiguration() throws Exception {
		double result = (double) OptFeaturesNumber()/ _fm.nbFeatures();
		return (double) Math.round(result*1000)/1000;
	}

}
