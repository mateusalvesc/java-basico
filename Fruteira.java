package javabasico;

import java.util.Scanner;

public class Fruteira {

	public static void main(String[] args) {
		
		// ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e apresentar o valor a ser pago pelo cliente
		// Preços até 5kg comprados: Morango = R$ 2,50 kg | Maças = R$ 1,80 / Preços acima de 5kg comprados: Morango = R$ 2,20 | Maça = R$ 1,50
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade em kg de morangos comprados: ");
		int qtdMorango = sc.nextInt();
		System.out.println("Informe a quantidade em kg de maças compradas: ");
		int qtdMaca = sc.nextInt();
		
		int qtdTotalCompra = 0;
		float valorTotalMorango, valorTotalMaca, valorTotalCompra;
				
		if (qtdMorango < 6) {
		    valorTotalMorango = qtdMorango * 2.5f;
		} else {
		    valorTotalMorango = qtdMorango * 2.2f;
		}

		if (qtdMaca < 6) {
		    valorTotalMaca = qtdMaca * 1.8f;
		} else {
		  valorTotalMaca = qtdMaca * 1.5f;  
		}

		qtdTotalCompra = qtdMorango + qtdMaca;
		valorTotalCompra = valorTotalMorango + valorTotalMaca;

		// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total
		
		if (qtdTotalCompra > 25 || valorTotalCompra > 8) {
		    valorTotalCompra *= 0.9;
		    System.out.println("O valor total da compra foi igual a: R$ " + valorTotalCompra + " reais.");
		} else {
		    System.out.println("O valor total da compra foi igual a: R$ " + valorTotalCompra + " reais.");
		}
		
		sc.close();
	}
}