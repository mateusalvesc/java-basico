package javabasico;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		// ler um número inteiro e verificar se ele é maior ou menor que 10, exibindo uma mensagem correspondente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		//Condição composta if else;
		if (numero > 10) {
			System.out.println(numero + " é maior do que 10!");
		} else {
			System.out.println(numero + " é menor do que 10!");
		}
		sc.close();
	}
}