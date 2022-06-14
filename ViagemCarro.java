package javabasico;

import java.util.Scanner;

public class ViagemCarro {

	public static void main(String[] args) {
		
		// ler o tempo gasto e velocidade m�dia de uma viagem, e no final apresentar a quantidade de litros de combust�vel gastos na viagem
		
		System.out.println("Descubra a quantidade de litros de combust�vel gastos em uma viagem: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tempo gasto na viagem (h): ");
		float tempoGastoViagem = sc.nextFloat();
		System.out.println("Informe a velocidade m�dia da viagem (km/h): ");
		float velocidadeMediaViagem = sc.nextFloat();
		
		//C�lculo da dist�ncia percorrida na viagem = tempo x velocidadeMedia;
		float distanciaViagem = tempoGastoViagem * velocidadeMediaViagem;
		//C�lculo de combust�vel utilizado na viagem = dist�ncia / 12 (gasto por km);
		float litrosCombustivelGasto = distanciaViagem / 12;
		System.out.println("A velocidade m�dia da viagem foi: " + velocidadeMediaViagem + "Km/h");
		System.out.println("O tempo gasto na viagem foi: " + tempoGastoViagem + " horas");
		System.out.println("A dist�ncia percorrida na viagem foi: " + distanciaViagem + " Km.");
		System.out.println("A quantidade de litros de combust�vel gastos nesta viagem foi: " + litrosCombustivelGasto + " litros.");
		
		sc.close();
	}
}