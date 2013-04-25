package test;




import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import dk.itu.fms.formula.cnf.CNF;
import dk.itu.fms.formula.cnf.CNFClause;
import fr.unice.polytech.modalis.familiar.fm.converter.FMDimacsReader;


/**
 * @author macher
 *
 */
public class FMLDimacsReaderCNF extends FMDimacsReader {
	
	
	private void treatLine(String line, Collection<CNFClause> disjClauses) {
		if (line.startsWith("c")) {
			int id = extractNumber(line);
			String varName = extractVarName(line, ("" + id).length());
			_var2IDs.put(id, varName.trim());
			if (line.contains("$")) {
				_fakes.add(varName);
				
			}
			return ;
		}
		if (line.startsWith("p")) {
			return ;
		}

		// otherwise treat the clause
		CNFClause o = treatClause(line);
		if (o != null)
			disjClauses.add(o);
		
	}

	private CNFClause treatClause(String line) {
		if (line == null || line.isEmpty())
			return null;
		List<Integer> vars = new ArrayList<Integer>();
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			int l = treatVariable(token);
			if (l != 0)
				vars.add(l);
		}

		return new CNFClause(vars);
	}
	
	
	private int treatVariable(String token) {

		if (token.startsWith("-")) {
			String varID = token.substring(1);
			int id = Integer.parseInt(varID);
			return -id ; 
		} else {
			int id = Integer.parseInt(token);
			if (id == 0)
				return 0 ;
			return id ; 
		}
	}


	

	private Collection<CNFClause> parseDisjClauses(String dimacs) {
		String[] lines = dimacs.split(System.getProperty("line.separator")) ;
		Collection<CNFClause> disjClauses = new ArrayList<CNFClause>();
		for (String line : lines) {
			treatLine(line, disjClauses) ;
		}		
		return disjClauses ; 
	}

	

	public CNF parse(String dimacs) {
		Collection<CNFClause> clauses = parseDisjClauses(dimacs) ;
		return new CNF (clauses); 
	}


	

}

