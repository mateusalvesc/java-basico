package javabasico;

import java.util.Scanner;

public class MediaEstoque {

	public static void main(String[] args) {
		
		// ler a quantidade atual, a quantidade mínima e a máxima de estoque de um produto, e apresentar a sua condição equivalente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade atual de estoque do produto: ");
		int estoqueAtual = sc.nextInt();
		System.out.println("Digite a quantidade máxima de estoque para este produto: ");
		int estoqueMaximo = sc.nextInt();
		System.out.println("Digite a quanitdade mínima de estoque para este produto: ");
		int estoqueMinimo = sc.nextInt();
		
		//cálculo da média de estoque;
		float mediaEstoque = (estoqueMaximo + estoqueMinimo) / 2; 
		
		// se o estoque atual for maior do que a média de estoque, não efetuar compra. Se não, efetuar comprar.
		if (estoqueAtual >= mediaEstoque) {
			System.out.println("Média de estoque: " + mediaEstoque + " | Estoque atual: " + estoqueAtual);
			System.out.println("NÃO EFETUAR COMPRA.");
		} else {
			System.out.println("Média de estoque: " + mediaEstoque + " | Estoque atual: " + estoqueAtual);
			System.out.println("EFETUAR COMPRA.");
		}
		sc.close();
	}
}