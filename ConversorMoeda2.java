package javabasico;

import java.util.Scanner;

public class ConversorMoeda2 {

	public static void main(String[] args) {
		
		// ler a cotação atual do Dólar e a quantidade de dólares para realizar o cálculo da conversão
		System.out.println("Conversor de Moeda");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a cotação atual do Dólar frente ao Real R$: ");
		float cotacaoDolar = sc.nextFloat();
		System.out.println("Informe quantos reais você possui R$: ");
		float quantidadeReais = sc.nextFloat();
		
		// cálculo de conversão baseado na quantidade de Reais e na cotação do Dólar informada;
		float conversaoValores = quantidadeReais / cotacaoDolar;
		System.out.println("R$ " + quantidadeReais + " reais corresponde a: US$ " + conversaoValores + " dólares.");
		
		sc.close();
	}
}