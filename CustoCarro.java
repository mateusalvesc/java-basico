package javabasico;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		
		// ler o custo de f�brica de um carro e calcular o custo final para o consumidor
		
		System.out.println("Descubra o valor final de um carro para o consumidor");
		System.out.println("Custo do distribuidor: 28% | Custo de impostos: 45%");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fabrica do carro R$: ");
		float custoFabrica = sc.nextFloat();
		
		//C�lculo de 28% do custo do distribuidor em rela��o ao valor do carro;
		float custoDistribuidor = custoFabrica * 28 / 100;
		//C�lculo de 45% do custo de impostos em rela�ao ao valor carro;
		float custoImpostos = custoFabrica * 45 / 100;
		//C�lculo do custo final do carro para o consumidor;
		float custoTotal = custoFabrica + custoDistribuidor + custoImpostos;
		
		System.out.println("O custo total deste carro para o consumidor ser� de R$: " + custoTotal);
		
		sc.close();
	}
}