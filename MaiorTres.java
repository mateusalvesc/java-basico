package javabasico;

import java.util.Scanner;

public class MaiorTres {

	public static void main(String[] args) {
		
		// ler um valor inteiro e apresenta-lo, caso n�o seja maior do que tr�s
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Diigte um valor num�rico inteiro: ");
		int valor = sc.nextInt();
		
		if (valor < 3) {
			System.out.println(valor + " � menor do que tr�s!");
		}
		
		sc.close();
	}
}