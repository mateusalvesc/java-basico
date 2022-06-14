package javabasico;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		// ler o valor do salário atual e o percentual de reajuste para apresentar o novo valor do salário com base no reajuste
		
		System.out.println("Reajuste de salário");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do seu salário atual R$: ");
		float salarioAtual = sc.nextFloat();
		System.out.println("Informe o percentual de reajuste do seu salário %: ");
		float percentualReajuste = sc.nextFloat();
		
		//Cálculo de reajuste do salário;
		float novoSalario = salarioAtual + (salarioAtual * percentualReajuste);
		
		System.out.println("O novo valor do seu salário será: R$ " + novoSalario + " reais.");
		
		sc.close();
	}
}