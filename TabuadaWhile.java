package javabasico;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		// apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) do n�mero digitado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero para ver a sua tabuada: ");
		int numero = sc.nextInt();
		int contador = 1;
		
		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
			contador++;
		}
		sc.close();
	}
}