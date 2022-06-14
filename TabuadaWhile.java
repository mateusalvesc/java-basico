package javabasico;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		// apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) do número digitado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ver a sua tabuada: ");
		int numero = sc.nextInt();
		int contador = 1;
		
		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
			contador++;
		}
		sc.close();
	}
}