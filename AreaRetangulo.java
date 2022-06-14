package javabasico;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		
		// ler a medida da base e altura de um triângulo e realizar o cálculo de sua área
		System.out.println("Descubra a área de um retângulo");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida da base do retângulo em cm: ");
		float base = sc.nextFloat();
		
		System.out.println("Digite a medida da altura do retângulo em cm: ");
		float altura = sc.nextFloat();
		
		//Cálculo da área do retângulo: base x altura;
		float area = base * altura;
		System.out.println("A área deste retângulo é igual a: " + area + " cm.");
		
		sc.close();
	}
}