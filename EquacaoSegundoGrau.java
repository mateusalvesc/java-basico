package javabasico;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		// efetuar o cálculo completo da equação do segundo grau
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de a: ");
		int a = sc.nextInt();

		if (a == 0) {
		    a = 1;
		}
		
		System.out.println("Informe o valor de b: ");
		int b = sc.nextInt();
		System.out.println("Informe o valor de c: ");
		int c = sc.nextInt();

		float delta = (float) Math.pow(b, 2) - 4 * a * c;

		if (delta > 0) {
		    System.out.println("Delta = " + delta + " | " + "Para delta positivo, existem duas raízes reais.");
		    double raizX1 = (- b + Math.sqrt(delta)) / (2 * a);
		    double raizX2 = (- b - Math.sqrt(delta)) / (2 * a);
		    System.out.println("X' = " + Math.round(raizX1) + " | X'' = " + Math.round(raizX2));
		} else if (delta == 0) {
		    System.out.println("Delta = " + delta + " | " + "Para delta igual a 0, existe uma raíz real.");
		    double raizX1 = (- b - + Math.sqrt(delta)) / (2 * a);
		    System.out.println("X = " + Math.round(raizX1));
		} else {
		    System.out.println("Delta = " + delta + " | " + "Para delta negativo, não existem raízes reais.");
		}
		
		sc.close();
	}
}