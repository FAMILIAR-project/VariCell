package useCases.syntheticTest;

import CSVtoFML.Benchmark;
import CSVtoFML.CSVWriter;
import CSVtoFML.ConversionModel;
import CSVtoFML.ConversionModelGenerator;
import CSVtoFML.FMLConvert;

public class Launcher {

	public static void main(String[] args) {
		
		Benchmark bench = new Benchmark();
		try {
            ConversionModelGenerator convGenerator = new ConversionModelGenerator(10, 100);
            convGenerator.setNbrDead(50);
            convGenerator.setNbrOptional(0);
            convGenerator.setNbrTextual(1);
			ConversionModel convModel = convGenerator.generate();
			//System.out.println(((CSVWriter)convModel.getView("VIEW")).getCSVString());
			FMLConvert converter = new FMLConvert(convModel,true,true);
			/*System.out.println("#Files : " + converter.getConversionModel().getTotalView());
			System.out.println("#Dimension : " + converter.getConversionModel().getTotalDimension());
			System.out.println("#Rows : " + converter.getConversionModel().getTotalRows());
			System.out.println("#Entity : " + converter.getConversionModel().getTotalEntity());
			System.out.println("#Values : " + converter.getConversionModel().getTotalDimension() * converter.getConversionModel().getTotalEntity());
			*/
			converter.convert();
			converter.showStats();
			//System.out.println(converter.getFinalFAMILIARScript());
			System.out.println(converter.getFinalFeatureModel(false));
			bench.addFlag("Final_FM");
			System.out.println(bench);
		} catch (Exception e) {
			System.out.println("KO");
			e.printStackTrace();
			System.exit(1);
		}
	}

}
