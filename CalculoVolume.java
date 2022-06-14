package javabasico;

import java.util.Scanner;

public class CalculoVolume {

	public static void main(String[] args) {
		
		// ler a altura e o valor do raio de uma lata para realizar o cálculo da área
		
		System.out.println("Cálculo do volume de uma lata de óleo");
		System.out.println("Informe a altura da lata: ");
		Scanner sc = new Scanner(System.in);
		float altura = sc.nextFloat();
		System.out.println("Informe o valor do raio da lata: ");
		float raio = sc.nextFloat();
		
		// cálculo do volume da lata de óleo: volume = PI * Raio² * Altura;
		float volume = (float) Math.PI * (float) Math.pow(raio,2) * altura;
		
		System.out.println("O volume desta lata de óleo é igual a: " + volume);
		
		sc.close();
	}
}