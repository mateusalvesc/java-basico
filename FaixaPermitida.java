package javabasico;

import java.util.Scanner;

public class FaixaPermitida {

	public static void main(String[] args) {
		
		// ler um valor e informar se ele está dentro ou fora da faixa permitida
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor numérico inteiro [Faixa permitida: 1 a 9]:");
		int valor = sc.nextInt();

		if (valor >= 1 && valor <= 9) {
		    System.out.println("O valor " + valor + " está na faixa permitida.");
		} else {
		    System.out.println("O valor " + valor + " está fora da faixa permitida.");
		}
		
		sc.close();
	}
}