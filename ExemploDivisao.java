package javabasico;

import java.util.Scanner;

public class ExemploDivisao {

	public static void main(String[] args) {
		
		// apresentar o resultado da divisão entre dois valores lidos
		
		System.out.println("Divisor de valores");
		//Entrada de Dados;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Processamento de dados;
		float resultado = (float) valor / valor2;
		
		//Saída de dados;
		System.out.println("O resultado da divisão entre os valores digitados é igual a: " + resultado);
		
		sc.close();	
	}
}