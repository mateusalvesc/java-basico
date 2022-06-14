package javabasico;

import java.util.Scanner;

public class OrdemCrescenteTres {

	public static void main(String[] args) {
		
		// ler três valores diferentes, verificar e apresentá-los em ordem crescente
		
		Scanner sc = new Scanner(System.in);
		
		int menor, meio, maior;
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor inteiro: ");
		int valor3 = sc.nextInt();

		if (valor1 == valor2 || valor2 == valor1 || valor3 == valor1) {
			System.out.println("[ERRO] Digite apenas valores diferentes!");
		} else if (valor1 > valor2 && valor1 > valor3) {
		    maior = valor1;
		    if (valor2 < valor3) {
		        meio = valor3;
		        menor = valor2;
		    } else {
		        meio = valor2;
		        menor = valor3;
		    }
		    System.out.println("Ordem Crescente: " + menor + ", " + meio + ", " + maior + "...");
		} else if (valor2 > valor1 && valor2 > valor3) {
		    maior = valor2;
		    if (valor1 < valor3) {
		        meio = valor3;
		        menor = valor1;
		    } else {
		        meio = valor1;
		        menor = valor3;
		    }
		    System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior + "...");
		} else if (valor3 > valor1 && valor3 > valor2) {
		    maior = valor3;
		    if (valor2 < valor1) {
		        meio = valor1;
		        menor = valor2;
		    } else {
		        meio = valor2;
		        menor = valor1;
		    }
		    System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior + "...");
		}
		
		sc.close();
	}
}