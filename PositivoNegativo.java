package javabasico;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		// ler um valor inteiro, verificar e apresentar se ele � positivo ou negativo
		
		System.out.println("Digite um n�mero inteiro: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		// condi��o composta
		if (numero >= 0) {
			System.out.println(numero + " � positivo!");
		} else {
			System.out.println(numero + " � negativo!");
		}
		sc.close();
	}
}