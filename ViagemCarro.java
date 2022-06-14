package javabasico;

import java.util.Scanner;

public class ViagemCarro {

	public static void main(String[] args) {
		
		// ler o tempo gasto e velocidade média de uma viagem, e no final apresentar a quantidade de litros de combustível gastos na viagem
		
		System.out.println("Descubra a quantidade de litros de combustível gastos em uma viagem: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tempo gasto na viagem (h): ");
		float tempoGastoViagem = sc.nextFloat();
		System.out.println("Informe a velocidade média da viagem (km/h): ");
		float velocidadeMediaViagem = sc.nextFloat();
		
		//Cálculo da distância percorrida na viagem = tempo x velocidadeMedia;
		float distanciaViagem = tempoGastoViagem * velocidadeMediaViagem;
		//Cálculo de combustível utilizado na viagem = distância / 12 (gasto por km);
		float litrosCombustivelGasto = distanciaViagem / 12;
		System.out.println("A velocidade média da viagem foi: " + velocidadeMediaViagem + "Km/h");
		System.out.println("O tempo gasto na viagem foi: " + tempoGastoViagem + " horas");
		System.out.println("A distância percorrida na viagem foi: " + distanciaViagem + " Km.");
		System.out.println("A quantidade de litros de combustível gastos nesta viagem foi: " + litrosCombustivelGasto + " litros.");
		
		sc.close();
	}
}