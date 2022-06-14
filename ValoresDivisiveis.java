package javabasico;

import java.util.Scanner;

public class ValoresDivisiveis {

	public static void main(String[] args) {
		
		// ler quatro valores inteiros e apresentar no final quais deles são divisíveis por 2 e 3
		
		Scanner sc =new Scanner(System.in);
		int divisivel = 0;
		System.out.println("Digite o 1º valor inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o 2º valor inteiro: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o 3º valor inteiro: ");
		int valor3 = sc.nextInt();
		System.out.println("Digite o 4º valor inteiro: ");
		int valor4 = sc.nextInt();
		
		if (valor1 % 2 == 0 && valor1 % 3 == 0) {
		    divisivel++;
		    System.out.println(valor1 + " é divisível por 2 e 3.");
		}
		if (valor2 % 2 == 0 && valor2 % 3 == 0) {
		    divisivel++;
		    System.out.println(valor2 + " é divisível por 2 e 3.");
		}
		if (valor3 % 2 == 0 && valor3 % 3 == 0) {
		    divisivel++;
		    System.out.println(valor3 + " é divisível por 2 e 3.");
		}
		if (valor4 % 2 == 0 && valor4 % 3 == 0) {
		    divisivel++;
		    System.out.println(valor4 + " é divisível por 2 e 3.");
		}
		if (divisivel == 0) {
			System.out.println("Nenhum dos valores digitados são divisores por 2 e 3.");
		}

		sc.close();
	}
}