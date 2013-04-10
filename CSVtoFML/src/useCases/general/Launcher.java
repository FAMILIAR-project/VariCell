package useCases.general;

import CSVtoFML.Benchmark;

/**
 * 
 * @author Oleksandr Taran
 * This class allows to execute any usecase (SPL)
 * input as *.csv files and *.varicell
 * output as FMLscript.fml (FAMILIAR script with a set of: product<->FM), FM script and finalFM (merged FM) and metrics values 
 * 
 * pattern for CL arguments: folder, varicellFileName
 */

public class Launcher {

	public static void main(String args[]) {
		
		System.out.println("VariCell (University of Rennes 1 / University of Nice Sophia Antipolis / University of Namur)");
		if (args.length != 2) {
			System.out.println("A folder is expected as well as VariCell instructions.");
			return ; 
		}
		
		String folder = new String(args[0]);
		String varicellFileName = new String(args[1]);
		
		Benchmark bench = new Benchmark(folder);												//manage timers
		GeneralUseCase useCase = new GeneralUseCase(true, false, false, folder, varicellFileName);	//create a conversion model
		try {
			System.out.println("**********************");
			System.out.println("Execution details");
			System.out.println("**********************");
			System.out.print("Running ...");
			useCase.conversion();
			System.out.println("Conversation OK");
			useCase.showBaseMetrics();
			bench.addFlag("Conversion_And_Filtering");
			//useCase.showMetrics(true);			//shows FAMILIAR script and metrics for "FM per product"
			bench.addFlag("Metrics");
			useCase.fmlScriptToDisk("Ressources/usesCases/"+folder+"/FML/FMLscript.fml");
			bench.addFlag("Familiar_Script_To_File");
			useCase.squeletonToFile("Ressources/usesCases/"+folder+"/FML/squeleton.fml", "squeletonFM");
			bench.addFlag("Squeleton_To_File");
			useCase.generateFinalFMToFile("Ressources/usesCases/"+folder+"/FML/finalFM.fml");
			bench.addFlag("Final_FM_To_File");
			useCase.generateFinalFFormulaToFile("Ressources/usesCases/"+folder+"/FML/finalFla.bdd");
			bench.addFlag("Final_Formula_To_File");
			//useCase.showMetricsForFinalFM();
			//bench.addFlag("Metrics (output)");
			System.out.println(bench);
			
		} catch (Exception e) {
			System.out.println("KO");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
