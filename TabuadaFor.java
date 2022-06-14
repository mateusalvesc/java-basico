package javabasico;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		
		
		// apresentar a tabuada de multiplicar de 1 a 10 do número digitado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número e veja sua tabuada: ");
		int numero = sc.nextInt();
		
		for (int contador = 1; contador < 11; contador++) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
		}
		
		sc.close();
	}
}