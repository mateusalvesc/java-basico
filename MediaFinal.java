package javabasico;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		// ler tr�s notas de um aluno, calcular e exibir a m�dia aritm�tica
		System.out.println("M�dia final de um aluno");
		
		// entrada de dados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float nota3 = sc.nextFloat();
		
		// processamento de dados;
		float mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		// sa�da de dados;
		System.out.println("A m�dia final deste aluno �: " + mediaFinal);
		
		sc.close();
	}
}