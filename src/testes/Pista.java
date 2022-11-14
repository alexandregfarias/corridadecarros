package testes;

public class Pista {

	public static boolean fimDaCorrida = false;
	public static int contadorNarracaoEmpate = 0;
	public static int contadorNarracaoPiloto1 = 0;
	public static int contadorNarracaoPiloto2 = 0;

	
	public static void imprimirPista(Carro carro) {
		String[] pista = new String[20];

		for (int i = 0; i < pista.length; i++) {
			pista[i] = ".";

			if (carro.getDistancia() >= 19) {
				pista[19] = "#";
			} else {
				pista[carro.getDistancia()] = "#";
			}
			System.out.print(pista[i] + " ");		
		}
		System.out.println();
	}

	public static void terminarCorrida(Carro carro1, Carro carro2) {
		if (carro1.getDistancia() >= 20 || carro2.getDistancia() >= 20) {
			fimDaCorrida = true;
		}
	}

	public static void verificarVencedor(Carro carro1, Carro carro2) {
		if(carro1.getDistancia() > carro2.getDistancia()) {
			System.out.println("Acabou!! pan pan pan, pan pan pan...");
			System.out.println("O piloto #1 vence a corrida e é o novo campeão mundial.");


		} else if (carro2.getDistancia() > carro1.getDistancia()) {
			System.out.println("Acabou!! pan pan pan, pan pan pan...");
			System.out.println("O piloto #2 vence a corrida e é o novo campeão mundial.");

		} else {
			System.out.println("A corrida deu empate! Incrível...");
			System.out.println("Isso significa que o campeão mundial será o vencedor da próxima corrida.");
		}
	}

	public static void narrador(Carro carro1, Carro carro2) {
		if (carro1.getDistancia() == carro2.getDistancia()) {
			switch (contadorNarracaoEmpate) {
			case 0:
				System.out.println("Os dois pilotos estão lado a lado disputando a liderança.");
				contadorNarracaoEmpate++;
				break;
			case 1:
				System.out.println("Novamente os pilotos estão lado pra ver quem vence.");
				System.out.println("Que show estamos presenciando nessa grande final!");
				contadorNarracaoEmpate++;
				break;
			case 2:
				System.out.println("É a terceira vez!");
				System.out.println("Primeira, segunda, agora é a terceira vez que esses dois seguem lado a lado.");
				System.out.println("Inacreditável o que estamos presenciando aqui hoje.");
				contadorNarracaoEmpate++;
				break;
			case 3:
				System.out.println("Já perdi a conta de quantas vezes esses dois vão seguir lado a lado disputando a vitória!.");
				contadorNarracaoEmpate++;
				break;

			case 4:
				System.out.println("Novamente esses dois lado a lado, parei de contar.");
				System.out.println("Vamos deixar que a fórmula 1 fale por si só.");
				contadorNarracaoEmpate++;
				break;

			default:
				System.out.println("Tô sem palavras.");
				break;
			}

		}
		else if (carro1.getDistancia() > carro2.getDistancia()) {
			switch (contadorNarracaoPiloto1) {
			case 0:
				System.out.println("O piloto #1 dispara na frente e bota o #2 para comer poeira.");
				contadorNarracaoPiloto1++;
				if (contadorNarracaoPiloto2 == 0) {
					contadorNarracaoPiloto2++;
				}
				break;

			case 1:
				System.out.println("Seguimos acompanhando essa corrída de fórmula 1.");
				System.out.println("E é ele que vem na liderança, o piloto #1.");
				contadorNarracaoPiloto1++;
				break;

			case 2:
				System.out.println("Haaajaaaaaa coração pra essa grande final.");
				contadorNarracaoPiloto1++;
				break;

			case 3:
				System.out.println("O que é isso que estamos acompanhando aqui na emissora Rede POO?");
				contadorNarracaoPiloto1++;
				break;

			case 4:
				System.out.println("A corrida está se aproximando do fim.");
				contadorNarracaoPiloto1++;
				break;

			default:
				System.out.println("Vai acabar, vai acabar!");
				break;
			}
		}
		else {
			switch (contadorNarracaoPiloto2) {
			case 0:
				System.out.println("O piloto #2 dispara na frente!");
				contadorNarracaoPiloto2++;
				if(contadorNarracaoPiloto1 == 0) {
					contadorNarracaoPiloto1++;
				}
				break;

			case 1:
				System.out.println("Tô impressionado com a velocidade que esses dois tão imprimindo na pista.");
				contadorNarracaoPiloto2++;
				break;

			case 2:
				System.out.println("Haaajaaaaaa coração pra essa grande final.");
				contadorNarracaoPiloto2++;
				break;

			case 3:
				System.out.println("1 minuto para agradecer aos nossos patrocinadores oficiais que tornaram esse evento possível:");
				System.out.println("Professor Osvaldo, professor Fernando e professora Christianne.");
				contadorNarracaoPiloto2++;
				break;

			default:
				System.out.println("Vai acabar, vai acabar!");
				break;
			}
		}
	}

}
