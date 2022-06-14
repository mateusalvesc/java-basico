package javabasico;

import java.util.Scanner;

public class SalarioFinal {

	public static void main(String[] args) {
		
		// ler a quantidade de carros vendidos, o valor total de vendas, o sal�rio fixo e o valor recebido por cada carro vendido, para ent�o, calcular com base nas condi��es o valor final do sal�rio de um funcion�rio
		
		System.out.println("C�lculo de sal�rio de um funcion�rio de uma revendedora de carros usados");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de carros vendidos: ");
		int quantidadeCarrosVendidos = sc.nextInt();
		System.out.println("Digite o valor total de vendas R$: ");
		float valorTotalVendas = sc.nextFloat();
		System.out.println("Digite o valor do sal�rio fixo R$: ");
		float salarioFixo = sc.nextFloat();
		System.out.println("Digite o valor recebido por cada carro vendido: ");
		float valorCarroVendido = sc.nextFloat();
		
		// c�lculo da comiss�o de 5% em rela��o ao valor total de vendas;
		float comissaoValorVendas = valorTotalVendas * 5 / 100;
		// c�lculo da comiss�o por carro vendido;
		float comissaoCarrosVendidos = valorCarroVendido * quantidadeCarrosVendidos;
		// c�lculo do sal�rio total;
		float salarioTotal = salarioFixo + comissaoValorVendas + comissaoCarrosVendidos;
		
		System.out.println("O valor final do sal�rio deste funcion�rio ser� de R$: " + salarioTotal);
		
		sc.close();
	}
}