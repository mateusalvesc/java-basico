package javabasico;

import java.util.Scanner;

public class DiferencaValor {

	public static void main(String[] args) {
		
		// ler dois valores e realizar o c�lculo de diferen�a do maior para o menor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int valor2 = sc.nextInt();
		
		//Condi��o para verificar qual valor digitado � o maior e realizar o c�lculo da difren�a;
		if (valor1 > valor2) {
			int diferenca = valor1 - valor2;
			System.out.println("A diferen�a entre o maior e o menor valor � igual a: " + diferenca);
		} else {
			int diferenca = valor2 - valor1;
			System.out.println("A diferen�a entre o maior e o menor valor � igual a: " + diferenca);
		}
		sc.close();
	}
}