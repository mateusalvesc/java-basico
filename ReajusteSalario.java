package javabasico;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		// ler o valor do sal�rio atual e o percentual de reajuste para apresentar o novo valor do sal�rio com base no reajuste
		
		System.out.println("Reajuste de sal�rio");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do seu sal�rio atual R$: ");
		float salarioAtual = sc.nextFloat();
		System.out.println("Informe o percentual de reajuste do seu sal�rio %: ");
		float percentualReajuste = sc.nextFloat();
		
		//C�lculo de reajuste do sal�rio;
		float novoSalario = salarioAtual + (salarioAtual * percentualReajuste);
		
		System.out.println("O novo valor do seu sal�rio ser�: R$ " + novoSalario + " reais.");
		
		sc.close();
	}
}