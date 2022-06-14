package javabasico;

import java.util.Scanner;

public class MatrizVetorA {

	public static void main(String[] args) {
		
		// ler 10 elementos de uma matriz tipo vetor e apresentá-los
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int posicao = 0; posicao <= vetor.length-1; posicao++) {
			System.out.println("Digite o valor da posição " + posicao + " do vetor: ");
			vetor[posicao] = sc.nextInt();
		}
		
		for (int posicao = 0; posicao <= vetor.length-1; posicao++) {
			System.out.println("Na posição " + posicao + " foi digitado o valor: " + vetor[posicao]);
		}
		
		sc.close();
	}
}