package useCases.general;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import CSVtoFML.ConversionModel;
import CSVtoFML.ConversionModelArray;
import CSVtoFML.StoFMLReader;
import CSVtoFML.ToFMLConverter;
import CSVtoFML.ValueMode;

/**
 * 
 * @author Oleksandr Taran
 * 
 */
public class GeneralToFMLConverter extends ToFMLConverter {
	
	public static final String DEFAULT_FILE_PATH = "Ressources/usesCases/";
	public static String DEFAULT_FOLDER = "Test";
	
	//constructor for general case
	public GeneralToFMLConverter(Boolean showID, String folder, Boolean multivaluesMovement, String varicellFileName) throws Exception {
		super(showID);
		
		if("".equals(folder)) throw new Exception("Can not find folder with empty name");
		if("".equals(varicellFileName)) throw new Exception("Can not find varicell file with empty name");
			
		String fullFileName = DEFAULT_FILE_PATH + folder + "/" + varicellFileName;
		String stofmFileName = fullFileName + ".varicell";
		_converter = new StoFMLReader().execute(new File(stofmFileName));
		
		//deactivate _showId if need
		if(!_showID) _converter.deactivateShowID();
		
		_conversionModel = _converter.getConversionModel();
		
		//move multivalues to the dimensional level
		_converter.setMultivaluesMovement(multivaluesMovement);
		if(multivaluesMovement) moveMultivalues(_conversionModel);
	}
	
	/*
	 * method takes conversationModel with already applied instructions from varicell file
	 * and transforms data, i.e. moves multivelus to the dimensional level
	 */
	private void moveMultivalues(ConversionModel conversionModel) throws Exception {
		Iterator<ConversionModelArray> it = conversionModel.getViewsIterator();		
		Map<String, Vector<String>> multivaluesForAllDimensions = new HashMap<String, Vector<String>>();
		ConversionModelArray cma = null;
		Iterator<String> entityIt = null;
		String product = "";
		boolean flag;
		String multivalue = "";
		Integer initialNbActualColumns;
		Set<String> multivalues = null;
		Iterator<String> multivaluesIt = null;
		Vector<String> position = null;
		
		//for an each view change its table
		while(it.hasNext()) {
			cma = it.next();		//one view
			
			initialNbActualColumns = cma.getNbActualColumns();
			
			multivaluesForAllDimensions = getMultivaluesForAllDimensions(cma);
			//System.out.println(multivaluesForAllDimensions);
			
			multivalues = multivaluesForAllDimensions.keySet();
			multivaluesIt = multivalues.iterator();
			
			//make all multivalues as dimensions, fill table below them and change values on their initial places
			for(int i = 0 ; i < multivaluesForAllDimensions.size() ; i++ ) {
				multivalue = multivaluesIt.next();
				cma.addLabel(multivalue);
				position = multivaluesForAllDimensions.get(multivalue);
				//for all positions of the multivalue in the dimension
				for(int j = 1 ; j < position.size() ; j++ )
					cma.filterReplaceColumnValuesBy(cma.getRowValueID(position.get(j), new Integer(position.get(0))),
													"Yes", cma.getLabel(new Integer(position.get(0))));
			}
			
			//for an each new dimension fill its column
			for(int i = initialNbActualColumns ; i < cma.getNbActualColumns() ; i++ ) {
				//System.out.println(cma.getLabel(i));
				position = multivaluesForAllDimensions.get(cma.getLabel(i));
				entityIt = cma.getRowIdentifierIterator();
				while(entityIt.hasNext()) {
					product = entityIt.next();
					flag = false;
					for(int j = 1 ; j < position.size() ; j++ )
						if(product.equals(position.get(j))) {
							flag = true; break;
						}
					if(flag) cma.addValueToRowLabel(product, cma.getLabel(i), new Integer(position.get(0)) + "_xor");
					else cma.addValueToRowLabel(product, cma.getLabel(i), "No");
				}
			}
		}
	}
	
	/*
	 * input: conversion model extracted from csv filess
	 * output: set of sets of unique multivalues for an each dimension
	 * comment: last value in any string has at the end '\n' that is why it's needed to cut this symbol
	 */
	private Map<String, Vector<String>> getMultivaluesForAllDimensions(ConversionModelArray cma) {
		String dimension = "";
		String product = "";
		String cell = "";
		Iterator<String> dimensionsIt = null;
		Iterator<String> dimensionsIt1 = null;
		Iterator<String> entityIt = null;
		Iterator<String> rowIt = null;
		Map<String, String> multivaluesInOneDimension = null;		//initial name, unique name(the same or with random integer)
		Integer counter;
		Map<String, Vector<String>> uniqueMultivalues = null;		//list of unique multivalues with their position <name, (dimension, product1,...productN)>; product1,...productN - products where a multivalue is present
		String multivaluedSeparator = "";
		boolean flag, flag1;
		String value = "";
		Random _generator = new Random();
		String newValue = "";
		Vector<String> position = null;
		
		uniqueMultivalues = new HashMap<String, Vector<String>>();
		dimensionsIt = cma.getHeadLabelsIterator();
		multivaluedSeparator = cma.getMultiValuedSeparator();
		counter = 0;
			
		//create a set of sets of unique multivalues per dimension
		while(dimensionsIt.hasNext()) {
			dimension = dimensionsIt.next();
			if(!dimensionsIt.hasNext()) dimension = dimension.substring(0, dimension.length()-1);
			//System.out.println("\ndimension: " + dimension);
			entityIt = cma.getRowIdentifierIterator();
			multivaluesInOneDimension = new HashMap<String, String>();		
			
			//create a list of unique multivalues in the dimension
			while(entityIt.hasNext()) {
				product = entityIt.next();
				//System.out.println("product: " + product);
				rowIt = cma.getRowValuesIterator(product);
				for(int i = 0 ; i <= counter ; i++)	cell = rowIt.next();
				
				//parse cell value, check whether there is a unique multivalue(s) and add it(them) to the list
				//System.out.println(cell);
				String[] values = cell.split(multivaluedSeparator);
				for(int i = 0 ; i < values.length ; i++ ) {
					value = values[i];
					if(!dimensionsIt.hasNext()) 
							if(i == values.length-1) value = value.substring(0, value.length()-1);
					if(_converter.getValueModePublic(value).equals(ValueMode.Textual)) {
						flag = false;
						if(multivaluesInOneDimension.containsKey(value)) {
								flag = true;
						}
						if(!flag) {			//if a multivalue has not been encountered yet in this dimension
							position = new Vector<String>();
							position.add(counter+"");	//dimension (label)
							position.add(product);		//product
							//if there is no dimension with such name or multivalue otherwise add random integer
							flag1 = false;
							dimensionsIt1 = cma.getHeadLabelsIterator();
							while(dimensionsIt1.hasNext())
								if(dimensionsIt1.next().equals(value)) {
									flag1 = true; break;
								}
							if(!flag1) {
								if(uniqueMultivalues.containsKey(value)) {
									newValue = value+_generator.nextInt();
									multivaluesInOneDimension.put(value, newValue);
									uniqueMultivalues.put(newValue,position);
								}
								else {
									multivaluesInOneDimension.put(value, value);
									uniqueMultivalues.put(value,position);
								}
							}
							else {
								newValue = value+_generator.nextInt();
								multivaluesInOneDimension.put(value, newValue);
								uniqueMultivalues.put(newValue,position);
							}
						} else {			//if a multivalue has been already encountered in this dimension
							//add to the position of this multivalue product identifier
							position = uniqueMultivalues.get(multivaluesInOneDimension.get(value));
							position.add(product);
							uniqueMultivalues.remove(multivaluesInOneDimension.get(value));
							uniqueMultivalues.put(multivaluesInOneDimension.get(value), position);
						}
					}						
				}
			}				
			//System.out.println("uniqueMultivalues: " + uniqueMultivalues);			
			counter++;
		}						
		return uniqueMultivalues;
	}
}
