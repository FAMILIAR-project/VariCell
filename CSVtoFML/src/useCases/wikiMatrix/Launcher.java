package useCases.wikiMatrix;

import CSVtoFML.Benchmark;

/**
 * 
 * @author Charles Vanbeneden
 * 
 */
public class Launcher {

	public static void main(String args[]) {
		Benchmark bench = new Benchmark();
		WikiMatrixUseCase useCase = new WikiMatrixUseCase(false, true);
		try {
			System.out.println("**********************");
			System.out.println("Execution details");
			System.out.println("**********************");
			System.out.print("Running ...");
			useCase.conversion();
			System.out.println("OK");
			useCase.showBaseMetrics();
			useCase.filterCSVParsersPaperExampleBig();
			bench.addFlag("Conversion_And_Filtering");
			useCase.showMetrics(false);
			bench.addFlag("Metric");
			useCase.finalCSVToDisk("Ressources/usesCases/wikiMatrix/CSV/");
			bench.addFlag("CSV_To_File");
			useCase.fmlScriptToDisk("Ressources/usesCases/wikiMatrix/FML/script.fml");
			bench.addFlag("Script_To_File");
			useCase.squeletonToFile("Ressources/usesCases/wikiMatrix/FML/squeleton.fml", "squeletonFM");
			// bench.addFlag("Squeleton_To_File");
			useCase.generateFinalFMToFile("Ressources/usesCases/wikiMatrix/FML/final.fml");
			bench.addFlag("Final_FM_To_File");
			System.out.println(bench);
		} catch (Exception e) {
			System.out.println("KO");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
