package javabasico;

import java.util.Scanner;

public class ExemploMultiplicacao {

	public static void main(String[] args) {
		
		// apresentar o resultado da multiplica��o entre dois valores lidos
		
		System.out.println("Multiplica��o de valores");
		
		//Entrada de dados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Processamento de dados;
		int resultado = valor * valor2;
		
		//Sa�da de dados;
		System.out.println("O resultado da multiplica��o entre os valores digitados � igual a: " + resultado);	
		
		sc.close();
	}
}