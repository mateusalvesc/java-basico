package javabasico;

import java.util.Scanner;

public class CompraMacas {

	public static void main(String[] args) {
		
		// ler a quantidade de ma�as compradas e realizar o c�lculo do custo da compra
		
		System.out.println("Ma�as | unidade = R$ 1,30; a partir de 12 ma�as = R$ 1,00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantas ma�as voc� comprou: ");
		int macasCompradas = sc.nextInt();
		
		//Condi��o composta;
		if (macasCompradas > 11) {
			System.out.println("Cada ma�a custou R$ 1,00 e voc� gastou R$ " + macasCompradas * 1 + " reais.");
		} else {
			System.out.println("Cada ma�a custou R$ 1,30 e voc� gastou R$ " + macasCompradas * 1.30 + " reais.");
		}
		sc.close();
	}
}