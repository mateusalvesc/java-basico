package javabasico;

import java.util.Scanner;

public class SomatorioMediaDoWhile {

	public static void main(String[] args) {
		
		// ler valores inteiros at� que o usu�rio digite um valor negativo, no final apresentar o somat�rio e a m�dia dos valores digitados
		
		int valor;
		int valoresLidos = 0;
		int somatorio = 0;
		float media = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
		    System.out.println("Digite um valor num�rico inteiro [- interrompe]:");
		    valor = sc.nextInt();
		    somatorio += valor;
		    valoresLidos++;
		} while (valor >= 0);
		media = somatorio / valoresLidos;
		System.out.println(valoresLidos + " valores lido(s) | Somat�rio = " + somatorio + " | M�dia = " + media);
		
		sc.close();
	}
}