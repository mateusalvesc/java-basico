package javabasico;

import java.util.Scanner;

public class PotenciaWhile {

	public static void main(String[] args) {

		// apresentar como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer
		
		System.out.println("Potência");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expoente = sc.nextInt();

		int contador = 1;
		int potencia = 1;

		while (contador <= expoente) {
			potencia *= base;
			contador++;
		}
		System.out.println(base + " elevado a " + expoente + " = " + potencia);

		sc.close();
	}
}