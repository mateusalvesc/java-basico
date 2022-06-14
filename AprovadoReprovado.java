package javabasico;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		// ler duas notas, calcular a média e verificar se é maior ou igual a 6, para então exibir se o aluno foi aprovado ou reprovado
		
		System.out.println("Situação do aluno");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		//Cálculo da média aritmética;
		float mediaAritmetica = (nota1 + nota2) / 2;
		
		//Condição composta;
		if (mediaAritmetica >= 6) {
			System.out.println("Aluno aprovado | Média: " + mediaAritmetica);
		} else {
			System.out.println("Aluno reprovado | Média: " + mediaAritmetica);
		}
		sc.close();
	}
}