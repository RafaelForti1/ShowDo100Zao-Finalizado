import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Perguntas {

	
	
	public static void mostrar(String pergunta, String o1, String o2, String o3, String o4) {
		System.out.println(pergunta);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		
	}
	
	public static void comecar() {

//		3 1 2 1 1 2 1 1 2 4 1 2 4 1 2 2 1 2 3 1 2 2 1 2 1 1 2 3 1 2
		Scanner sc = new Scanner(System.in);
		Random Random = new Random();
		DecimalFormat dec = new DecimalFormat("0.00");

		String nome;

		double minPremio = 0.50;
		double maxPremio = 3.00;

		int per10 = 10;
		int per35 = 35;

		float percentage = Random.nextFloat(per10, per35);

		double premioIn = Random.nextDouble(minPremio, maxPremio);

		double valorPergunta2;
		double valorPergunta3;
		double valorPergunta4;
		double valorPergunta5;
		double valorPergunta6;
		double valorPergunta7;
		double valorPergunta8;
		double valorPergunta9;
		double valorPergunta10;

		int alternativa1;
		int correta1 = 3;
		int certeza1;

		int alternativa2;
		int correta2 = 1;
		int certeza2;

		int alternativa3;
		int correta3 = 1;
		int certeza3;

		int alternativa4;
		int correta4 = 4;
		int certeza4;

		int alternativa5;
		int correta5 = 4;
		int certeza5;

		int alternativa6;
		int correta6 = 2;
		int certeza6;

		int alternativa7;
		int correta7 = 3;
		int certeza7;

		int alternativa8;
		int correta8 = 2;
		int certeza8;

		int alternativa9;
		int correta9 = 1;
		int certeza9;

		int alternativa10;
		int correta10 = 3;
		int certeza10;

		// Introduce//
		System.out.println("Olá, qual é o seu nome?");
		nome = sc.nextLine();

		System.out.println("seja bem-vindo ao jogo do 100zão " + nome);
		do {
			System.out.println("O valor do premio inicial é de: " + dec.format(premioIn));
			
			mostrar("qual a capital do Brasil", 
					"1) Salvador", "2) São Paulo", 
					"3) Brasilia", "4) Rio De Janeiro");



			System.out.println("escolha a alternativa correta");

			alternativa1 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("digite (1) para Sim e (2) para Não");
			certeza1 = sc.nextInt();
		} while (certeza1 == 2);
		if (alternativa1 == correta1) {
			System.out.println("Parabens vc acertou e ganhou:" + dec.format(premioIn));
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		double desconto = percentage / 100 * premioIn;
		double valorFinal = premioIn - desconto;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(valorFinal)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(valorFinal)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		int parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}
		valorPergunta2 = premioIn * 2;

		do {

			
			System.out.println("o premio desta rodada é de: " + (dec.format(valorPergunta2)));

			mostrar("Complete a musica: \n Olha se voce___", 
					"1) Não me ama", "2) azul caneta", 
					"3) plock plock", "4) braw stars");
			
			System.out.println("escolha a alternativa correta");

			alternativa2 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza2 = sc.nextInt();
		} while (certeza2 == 2);
		if (alternativa2 == correta2) {
			System.out.println("parabens vc acertou e seu premio foi dobrado para: " + (dec.format(valorPergunta2)));
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta2;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}

		valorPergunta3 = valorPergunta2 * 2;
		
		do {
			
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta3)));
			System.out.println("Em qual continente o Brasil fica?");

			System.out.println("1) America do sul");
			System.out.println("2) America central");
			System.out.println("3) Brasileiro");
			System.out.println("4) Europa");

			System.out.println("escolha a alternativa correta");

			alternativa3 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza3 = sc.nextInt();
		} while (certeza3 == 2);
		if (alternativa3 == correta3) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta3;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}
		
		valorPergunta4 = valorPergunta3 * 2;
		do {
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta4)));
			System.out.println("Quantas vezes o Palmeiras foi campeão mundial?");

			System.out.println("1) 1 vez");
			System.out.println("2) 7 vezes");
			System.out.println("3) 5 vezes");
			System.out.println("4) O Palmeiras não tem mundial.");

			System.out.println("escolha a alternativa correta");

			alternativa4 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza4 = sc.nextInt();
		} while (certeza4 == 2);
		if (alternativa4 == correta4) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta4;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}
		
		valorPergunta5 = valorPergunta4 * 2;
		do {
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta5)));
			System.out.println("Quantos gols o Pelé tem na carreira");

			System.out.println("1) 500");
			System.out.println("2) 879");
			System.out.println("3) 1383");
			System.out.println("4) 1283");

			System.out.println("escolha a alternativa correta");

			alternativa5 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza5 = sc.nextInt();
		} while (certeza5 == 2);
		if (alternativa5 == correta5) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta5;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}
		
		valorPergunta6 = valorPergunta5 * 2;
		do {
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta6)));
			System.out.println("Quantas copas o Brasil tem?");

			System.out.println("1) 4");
			System.out.println("2) 5");
			System.out.println("3) 6");
			System.out.println("4) 3");

			System.out.println("escolha a alternativa correta");

			alternativa6 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza6 = sc.nextInt();
		} while (certeza6 == 2);
		if (alternativa6 == correta6) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta6;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		
		do {
			if (parar == 1) {
				System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
				return;
			}

			valorPergunta7 = valorPergunta6 * 2;
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta7)));
			System.out.println("Qual o maior time do Brasil");

			System.out.println("1) Flamengo");
			System.out.println("2) Cruzeiro");
			System.out.println("3) Corinthians");
			System.out.println("4) São Paulo");

			System.out.println("escolha a alternativa correta");

			alternativa7 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza7 = sc.nextInt();
		} while (certeza7 == 2);
		if (alternativa7 == correta7) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta7;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}
		
		valorPergunta8 = valorPergunta7 * 2;
		do {
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta8)));
			System.out.println("Quando os russos celebram a revolução de outubro?");

			System.out.println("1) Janeiro");
			System.out.println("2) Novembro");
			System.out.println("3) Dezembro");
			System.out.println("4) Nenhuma das alternativas");

			System.out.println("escolha a alternativa correta");

			alternativa8 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza8 = sc.nextInt();
		} while (certeza8 == 2);
		if (alternativa8 == correta8) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		desconto = percentage / 100 * valorPergunta8;
		System.out.println("se voce decidir parar o seu premio vai ser de: " + (dec.format(desconto)));
		System.out.println("Voce deseja parar de jogar e resgatar o premio de: " + (dec.format(desconto)) + "?");
		System.out.println("Digite (1) para sim e (2) para não");
		parar = sc.nextInt();
		if (parar == 1) {
			System.out.println("voce decidiu parar e resgatou: " + (dec.format(desconto)) + " Obrigado por jogar!");
			return;
		}

		
		do {
			
			valorPergunta9 = valorPergunta8 * 2;
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta9)));
			System.out.println("Você tinha 20 vacas. Todas morrem, menos 6. Quantas ficam?");

			System.out.println("1) 6");
			System.out.println("2) 20");
			System.out.println("3) 0");
			System.out.println("4) Roger Guedes");

			System.out.println("escolha a alternativa correta");

			alternativa9 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza9 = sc.nextInt();
		} while (certeza9 == 2);
		if (alternativa9 == correta9) {
			System.out.println("parabens vc acertou");
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		
		do {

			valorPergunta10 = valorPergunta9 * 2;
			System.out.println("o premio desta rodade é de: " + (dec.format(valorPergunta10)));

			System.out.println("O pai do padre é filho do meu pai. O que eu sou do Padre?");

			System.out.println("1) Pai");
			System.out.println("2) Avô");
			System.out.println("3) Tio");
			System.out.println("4) Primo");

			System.out.println("escolha a alternativa correta");

			alternativa10 = sc.nextInt();

			System.out.println("voce esta certo disso?");
			System.out.println("Digite (1) para Sim e (2) para Não");
			certeza10 = sc.nextInt();
		} while (certeza10 == 2);
		if (alternativa10 == correta10) {
			System.out.println("parabens vc acertou");
			System.out.println("voce ganhou um total de: " + (dec.format(valorPergunta10)));
		} else {
			System.out.println("Voce errou e perdeu tudo.");
			return;
		}

		// finish//
		System.out.println("Obrigado por jogar o show do 100zão");
		sc.close();
	}

}