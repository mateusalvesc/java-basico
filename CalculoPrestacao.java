package javabasico;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		
		// ler o valor da prestação, a quantidade de dias em atraso e a taxa de juros para realizar o cálculo da prestação em atraso 
		
		System.out.println("Descubra o valor de uma prestação em atraso");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da prestação: ");
		float valorPrestacao = sc.nextFloat();
		System.out.println("Digite a quantidade de dias em atraso: ");
		int diasAtraso = sc.nextInt();
		System.out.println("Digite o valor da taxa de juros (%): ");
		float taxaJuros = sc.nextFloat();
		
		//Cálculo da prestação em atraso;
		float valorPagamento = valorPrestacao + (valorPrestacao * (taxaJuros / 100) * diasAtraso);
		
		System.out.println("O valor da prestação em atraso será igual a: R$ " + valorPagamento + " reais.");
		
		sc.close();
	}
}