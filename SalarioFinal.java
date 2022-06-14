package javabasico;

import java.util.Scanner;

public class SalarioFinal {

	public static void main(String[] args) {
		
		// ler a quantidade de carros vendidos, o valor total de vendas, o salário fixo e o valor recebido por cada carro vendido, para então, calcular com base nas condições o valor final do salário de um funcionário
		
		System.out.println("Cálculo de salário de um funcionário de uma revendedora de carros usados");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de carros vendidos: ");
		int quantidadeCarrosVendidos = sc.nextInt();
		System.out.println("Digite o valor total de vendas R$: ");
		float valorTotalVendas = sc.nextFloat();
		System.out.println("Digite o valor do salário fixo R$: ");
		float salarioFixo = sc.nextFloat();
		System.out.println("Digite o valor recebido por cada carro vendido: ");
		float valorCarroVendido = sc.nextFloat();
		
		// cálculo da comissão de 5% em relação ao valor total de vendas;
		float comissaoValorVendas = valorTotalVendas * 5 / 100;
		// cálculo da comissão por carro vendido;
		float comissaoCarrosVendidos = valorCarroVendido * quantidadeCarrosVendidos;
		// cálculo do salário total;
		float salarioTotal = salarioFixo + comissaoValorVendas + comissaoCarrosVendidos;
		
		System.out.println("O valor final do salário deste funcionário será de R$: " + salarioTotal);
		
		sc.close();
	}
}