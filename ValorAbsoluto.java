package javabasico;

import java.util.Scanner;

public class ValorAbsoluto {

	public static void main(String[] args) {
		
		// ler um valor qualquer e apresentar este valor de forma absoluta
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor positivo ou negativo: ");
		int numero = sc.nextInt();
		
		// condi��o composta para exibir o valor absoluto;
		if (numero < 0) {
			System.out.println("O valor absoluto de " + numero + " �: " + Math.abs(numero));
		} else
			System.out.println("O valor absoluto de " + numero + " �: " + numero);
		sc.close();
	}
}