package javabasico;

import java.util.Scanner;

public class SomatorioMediaDoWhile {

	public static void main(String[] args) {
		
		// ler valores inteiros até que o usuário digite um valor negativo, no final apresentar o somatório e a média dos valores digitados
		
		int valor;
		int valoresLidos = 0;
		int somatorio = 0;
		float media = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
		    System.out.println("Digite um valor numérico inteiro [- interrompe]:");
		    valor = sc.nextInt();
		    somatorio += valor;
		    valoresLidos++;
		} while (valor >= 0);
		media = somatorio / valoresLidos;
		System.out.println(valoresLidos + " valores lido(s) | Somatório = " + somatorio + " | Média = " + media);
		
		sc.close();
	}
}