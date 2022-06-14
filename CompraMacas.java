package javabasico;

import java.util.Scanner;

public class CompraMacas {

	public static void main(String[] args) {
		
		// ler a quantidade de maças compradas e realizar o cálculo do custo da compra
		
		System.out.println("Maças | unidade = R$ 1,30; a partir de 12 maças = R$ 1,00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantas maças você comprou: ");
		int macasCompradas = sc.nextInt();
		
		//Condição composta;
		if (macasCompradas > 11) {
			System.out.println("Cada maça custou R$ 1,00 e você gastou R$ " + macasCompradas * 1 + " reais.");
		} else {
			System.out.println("Cada maça custou R$ 1,30 e você gastou R$ " + macasCompradas * 1.30 + " reais.");
		}
		sc.close();
	}
}