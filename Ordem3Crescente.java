package javabasico;

import java.util.Scanner;

public class Ordem3Crescente {

	public static void main(String[] args) {
		
		// ler três valores, ordená-los e apresentá-los em ordem crescente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();
		int menor, meio, maior = 0;
		
		if (valor1 > valor2 && valor1 > valor3) {
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