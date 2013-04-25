package dk.itu.fms.formula.cnf;

import java.util.HashSet;
import java.util.Set;



public class VariableElimination {
	

	/**
	 * 
	 * @param formula
	 * @param vars : the variables to eliminate.
	 * @return an equisatisfiable formula which does not contain the variables given
	 * by the parameter vars.
	 */
	public static CNF variableElimination(CNF formula, Set<Integer> vars){
		CNF clone = formula.clone();
		for(int i : vars){
			Set<CNFClause> pc = new HashSet<CNFClause>();
			if(clone.getClauseSet(i) != null){
				for(CNFClause c : clone.getClauseSet(i)){
					if(clone.containsClause(c))
						pc.add(new CNFClause(c.getLiterals()));
				}
			}
			Set<CNFClause> nc = new HashSet<CNFClause>();
			if(clone.getClauseSet(-i) != null){
				for(CNFClause c : clone.getClauseSet(-i)){
					if(clone.containsClause(c))
						nc.add(new CNFClause(c.getLiterals()));
				}
			}
			Set<CNFClause> resolvents = new HashSet<CNFClause>();
			for(CNFClause p : pc){
				for(CNFClause n : nc){
					if(!p.resolvesToTautology(n)){
						CNFClause resolvent = p.computeResolvent(n);
						resolvents.add(resolvent);
					}
				}
			}
			clone.removeAllClauses(pc);
			clone.removeAllClauses(nc);
			clone.addAllClauses(resolvents);
		}
		return clone;
	}
	
	/**
	 * 
	 * @param formula
	 * @param vars : the variables to eliminate.
	 * @return an equisatisfiable formula which does not contain the variables given
	 * by the parameter vars (the others are still present contrary to variableElimination).
	 */
	public static CNF variableQuantification(CNF formula, Set<Integer> vars){
		CNF clone = formula.clone();
		for(int i : vars){
			Set<CNFClause> pc = new HashSet<CNFClause>();
			if(clone.getClauseSet(i) != null){
				for(CNFClause c : clone.getClauseSet(i)){
					if(clone.containsClause(c))
						pc.add(new CNFClause(c.getLiterals()));
				}
			}
			Set<CNFClause> nc = new HashSet<CNFClause>();
			if(clone.getClauseSet(-i) != null){
				for(CNFClause c : clone.getClauseSet(-i)){
					if(clone.containsClause(c))
						nc.add(new CNFClause(c.getLiterals()));
				}
			}
			
			System.err.println("nc=" + nc);
			System.err.println("pc=" + pc);
			
			Set<CNFClause> resolvents = new HashSet<CNFClause>();
			for(CNFClause p : pc){
				for(CNFClause n : nc){
					if(!p.resolvesToTautology(n)){
						CNFClause resolvent = p.computeResolvent(n);
						resolvents.add(resolvent);
					}
				}
			}
			clone.removeAllClauses(pc);
			clone.removeAllClauses(nc);
			clone.addAllClauses(resolvents);
		}
		return clone;
	}
	
}
