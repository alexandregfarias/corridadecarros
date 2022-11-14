package testes;

import java.util.Random;


public class Carro {


	private int velocidade;
	private int distancia;

	public int getVelocidade() {
		return velocidade;
	}

	public int getDistancia() {
		return distancia;
	}

	public void acelerar() {
		Random random = new Random();
		this.velocidade = random.nextInt(1, 4); // 1, 2, 3
		this.distancia += velocidade;

	}	

}
