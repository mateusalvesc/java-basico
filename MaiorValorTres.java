package javabasico;

import java.util.Scanner;

public class MaiorValorTres {

	public static void main(String[] args) {
		
		// ler tr�s valores diferentes, verificar e apresentar o maior lido
		
		float valor1, valor2, valor3; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1� valor: ");
		valor1 = sc.nextFloat();
		System.out.println("Digite o 2� valor: ");
		valor2 = sc.nextFloat();
		System.out.println("Digite o 3� valor: ");
		valor3 = sc.nextFloat();
		
		if (valor1 == valor2 || valor2 == valor3 || valor3 == valor1) {
			System.out.println("[ERRO] Digite valores diferentes!");
		} else if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor digitado foi: " + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor digitado foi: " + valor2);
		} else {
			System.out.println("O maior valor digitado foi: " + valor3);
		}
		
		sc.close();
	}
}