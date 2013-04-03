package Excel;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import Metric.DoubleMetric;
import Metric.IntegerMetric;
import Metric.Metric;
import Metric.TextualMetric;

/*
 * created by Taran
 * this class provides functionality to write counted metrics to an Excel file in a formated way
 */

public class ToExcel {
	private static final String EXTENSION = "xls";
	
	private WritableWorkbook workbook = null;
	private String fileName = "";
	private WritableSheet sheet = null;
	private String path = "";
	
	public ToExcel() {
		fileName = "metrics";
	}
	
	public ToExcel(String fileName) {
		this.fileName = fileName;
	}	
	
	//parameter specified in *.varicell as "name"
	public void name(String name) {
		
	}
	
	//metrics for Step 1: Statistic after extraction from csv files and after filtering but before FMs construction for each product
	public void writeMetricsStep1(Vector<Metric> metrics) {
		Number number = null;
		Label label = null;
		
		WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD); 
		WritableCellFormat arial10format = new WritableCellFormat (arial10font);
				
		try {
			workbook = Workbook.createWorkbook(new File(path + fileName + "_step1" + "." + EXTENSION));
		} catch (IOException e) {System.out.println("Problems during creation of a workbook: " + e);}
		sheet = workbook.createSheet("First", 0);
			
		label = new Label(0, 0, "Step 1: Statistic after extraction from csv files and after filtering (applying instructions from the input *.varicell file) but before FMs construction for each product", arial10format);
		try {
			sheet.addCell(label);
		} catch (RowsExceededException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();}
			
		for(int i = 0 ; i < metrics.size() ; i++ ) {
			label = new Label(i, 2, metrics.get(i).getName());
			number = new Number(i, 3, ((IntegerMetric) metrics.get(i)).getMeaning());
			try {
				sheet.addCell(label);
				sheet.addCell(number);
			} catch (RowsExceededException e) {e.printStackTrace();
			} catch (WriteException e) {e.printStackTrace();}
		}
			
		try {
			workbook.write();
			workbook.close();
		} catch (IOException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();} 
	}
	
	//metrics for Step 2: Statistic after FMs construction for each product and before merging step
	public void writeMetricsStep2(Vector<Metric> metrics, Integer metricsNumberPerFM) {
		Number number = null;
		Label label = null;
		Label textual = null;
		
		WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD); 
		WritableCellFormat arial10format = new WritableCellFormat (arial10font);
				
		try {
			workbook = Workbook.createWorkbook(new File(path + fileName + "_step2" + "." + EXTENSION));
		} catch (IOException e) {System.out.println("Problems during creation of a workbook: " + e);}
		sheet = workbook.createSheet("First", 0);
			
		label = new Label(0, 0, "Step 2: Statistic after FMs construction for each product and before merging step", arial10format);
		try {
			sheet.addCell(label);
			
			for(int j = 0, i = 0, k = 2 ; i < metrics.size() ; i++, j++ ) {
				if(j == metricsNumberPerFM) {
					j = 0;
					k += 3;
				}
				label = new Label(j, k, metrics.get(i).getName());
				sheet.addCell(label);
				switch(metrics.get(i).getType()) {
				case Integer:
					number = new Number(j, k+1, ((IntegerMetric) metrics.get(i)).getMeaning());
					sheet.addCell(number);
					break;
				case Double:
					number = new Number(j, k+1, ((DoubleMetric) metrics.get(i)).getMeaning());
					sheet.addCell(number);
					break;
				case Textual:
					textual = new Label(j, k+1, ((TextualMetric) metrics.get(i)).getMeaning());
					sheet.addCell(textual);
					break;
					default:
						System.out.println("Error with the type");
						return;
				}
			}
		} catch (RowsExceededException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();}
		
			
		try {
			workbook.write();
			workbook.close();
		} catch (IOException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();} 
	}
	
	//metrics for Step 3: Statistic after merging step
	public void writeMetricsStep3(Vector<Metric> metrics) {
		Number number = null;
		Label label = null;
		Label textual = null;
		
		WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD); 
		WritableCellFormat arial10format = new WritableCellFormat (arial10font);
				
		try {
			workbook = Workbook.createWorkbook(new File(path + fileName + "_step3" + "." + EXTENSION));
		} catch (IOException e) {System.out.println("Problems during creation of a workbook: " + e);}
		sheet = workbook.createSheet("First", 0);
			
		label = new Label(0, 0, "Step 3: Statistic after merging step", arial10format);
		try {
			sheet.addCell(label);
			
			for(int i = 0 ; i < metrics.size() ; i++ ) {
				label = new Label(i, 2, metrics.get(i).getName());
				sheet.addCell(label);
				switch(metrics.get(i).getType()) {
				case Integer:
					number = new Number(i, 3, ((IntegerMetric) metrics.get(i)).getMeaning());
					sheet.addCell(number);
					break;
				case Double:
					number = new Number(i, 3, ((DoubleMetric) metrics.get(i)).getMeaning());
					sheet.addCell(number);
					break;
				case Textual:
					textual = new Label(i, 3, ((TextualMetric) metrics.get(i)).getMeaning());
					sheet.addCell(textual);
					break;
					default:
						System.out.println("Error with the type");
						return;
				}
			}
		} catch (RowsExceededException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();}
		
			
		try {
			workbook.write();
			workbook.close();
		} catch (IOException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();} 
	}
	
	//metrics for Step 1: Statistic after extraction from csv files and after filtering but before FMs construction for each product
	public void writeMetricsTime(Vector<Metric> metrics, Vector<Metric> metrics1) {
		Number number = null;
		Label label = null;
		Number number1 = null;
		
		WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD); 
		WritableCellFormat arial10format = new WritableCellFormat (arial10font);
				
		try {
			workbook = Workbook.createWorkbook(new File(path + "time_" + fileName + "." + EXTENSION));
		} catch (IOException e) {System.out.println("Problems during creation of a workbook: " + e);}
		sheet = workbook.createSheet("First", 0);
			
		label = new Label(0, 0, "Time statistic over all steps (execution time)", arial10format);
		try {
			sheet.addCell(label);
		} catch (RowsExceededException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();}
			
		for(int i = 0 ; i < metrics.size() ; i++ ) {
			label = new Label(i, 2, metrics.get(i).getName());
			number = new Number(i, 3, ((DoubleMetric) metrics.get(i)).getMeaning());
			number1 = new Number(i, 4, ((DoubleMetric) metrics1.get(i)).getMeaning());
			try {
				sheet.addCell(label);
				sheet.addCell(number);
				sheet.addCell(number1);
			} catch (RowsExceededException e) {e.printStackTrace();
			} catch (WriteException e) {e.printStackTrace();}
		}
			
		try {
			workbook.write();
			workbook.close();
		} catch (IOException e) {e.printStackTrace();
		} catch (WriteException e) {e.printStackTrace();} 
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public String getExtensionName() {
		return EXTENSION;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
}
