package javabasico;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		// ler duas notas, calcular a m�dia e verificar se � maior ou igual a 6, para ent�o exibir se o aluno foi aprovado ou reprovado
		
		System.out.println("Situa��o do aluno");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		//C�lculo da m�dia aritm�tica;
		float mediaAritmetica = (nota1 + nota2) / 2;
		
		//Condi��o composta;
		if (mediaAritmetica >= 6) {
			System.out.println("Aluno aprovado | M�dia: " + mediaAritmetica);
		} else {
			System.out.println("Aluno reprovado | M�dia: " + mediaAritmetica);
		}
		sc.close();
	}
}