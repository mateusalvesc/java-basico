package javabasico;

import java.util.Scanner;

public class ExemploSubtracao {

	public static void main(String[] args) {
		
		// apresentar o resultado da subtração entre dois valores lidos
		
		System.out.println("Subtração de valores");
		
		//Entrada de dados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Processamneto de dados;
		int resultado = valor - valor2;
		
		//Saída de dados;
		System.out.println("O resultado da subtração entre os valores digitados é igual a: " + resultado);	
		
		sc.close();
	}
}