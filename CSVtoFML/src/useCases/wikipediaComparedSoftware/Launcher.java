package useCases.wikipediaComparedSoftware;

import CSVtoFML.Benchmark;

/**
 * 
 * @author Charles Vanbeneden
 * 
 */
public class Launcher {

	public static void main(String args[]) {
		Benchmark bench = new Benchmark();
		WikipediaComparedSoftwareUseCase useCase = new WikipediaComparedSoftwareUseCase(false, true);
		try {
			System.out.println("**********************");
			System.out.println("Execution details");
			System.out.println("**********************");
			System.out.print("Running ...");
			useCase.conversion();
			System.out.println("OK");
			useCase.showBaseMetrics();
			useCase.filterCSVParsers();
			bench.addFlag("Conversion_And_Filtering");
			useCase.showMetrics(false);
			bench.addFlag("Metric");
			//useCase.csvToDisk("Ressources/usesCases/wikipediaComparedSofware/CSV/");
			//bench.addFlag("CSV_To_Folder");
			useCase.fmlScriptToDisk("Ressources/usesCases/wikipediaComparedSoftware/FML/script.fml");
			bench.addFlag("Script_To_File");
			useCase.generateFinalFMToFile("Ressources/usesCases/wikipediaComparedSoftware/FML/finalFM.fml");
			bench.addFlag("Final_FM_To_File");
			System.out.println(bench);
		} catch (Exception e) {
			System.out.println("KO");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
