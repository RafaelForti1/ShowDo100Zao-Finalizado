import java.text.DecimalFormat;
import java.util.Random;

public class DobroPremio {

	public static void main(String[] args) {
		Random Random = new Random();
		DecimalFormat dec = new DecimalFormat("0.00");
		
		double premioMin = 0.50;
		double premioMax = 3.00;
		
		//value of prize initial//
		double premio = Random.nextDouble(premioMin, premioMax);
		System.out.println(dec.format(premio)); 
		//value of prize initial//

		//value of prize duplicate//
		int multiplicador = 2;
		while (multiplicador <= 10) {
			double resultado = premio * multiplicador;
			System.out.println(dec.format(resultado));
			multiplicador++;
		}

	}

}
