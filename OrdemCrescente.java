package javabasico;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		// ler dois valores, ordená-los e apresentá-los em ordem crescente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Condição composta if else if;
		if (valor1 == valor2) {
		    System.out.println("[ERRO] Digite valores diferentes!");
		} else if (valor1 > valor2) {
		    System.out.println(valor2 + ", " + valor1 + "...");
		} else {
		    System.out.println(valor1 + ", " + valor2 + "...");
		}
		sc.close();
	}
}