package javabasico;

import java.util.Scanner;

public class FaixaPermitida {

	public static void main(String[] args) {
		
		// ler um valor e informar se ele est� dentro ou fora da faixa permitida
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor num�rico inteiro [Faixa permitida: 1 a 9]:");
		int valor = sc.nextInt();

		if (valor >= 1 && valor <= 9) {
		    System.out.println("O valor " + valor + " est� na faixa permitida.");
		} else {
		    System.out.println("O valor " + valor + " est� fora da faixa permitida.");
		}
		
		sc.close();
	}
}