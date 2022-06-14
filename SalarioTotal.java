package javabasico;

import java.util.Scanner;

public class SalarioTotal {

	public static void main(String[] args) {
		
		// ler a quantidade de horas trabalhadas no m�s e o sal�rio por hora para calcular e realizar o c�lculo do sal�rio total de um funcion�rio 
		
		System.out.println("Sal�rio total de um funcion�rio");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de horas trabalhadas no m�s: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o seu sal�rio por hora: ");
		float salarioHora = sc.nextFloat();
		
		// vari�vel para realizar a contagem de horas extras: Sendo normais: 40h por semana, total 160h no m�s;
		int horasExtras;
		float salarioExtra, salarioTotal;
		
		// condi��o composta;
		if (horasTrabalhadas > 160) {
			horasExtras = horasTrabalhadas - 160;
		    salarioExtra = salarioHora + salarioHora  * 50 / 100 * horasExtras;
		    salarioTotal = salarioHora * 160 + salarioExtra;
		    System.out.println("Voc� fez " + horasExtras + " horas extras, o que equivale a: R$ " + salarioExtra + " reais.");
		    System.out.println("O sal�rio total deste funcion�rio � igual a: R$ " + salarioTotal + " reais.");
		} else {
			salarioTotal = horasTrabalhadas * salarioHora;
			System.out.println("O sal�rio total deste funcion�rio � igual a: R$ " + salarioTotal + " reais.");
		}
		sc.close();
	}
}