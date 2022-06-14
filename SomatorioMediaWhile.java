package javabasico;

import java.util.Scanner;

public class SomatorioMediaWhile {

	public static void main(String[] args) {
		
		// efetuar a leitura de 10 valores num�ricos e apresentar no final o total do somat�rio e a m�dia aritm�tica dos valores lidos
		
		System.out.println("Digite 10 valores n�meros inteiros: ");
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int valor;
		int somatorio = 0;
		float media = 0;
		
		while (contador <= 10) {
			System.out.println("Digite o " + contador + "� valor: ");
			valor = sc.nextInt();
			somatorio += valor;
			media = somatorio / contador;
			contador++;
		}
		
		System.out.println("Somat�rio dos valores digitados = " + somatorio);
		System.out.println("M�dia dos valores digitados = " + media);
		
		sc.close();
	}
}