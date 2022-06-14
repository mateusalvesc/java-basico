package javabasico;

import java.util.Scanner;

public class SalarioVendedor {

	public static void main(String[] args) {
		
		// ler o sal�rio fixo de um vendedor e o valor total de suas vendas para calcular e apresentar o seu sal�rio total
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o sal�rio fixo do vendedor R$: ");
		float salarioFixo = sc.nextFloat();
		System.out.println("Digite o valor total de suas vendas R$: ");
		float valorTotalVendas = sc.nextFloat();
		
		float ganhosComissao, ganhoExtra, salarioTotal; 
		if (valorTotalVendas <= 1500) {
			ganhosComissao = valorTotalVendas * 0.03f;
			salarioTotal = salarioFixo + ganhosComissao;
			System.out.println("Ganhos por comiss�o: R$ " + ganhosComissao + " reais.");
			System.out.println("O sal�rio total deste vendedor ser� igual a: R$ " + salarioTotal + " reais.");
		} else {
			ganhoExtra = valorTotalVendas - 1500;
			ganhosComissao = ganhoExtra * 0.05f + 1500 + 0.03f;
			salarioTotal = salarioFixo + ganhosComissao;
			System.out.println("Ganhos por comiss�o: R$ " + ganhosComissao + " reais.");
			System.out.println("O sal�rio total deste vendedor ser� igual a: R$ " + salarioTotal + " reais.");
		}
		sc.close();
	}
}