package javabasico;

import java.util.Scanner;

public class ValorPositivo {

	public static void main(String[] args) {
		
		// efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido somente como valor positivo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();
		if (valor < 0) {
			System.out.println("Valor positivo: " + valor * -1);
		} else {
			System.out.println("Valor positivo: " + valor);
		}
		sc.close();
	}
}