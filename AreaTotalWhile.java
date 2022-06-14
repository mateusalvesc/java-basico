package javabasico;

import java.util.Scanner;

public class AreaTotalWhile {

	public static void main(String[] args) {
		
		// programa que possibilita calcular a área total de uma residência
		
		System.out.println("Cálculo da área total de uma residência");
		Scanner sc = new Scanner(System.in);
		
		String comodo;
		float largura, comprimento, area, areaTotal = 0;
		int resposta = 1;
		
		while (resposta == 1) {
			System.out.println("Informe o nome do comodo: ");
			comodo = sc.next();
			System.out.println("Informe a largura do comodo: ");
			largura = sc.nextFloat();
			System.out.println("Informe o comprimento do comodo: ");
			comprimento = sc.nextFloat();
			area = largura * comprimento;
			System.out.println("A área do(a) " + comodo + " corresponde a: " + area + " m².");
			areaTotal += area;
			System.out.println("Deseja continuar? [1] Sim | [2] Não");
			resposta = sc.nextInt();
		}
		
		System.out.println("A área total desta residência corresponde a: " + areaTotal + " m².");
		
		sc.close();
	}
}