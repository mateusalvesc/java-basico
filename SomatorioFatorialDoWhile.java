package javabasico;

import java.util.Scanner;

public class SomatorioFatorialDoWhile {

	public static void main(String[] args) {
		
		// ler 15 valores e apresentar o somat�rio do fatorial dos valores lidos
		
		System.out.println("Somat�rio do fatorial de 15 valores: ");
	
		int numero;
		int contador = 1;
		int somatorio = 0;
		int fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite o " + contador + "� valor: ");
			numero = sc.nextInt();
			do {
				fatorial = fatorial * numero;
				numero--;
			} while (numero > 1);
			somatorio = somatorio + fatorial;
			contador++;
			fatorial = 1;
		} while (contador <= 15);
		System.out.println("O somat�rio do fatorial dos 15 valores digitados � igual a: " + somatorio);
		
		sc.close();
	}
}