package javabasico;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		// ler um n�mero inteiro e verificar se ele � maior ou menor que 10, exibindo uma mensagem correspondente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		//Condi��o composta if else;
		if (numero > 10) {
			System.out.println(numero + " � maior do que 10!");
		} else {
			System.out.println(numero + " � menor do que 10!");
		}
		sc.close();
	}
}