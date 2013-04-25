package test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dk.itu.fms.formula.Clause;
import dk.itu.fms.formula.Formula;
import dk.itu.fms.formula.cnf.CNF;
import dk.itu.fms.formula.cnf.VariableElimination;
import fr.unice.polytech.modalis.familiar.experimental.FGroup;
import fr.unice.polytech.modalis.familiar.experimental.OrGroup;
import fr.unice.polytech.modalis.familiar.operations.featureide.SATFMLFormula;
import fr.unice.polytech.modalis.familiar.parser.FMBuilder;
import fr.unice.polytech.modalis.familiar.test.FMLTest;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.graph.ImplicationGraph;
import gsd.synthesis.FeatureNode;

public class CNFElimTest extends FMLTest {
	
	@Test
	public void simpleOr() throws Exception {
		FeatureModelVariable fm1 = FM ("fm1", "A : (B|C|D)+ E ; E : (F|G)+ ; C : (H|I|J)+ ; ");
		Set<FGroup> or1 = fm1.computeOrGroups() ;
		System.err.println("or1=" + or1);
		
		ImplicationGraph<String> ig1 = fm1.computeImplicationGraph() ;				
		String dimacs1 = new SATFMLFormula(fm1).toDIMACS() ;
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF cnf1 = dimacsReader.parse(dimacs1);
		
		
		Set<OrGroup> pOrGroupsC = _getPotentialOrGroups("C", fm1); // more natural
		System.err.println("pOrgroupsC=" + pOrGroupsC);
		//Set<Clause> or1bis = cnf1.getOrGroups(v);
		

		Set<OrGroup> pOrGroupsA = _getPotentialOrGroups("A", fm1, cnf1, ig1, dimacsReader); // when you want to get "potential" many times (avoid the recomputation)
		System.err.println("pOrgroupsA=" + pOrGroupsA);
		
		System.err.println("pOrgroupsE=" + _getPotentialOrGroups("E", fm1, cnf1, ig1, dimacsReader));
		System.err.println("pOrgroupsE=" + _getPotentialOrGroups("C", fm1, cnf1, ig1, dimacsReader));
				
	}
	
	@Test
	public void simpleOr2() throws Exception {
		FeatureModelVariable fm1 = FM ("fm1", "A : (B|C|D)+ E ; E : (F|G) ; F : (H|I|J)+ ; "); // FIXME: F and G form an Or-group yep, but there are actually Xor since mutually exclusive
		Set<FGroup> or1 = fm1.computeOrGroups() ;
		System.err.println("or1=" + or1);
		
		ImplicationGraph<String> ig1 = fm1.computeImplicationGraph() ;				
		String dimacs1 = new SATFMLFormula(fm1).toDIMACS() ;
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF cnf1 = dimacsReader.parse(dimacs1);
		
		
		Set<OrGroup> pOrGroupsC = _getPotentialOrGroups("C", fm1); // more natural
		System.err.println("pOrgroupsC=" + pOrGroupsC);
		//Set<Clause> or1bis = cnf1.getOrGroups(v);
		

		Set<OrGroup> pOrGroupsA = _getPotentialOrGroups("A", fm1, cnf1, ig1, dimacsReader); // when you want to get "potential" many times (avoid the recomputation)
		System.err.println("pOrgroupsA=" + pOrGroupsA);
		
		System.err.println("pOrgroupsE=" + _getPotentialOrGroups("E", fm1, cnf1, ig1, dimacsReader));
		System.err.println("pOrgroupsE=" + _getPotentialOrGroups("C", fm1, cnf1, ig1, dimacsReader));
				
	}
	
	@Test
	public void simpleOr3() throws Exception {
		FeatureModelVariable fm1 = FM ("fm1", "A : (B|C|D)+ E ; E : (F|G) ; F : (H|I|J) ; "); // Xor-groups can form Or-groups here
		Set<FGroup> or1 = fm1.computeOrGroups() ;
		System.err.println("or1=" + or1);
		
		ImplicationGraph<String> ig1 = fm1.computeImplicationGraph() ;				
		String dimacs1 = new SATFMLFormula(fm1).toDIMACS() ;
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF cnf1 = dimacsReader.parse(dimacs1);
		
		
		Set<OrGroup> pOrGroupsC = _getPotentialOrGroups("C", fm1); // more natural
		System.err.println("pOrgroupsC=" + pOrGroupsC);
		//Set<Clause> or1bis = cnf1.getOrGroups(v);
		

		Set<OrGroup> pOrGroupsA = _getPotentialOrGroups("A", fm1, cnf1, ig1, dimacsReader); // when you want to get "potential" many times (avoid the recomputation)
		System.err.println("pOrgroupsA=" + pOrGroupsA);
		
		System.err.println("pOrgroupsE=" + _getPotentialOrGroups("E", fm1, cnf1, ig1, dimacsReader));
		System.err.println("pOrgroupsE=" + _getPotentialOrGroups("C", fm1, cnf1, ig1, dimacsReader));
				
	}
	
	
	
	private Set<OrGroup> _getPotentialOrGroups(String ft, FeatureModelVariable fm1) {
		
		ImplicationGraph<String> ig1 = fm1.computeImplicationGraph() ;				
		String dimacs1 = new SATFMLFormula(fm1).toDIMACS() ;
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF cnf1 = dimacsReader.parse(dimacs1);
		return _getPotentialOrGroups(ft, fm1, cnf1, ig1, dimacsReader);
	}



	public Set<OrGroup> _getPotentialOrGroups(String ft, FeatureModelVariable fm1, CNF cnf1, ImplicationGraph<String> ig1, FMLDimacsReaderCNF dimacsReader) {
	
		Set<String> ptMembers = ig1.children(ft) ; 
			
		Set<String> ftsToRemove = fm1.features().names();
		ftsToRemove.remove(ft);
		ftsToRemove.removeAll(ptMembers);
		
		Set<Integer> toElim = new HashSet<Integer>() ; 
		for (String ftToRemove : ftsToRemove) {
			toElim.add(dimacsReader.getVariable(ftToRemove));
		}		
		
		CNF clone = (CNF) cnf1.eliminateVariables(toElim).clone();
		
		int v = dimacsReader.getVariable(ft);
		Set<Clause> result = clone.getOrGroups(v);
				
		
		Set<OrGroup> potentialOrGroups = new HashSet<OrGroup>() ;
		for (Clause cl : result) {
			Set<Integer> lts = cl.getPositiveLiterals() ;
			Set<FeatureNode<String>> sources = new HashSet<FeatureNode<String>>();
			for (Integer lt : lts) {
				String source = dimacsReader.getVariable(lt) ;
				sources.add(mkFeatureNode(source));
				
			}
			OrGroup or = new OrGroup(sources, new FeatureNode<String>(ft));
			potentialOrGroups.add(or);
		}
		
		return potentialOrGroups ; 
	}
	
	
	private FeatureNode<String> mkFeatureNode(String source) {
		return new FeatureNode<String>(source);
	}

	private CNF mkCNF(FeatureModelVariable fm1) {
		String dimacs1 = new SATFMLFormula(fm1).toDIMACS() ;
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF c = dimacsReader.parse(dimacs1);
		return c ; 
	}

	@Test
	public void simpleCNF() throws Exception {
		
		FeatureModelVariable fm1 = FM ("fm1", "A : B [C] [D] E ; C -> D ; ");
		String dimacs1 = new SATFMLFormula(fm1).toDIMACS() ;
		//System.err.println("dimacs1=" + dimacs1);
		
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF c = dimacsReader.parse(dimacs1);
		
		System.err.println("" + setVariabletoString(fm1.configs()));
		printVarIDs (dimacsReader, fm1);
		boolean b = c.isSatisfiable() ; 
		assertTrue(b);
		System.err.println("b" + b);
		System.err.println("C and D ?" + c.implication(dimacsReader.getVariable("C"), dimacsReader.getVariable("D")));
		System.err.println("D and C ?" + c.implication(dimacsReader.getVariable("D"), dimacsReader.getVariable("C")));
		
		
		System.err.println("c=" + c);
		System.err.println();
		System.err.println();
		
		Set<Integer> vars = mkVars (dimacsReader, "C");
		Formula cPrime = VariableElimination.variableQuantification(c, vars);
		
		System.err.println("c''=" + cPrime);
		
		
		
	
		
		
	}
	
	@Test
	public void linuxCNF () throws Exception {
		
		
		String filename = "/Users/mathieuacher/linux-variability-analysis/linux-variability-analysis-tools.formulas/" +
				//"2.6.32-2var.dimacs")) ; 
				//"freebsd-icse11.dimacs")) ;
				"ecos-icse11.dimacs" ; 
		
		FeatureModelVariable fla1 = (FeatureModelVariable) FMBuilder.parseDimacsWithSAT(
				new File ("/Users/mathieuacher/linux-variability-analysis/linux-variability-analysis-tools.formulas/" +
						//"2.6.32-2var.dimacs")) ; 
						"freebsd-icse11.dimacs")) ;
						//"ecos-icse11.dimacs")) ; 
						//"2.6.28.6-icse11.dimacs"));
		String dimacs1 = new SATFMLFormula(fla1).toDIMACS() ;
		
		FMLDimacsReaderCNF dimacsReader = new FMLDimacsReaderCNF() ; 
		CNF c = dimacsReader.parse(dimacs1);
		
		System.err.println("CNF loaded...");
		//printVarIDs (dimacsReader, fla1);
		System.err.println("valid? " + c.isSatisfiable());
		//System.err.println("" + c.getClauses().length);
		
		/*
		FeatureModelVariable fla1bis = (FeatureModelVariable) FMBuilder.parseDimacsWithSAT(
				new File (filename)) ; 
		
		Comparison cmp = new SATFMLFormula(fla1).compare(new SATFMLFormula(fla1bis));
		
		System.err.println("cmp=" + cmp);*/
				
		
	}

	/** correspondences btw feature name and identifiers (integers) used in DIMACS
	 * @param dimacsReader
	 * @param fm1
	 */
	private void printVarIDs(FMLDimacsReaderCNF dimacsReader, FeatureModelVariable fm1) {
		Set<String> fts = fm1.features().names() ; 
		for (String ft : fts) {
			System.err.println("" + ft + " ==> " + dimacsReader.getVariable(ft));
		}
		
	}

	private Set<Integer> mkVars(FMLDimacsReaderCNF dimacsReader, String... fts) {
		Set<Integer> vars = new HashSet<Integer>();
		
		for (String ft : fts) {
			vars.add(dimacsReader.getVariable(ft));
		}
		
		return vars;
		
	}

}
