package javabasico;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		// ler uma temperatura em graus Fahrenheit e realizar a convers�o para graus Celsius
		
		System.out.println("Conversor de temperatura");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Fahrenheit (�F): ");
		float fahrenheit = sc.nextFloat();
		
		// c�lculo da convers�o de temperatura: Fahrenheit para Celsius;
		float celsius = 5 * (fahrenheit - 32) / 9;
		
		System.out.println(fahrenheit + " graus Fahrenheit (�F) corresponde a " + celsius + " graus Celsius (�C).");
		
		sc.close();
	}
}