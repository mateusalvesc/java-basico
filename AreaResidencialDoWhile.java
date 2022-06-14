package javabasico;

import java.util.Scanner;

public class AreaResidencialDoWhile {

	public static void main(String[] args) {
		
		// ler o nome, largura e comprimento de um comodo e calcular a sua área, e no final calcular a área total dos comodos digitados
		
		String comodo;
		float largura, comprimento, area;
		float areaTotal = 0;
		int resposta = 1;
		Scanner sc = new Scanner(System.in);
		
		do {
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
		} while (resposta == 1);
		
		System.out.println("A área total desta residência corresponde a: " + areaTotal + " m².");
		
		sc.close();
	}
}