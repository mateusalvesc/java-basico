package javabasico;

import java.util.Scanner;

public class MediaEstoque {

	public static void main(String[] args) {
		
		// ler a quantidade atual, a quantidade m�nima e a m�xima de estoque de um produto, e apresentar a sua condi��o equivalente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade atual de estoque do produto: ");
		int estoqueAtual = sc.nextInt();
		System.out.println("Digite a quantidade m�xima de estoque para este produto: ");
		int estoqueMaximo = sc.nextInt();
		System.out.println("Digite a quanitdade m�nima de estoque para este produto: ");
		int estoqueMinimo = sc.nextInt();
		
		//c�lculo da m�dia de estoque;
		float mediaEstoque = (estoqueMaximo + estoqueMinimo) / 2; 
		
		// se o estoque atual for maior do que a m�dia de estoque, n�o efetuar compra. Se n�o, efetuar comprar.
		if (estoqueAtual >= mediaEstoque) {
			System.out.println("M�dia de estoque: " + mediaEstoque + " | Estoque atual: " + estoqueAtual);
			System.out.println("N�O EFETUAR COMPRA.");
		} else {
			System.out.println("M�dia de estoque: " + mediaEstoque + " | Estoque atual: " + estoqueAtual);
			System.out.println("EFETUAR COMPRA.");
		}
		sc.close();
	}
}