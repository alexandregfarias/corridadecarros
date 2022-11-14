package testes;

import java.util.Scanner;

public class TestePista {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Carro carro1 = new Carro();		
		Carro carro2 = new Carro();
		System.out.println("Em suas marcas...");
		System.out.println("Preparar, apontar, FOGO!");

		while(Pista.fimDaCorrida == false) {
			Pista.imprimirPista(carro1);
			Pista.imprimirPista(carro2);
			System.out.println();
			carro1.acelerar();
			carro2.acelerar();
			entrada.nextLine();
			Pista.narrador(carro1, carro2);
			Pista.terminarCorrida(carro1, carro2);
		}
		Pista.imprimirPista(carro1);
		Pista.imprimirPista(carro2);
		Pista.verificarVencedor(carro1, carro2);
		entrada.close();
	}
}
