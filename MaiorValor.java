package javabasico;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		
		// ler dois valores diferentes e apresentar o maior valor digitado 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		// condição composta if else if;
		if (valor1 == valor2) {
			System.out.println("[ERRO] Digite valores diferentes!");
		} else if (valor1 > valor2) {
			System.out.println("O maior valor digitado foi: " + valor1);
		} else {
			System.out.println("O maior valor digitado foi: " + valor2);
		}
		sc.close();
	}
}