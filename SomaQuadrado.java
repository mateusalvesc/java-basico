package javabasico;

import java.util.Scanner;

public class SomaQuadrado {

	public static void main(String[] args) {
		
		// ler tr�s valores e apresentar o resultado da soma do quadrado dos tr�s valores lidos
		
		System.out.println("Soma do quadrado de tr�s valores");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor inteiro: ");
		int valor3 = sc.nextInt();
		
		// soma do quadrado dos valores;
		int resultado = valor1 * valor1 + valor2 * valor2 + valor3 * valor3;
		System.out.println("O resultado da soma do quadrado dos tr�s valores � igual a: " + resultado);
		
		sc.close();
	}
}