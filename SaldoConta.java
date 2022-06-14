package javabasico;

import java.util.Scanner;

public class SaldoConta {

	public static void main(String[] args) {
		
		// ler o valor do saldo atual, débito e crédito de uma conta para verificar se o saldo final é positivo ou negativo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da sua conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Digite o valor do saldo atual na sua conta R$: ");
		float saldoAtual = sc.nextFloat();
		System.out.println("Digite o valor de débito da sua conta R$: ");
		float valorDebito = sc.nextFloat();
		System.out.println("Digite o valor de crédito da sua conta R$: ");
		float valorCredito = sc.nextFloat();
		
		//Cálculo do saldo final da conta;
		float saldoFinal = saldoAtual - valorDebito + valorCredito;
		
		if (saldoFinal >= 0) {
			System.out.println("Conta: " + numeroConta);
			System.out.println("O saldo final da sua conta é igual a: R$ " + saldoFinal + " reais | Positivo");
		} else {
			System.out.println("Conta: " + numeroConta);
			System.out.println("O saldo final da sua conta é igual a: R$ " + saldoFinal + " reais | Negativo");
		}
		sc.close();
	}
}