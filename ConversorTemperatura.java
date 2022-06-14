package javabasico;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		// ler uma temperatura em graus Fahrenheit e realizar a conversão para graus Celsius
		
		System.out.println("Conversor de temperatura");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Fahrenheit (ºF): ");
		float fahrenheit = sc.nextFloat();
		
		// cálculo da conversão de temperatura: Fahrenheit para Celsius;
		float celsius = 5 * (fahrenheit - 32) / 9;
		
		System.out.println(fahrenheit + " graus Fahrenheit (ºF) corresponde a " + celsius + " graus Celsius (ºC).");
		
		sc.close();
	}
}