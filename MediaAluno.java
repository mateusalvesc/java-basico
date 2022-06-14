package javabasico;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		// ler quatro notas de um aluno, calcular a média aritmética e apresentar a sua situação
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota do aluno: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota do aluno: ");
		float nota3 = sc.nextFloat();
		System.out.println("Digite a quarta nota do aluno: ");
		float nota4 = sc.nextFloat();
		
		//Cálculo da média aritmética;
		float mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (mediaAritmetica >= 7) {
			System.out.println("Média: " + mediaAritmetica + " | Aluno aprovado");
		} else {
			System.out.println("Média: " + mediaAritmetica + " | Requer nota do exame, digite: ");
			float notaExame = sc.nextFloat();
			mediaAritmetica = (mediaAritmetica + notaExame) / 2;
			if (mediaAritmetica >= 5) {
				System.out.println("Média: " + mediaAritmetica + " | Aluno aprovado em exame");
			} else {
				System.out.println("Média: " + mediaAritmetica + " | Aluno reprovado em exame");
			}
		}
		sc.close();
	}
}