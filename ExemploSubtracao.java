package javabasico;

import java.util.Scanner;

public class ExemploSubtracao {

	public static void main(String[] args) {
		
		// apresentar o resultado da subtra��o entre dois valores lidos
		
		System.out.println("Subtra��o de valores");
		
		//Entrada de dados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Processamneto de dados;
		int resultado = valor - valor2;
		
		//Sa�da de dados;
		System.out.println("O resultado da subtra��o entre os valores digitados � igual a: " + resultado);	
		
		sc.close();
	}
}