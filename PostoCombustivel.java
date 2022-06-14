package javabasico;

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {
		
		// ler a quantidade de litros e o tipo de combustível comprado e apresentar o valor a ser pago pelo cliente
		
		float precoAlcool = 4.90f;
		float precoGasolina = 6.30f;
		float valorPago = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de litros comprados: ");
		float litrosVendidos = sc.nextFloat();
		System.out.println("Informe o tipo de combustível comprado: [A] Álcool | [G] Gasolina");
		String tipoCombustivel = sc.next();
		
		switch (tipoCombustivel) {
			case "A":
				if (litrosVendidos <= 20) {
		            valorPago = litrosVendidos * (precoAlcool * 0.97f);
		            System.out.println("O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
		        } else {
		            valorPago = litrosVendidos * (precoAlcool * 0.95f);
		            System.out.println("O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
		        }
				break;
			case "G":
				if (litrosVendidos <= 20) {
		            valorPago = litrosVendidos * (precoGasolina * 0.96f);
		            System.out.println("O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
		        } else {
		            valorPago = litrosVendidos * (precoGasolina * 0.94f);
		            System.out.println("O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
		        }
				break;
			default:
				System.out.println("[ERRO] Opção inválida! Digite somente 'A' ou 'G' para escolher o tipo de combustível.");
				break;
		}
		
		sc.close();
	}
}