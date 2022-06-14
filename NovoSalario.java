package javabasico;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		// ler o valor atual do salário e o percentual de reajuste, para então, calcular e apresentar o novo valor do salário
		
		System.out.println("Reajuste de salário");
		
		//Entrada de dados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário atual R$: ");
		float salarioAtual = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste (%): ");
		float reajuste = sc.nextFloat();
		
		//Processamento de dados;
		float novoSalario = salarioAtual + (salarioAtual * reajuste / 100);
		
		//Saída de dados;
		System.out.println("O valor do seu salário com " + reajuste + "% de reajuste será igual a: R$ " + novoSalario);
		
		sc.close();
	}
}