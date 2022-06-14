package javabasico;

import java.util.Scanner;

public class SomaMaiores {

	public static void main(String[] args) {
		
		// ler tr�s valores diferentes, verificar, calcular e apresentar a soma entre os dois maiores
		
		float valor1, valor2, valor3, menor, soma;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1� valor: ");
		valor1 = sc.nextFloat();
		System.out.println("Digite o 2� valor: ");
		valor2 = sc.nextFloat();
		System.out.println("Digite o 3� valor: ");
		valor3 = sc.nextFloat();
		
		if (valor1 == valor2 || valor2 == valor1 || valor3 == valor1) {
		    System.out.println("[ERRO] Digite apenas valores diferentes!");
		} else if (valor1 < valor2 && valor1 < valor3) {
		    menor = valor1;
		    // somar� os tr�s valores e subtrair� com o menor valor, resultando apenas na soma dos dois maiores valores.
		    soma = valor1 + valor2 + valor3 - menor;
		    System.out.println("A soma entre os dois maiores valores digitados � igual a: " + soma);
		} else if (valor2 < valor1 && valor2 < valor3) {
		    menor = valor2;
		    // somar� os tr�s valores e subtrair� com o menor valor, resultando apenas na soma dos dois maiores valores.
		    soma = valor1 + valor2 + valor3 - menor;
		    System.out.println("A soma entre os dois maiores valores digitados � igual a: " + soma);
		} else {
		    menor = valor3;
		    // somar� os tr�s valores e subtrair� com o menor valor, resultando apenas na soma dos dois maiores valores.
		    soma = valor1 + valor2 + valor3 - menor;
		    System.out.println("A soma entre os dois maiores valores digitados � igual a: " + soma);
		}
		
		sc.close();
	}
}