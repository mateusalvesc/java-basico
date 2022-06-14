package javabasico;

import java.util.Scanner;

public class VerificadorTriangulo {

	public static void main(String[] args) {
		
		// ler tr�s medidas e verificar se formam um tri�ngulo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a medida do lado A: ");
		float ladoA = sc.nextFloat();
		System.out.println("Digite a medida do lado B: ");
		float ladoB = sc.nextFloat();
		System.out.println("Digite a medida do lado C: ");
		float ladoC = sc.nextFloat();
		
		if (ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB) {
			System.out.println("As medidas digitadas n�o formam um tri�ngulo.");
		} else if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("As medidas digitadas formam um tri�ngulo equil�tero.");
		} else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
			System.out.println("As medidas digitadas formam um tri�ngulo escaleno.");
		} else {
			System.out.println("As medidas digitadas formam um tri�ngulo is�sceles.");
		}
		
		sc.close();
	}
}