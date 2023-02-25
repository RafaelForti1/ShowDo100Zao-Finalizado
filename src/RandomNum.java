import java.text.DecimalFormat;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random Random = new Random();
		DecimalFormat dec = new DecimalFormat("0.00");

		double y = 0.51;
		double z = 3.00;
		int per10 = 10;
		int per35 = 35;

		double valorpremio = Random.nextDouble(y, z);
		System.out.println(dec.format(valorpremio));
		
		float percentage = (Random.nextFloat(per10, per35));
		System.out.println(dec.format(percentage));
	
		double desconto = percentage / 100 * valorpremio;
		System.out.println((dec.format(desconto)));
		
	}

}
