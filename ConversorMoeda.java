package javabasico;

import java.util.Scanner;

public class ConversorMoeda {

	public static void main(String[] args) {
		
		// ler a cota��o atual do D�lar e a quantidade de d�lares para realizar o c�lculo da convers�o
		
		System.out.println("Conversor de Moeda");
		Scanner sc= new Scanner(System.in);
		System.out.println("Informe a cota��o atual do D�lar em rela��o ao Real R$: ");
		float cotacaoDolar = sc.nextFloat();
		System.out.println("Informe quantos d�lares voc� posui US$: ");
		float quantidadeDolares = sc.nextFloat();
		
		// c�lculo de convers�o baseado na quantidade de d�lares e a cota��o informada;
		float conversaoValores = quantidadeDolares * cotacaoDolar;
		System.out.println("US$ " + quantidadeDolares + " d�lares corresponde a: R$ " + conversaoValores + " reais.");
		
		sc.close();
	}
}