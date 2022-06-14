package javabasico;

import java.util.Scanner;

public class SalarioTotal {

	public static void main(String[] args) {
		
		// ler a quantidade de horas trabalhadas no mês e o salário por hora para calcular e realizar o cálculo do salário total de um funcionário 
		
		System.out.println("Salário total de um funcionário");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o seu salário por hora: ");
		float salarioHora = sc.nextFloat();
		
		// variável para realizar a contagem de horas extras: Sendo normais: 40h por semana, total 160h no mês;
		int horasExtras;
		float salarioExtra, salarioTotal;
		
		// condição composta;
		if (horasTrabalhadas > 160) {
			horasExtras = horasTrabalhadas - 160;
		    salarioExtra = salarioHora + salarioHora  * 50 / 100 * horasExtras;
		    salarioTotal = salarioHora * 160 + salarioExtra;
		    System.out.println("Você fez " + horasExtras + " horas extras, o que equivale a: R$ " + salarioExtra + " reais.");
		    System.out.println("O salário total deste funcionário é igual a: R$ " + salarioTotal + " reais.");
		} else {
			salarioTotal = horasTrabalhadas * salarioHora;
			System.out.println("O salário total deste funcionário é igual a: R$ " + salarioTotal + " reais.");
		}
		sc.close();
	}
}