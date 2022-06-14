package javabasico;

import java.util.Scanner;

public class AreaTotalWhile {

	public static void main(String[] args) {
		
		// programa que possibilita calcular a �rea total de uma resid�ncia
		
		System.out.println("C�lculo da �rea total de uma resid�ncia");
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
			System.out.println("A �rea do(a) " + comodo + " corresponde a: " + area + " m�.");
			areaTotal += area;
			System.out.println("Deseja continuar? [1] Sim | [2] N�o");
			resposta = sc.nextInt();
		}
		
		System.out.println("A �rea total desta resid�ncia corresponde a: " + areaTotal + " m�.");
		
		sc.close();
	}
}