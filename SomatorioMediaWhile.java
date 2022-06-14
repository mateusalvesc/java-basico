package javabasico;

import java.util.Scanner;

public class SomatorioMediaWhile {

	public static void main(String[] args) {
		
		// efetuar a leitura de 10 valores numéricos e apresentar no final o total do somatório e a média aritmética dos valores lidos
		
		System.out.println("Digite 10 valores números inteiros: ");
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int valor;
		int somatorio = 0;
		float media = 0;
		
		while (contador <= 10) {
			System.out.println("Digite o " + contador + "º valor: ");
			valor = sc.nextInt();
			somatorio += valor;
			media = somatorio / contador;
			contador++;
		}
		
		System.out.println("Somatório dos valores digitados = " + somatorio);
		System.out.println("Média dos valores digitados = " + media);
		
		sc.close();
	}
}