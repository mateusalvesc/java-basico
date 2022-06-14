package javabasico;

import java.util.Scanner;

public class ExponenciacaoFor {

	public static void main(String[] args) {
		
		// exibir o resultado da potência com base nos valores digitados
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expoente = sc.nextInt();
		int potencia = 1;
		for (int contador = 1; contador <= expoente; contador++) {
			potencia *= base;
		}
		System.out.println(base + " elevado a " + expoente + " = " + potencia);
		sc.close();
	}
}