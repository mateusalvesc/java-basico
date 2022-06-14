package javabasico;

import java.util.Scanner;

public class ExemploAdicao {

	public static void main(String[] args) {
		
		// apresentar o resultado da soma através da leitura de dois valores
		
		System.out.println("Soma de valores");
		//Inserir dados via teclado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Processamento;
		int resultado = valor + valor2;
		
		//Saída;
		System.out.println("O resultado da soma entre os valores digitados é igual a: " + resultado);	
		
		sc.close();
	}
}