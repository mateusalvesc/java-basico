package javabasico;

import java.util.Scanner;

public class ConversorTemperatura2 {

	public static void main(String[] args) {
		
		// ler uma temperatura em graus Celsius e realizar a conversão para graus Fahrenheit
		
		System.out.println("Conversor de temperatura");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius(ºC): ");
		float celsius = sc.nextFloat();
		
		//Cálculo da conversão de temperatura: Celsius para Fahrenheit;
		float fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println(celsius + " graus Celsius(ºC) corresponde a: " + fahrenheit + " graus Fahrenheit(ºF).");
		
		sc.close();
	}
}