package javabasico;

import java.util.Scanner;

public class ConversorTemperatura2 {

	public static void main(String[] args) {
		
		// ler uma temperatura em graus Celsius e realizar a convers�o para graus Fahrenheit
		
		System.out.println("Conversor de temperatura");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius(�C): ");
		float celsius = sc.nextFloat();
		
		//C�lculo da convers�o de temperatura: Celsius para Fahrenheit;
		float fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println(celsius + " graus Celsius(�C) corresponde a: " + fahrenheit + " graus Fahrenheit(�F).");
		
		sc.close();
	}
}