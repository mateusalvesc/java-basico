package javabasico;

import java.util.Scanner;

public class CalculoDistributiva {

	public static void main(String[] args) {
		
		// distributiva de soma e multiplicação entre 4 valores lidos
		
		System.out.println("Distributiva entre quatro valores inteiros");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int valorB = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int valorC = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int valorD = sc.nextInt();
		
		//Cálculo das somas;
		System.out.println("Resultado:");
		System.out.println("A + B = " + (valorA + valorB));
		System.out.println("A + C = " + (valorA + valorC));
		System.out.println("A + D = " + (valorA + valorD));
		System.out.println("B + C = " + (valorB + valorC));
		System.out.println("B + D = " + (valorB + valorD));
		System.out.println("C + D = " + (valorC + valorD));
		
		//Cálculo das multiplicações;
		System.out.println("A * B = " + (valorA * valorB));
		System.out.println("A * C = " + (valorA * valorC));
		System.out.println("A * D = " + (valorA * valorD));
		System.out.println("B * C = " + (valorB * valorC));
		System.out.println("B * D = " + (valorB * valorD));
		System.out.println("C * D = " + (valorC * valorD));
		
		sc.close();
	}
}