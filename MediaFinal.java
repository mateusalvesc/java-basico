package javabasico;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		// ler três notas de um aluno, calcular e exibir a média aritmética
		System.out.println("Média final de um aluno");
		
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
		
		// saída de dados;
		System.out.println("A média final deste aluno é: " + mediaFinal);
		
		sc.close();
	}
}