package javabasico;

import java.util.Scanner;

public class MaiorTres {

	public static void main(String[] args) {
		
		// ler um valor inteiro e apresenta-lo, caso não seja maior do que três
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Diigte um valor numérico inteiro: ");
		int valor = sc.nextInt();
		
		if (valor < 3) {
			System.out.println(valor + " é menor do que três!");
		}
		
		sc.close();
	}
}