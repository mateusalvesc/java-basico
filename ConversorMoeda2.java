package javabasico;

import java.util.Scanner;

public class ConversorMoeda2 {

	public static void main(String[] args) {
		
		// ler a cota��o atual do D�lar e a quantidade de d�lares para realizar o c�lculo da convers�o
		System.out.println("Conversor de Moeda");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a cota��o atual do D�lar frente ao Real R$: ");
		float cotacaoDolar = sc.nextFloat();
		System.out.println("Informe quantos reais voc� possui R$: ");
		float quantidadeReais = sc.nextFloat();
		
		// c�lculo de convers�o baseado na quantidade de Reais e na cota��o do D�lar informada;
		float conversaoValores = quantidadeReais / cotacaoDolar;
		System.out.println("R$ " + quantidadeReais + " reais corresponde a: US$ " + conversaoValores + " d�lares.");
		
		sc.close();
	}
}