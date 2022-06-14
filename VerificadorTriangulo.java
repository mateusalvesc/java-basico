package javabasico;

import java.util.Scanner;

public class VerificadorTriangulo {

	public static void main(String[] args) {
		
		// ler três medidas e verificar se formam um triângulo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a medida do lado A: ");
		float ladoA = sc.nextFloat();
		System.out.println("Digite a medida do lado B: ");
		float ladoB = sc.nextFloat();
		System.out.println("Digite a medida do lado C: ");
		float ladoC = sc.nextFloat();
		
		if (ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB) {
			System.out.println("As medidas digitadas não formam um triângulo.");
		} else if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("As medidas digitadas formam um triângulo equilátero.");
		} else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
			System.out.println("As medidas digitadas formam um triângulo escaleno.");
		} else {
			System.out.println("As medidas digitadas formam um triângulo isósceles.");
		}
		
		sc.close();
	}
}