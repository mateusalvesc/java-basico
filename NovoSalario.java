package javabasico;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		// ler o valor atual do sal�rio e o percentual de reajuste, para ent�o, calcular e apresentar o novo valor do sal�rio
		
		System.out.println("Reajuste de sal�rio");
		
		//Entrada de dados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu sal�rio atual R$: ");
		float salarioAtual = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste (%): ");
		float reajuste = sc.nextFloat();
		
		//Processamento de dados;
		float novoSalario = salarioAtual + (salarioAtual * reajuste / 100);
		
		//Sa�da de dados;
		System.out.println("O valor do seu sal�rio com " + reajuste + "% de reajuste ser� igual a: R$ " + novoSalario);
		
		sc.close();
	}
}