package javabasico;

import java.util.Scanner;

public class ConversorMoeda {

	public static void main(String[] args) {
		
		// ler a cotação atual do Dólar e a quantidade de dólares para realizar o cálculo da conversão
		
		System.out.println("Conversor de Moeda");
		Scanner sc= new Scanner(System.in);
		System.out.println("Informe a cotação atual do Dólar em relação ao Real R$: ");
		float cotacaoDolar = sc.nextFloat();
		System.out.println("Informe quantos dólares você posui US$: ");
		float quantidadeDolares = sc.nextFloat();
		
		// cálculo de conversão baseado na quantidade de dólares e a cotação informada;
		float conversaoValores = quantidadeDolares * cotacaoDolar;
		System.out.println("US$ " + quantidadeDolares + " dólares corresponde a: R$ " + conversaoValores + " reais.");
		
		sc.close();
	}
}