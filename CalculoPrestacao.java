package javabasico;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		
		// ler o valor da presta��o, a quantidade de dias em atraso e a taxa de juros para realizar o c�lculo da presta��o em atraso 
		
		System.out.println("Descubra o valor de uma presta��o em atraso");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da presta��o: ");
		float valorPrestacao = sc.nextFloat();
		System.out.println("Digite a quantidade de dias em atraso: ");
		int diasAtraso = sc.nextInt();
		System.out.println("Digite o valor da taxa de juros (%): ");
		float taxaJuros = sc.nextFloat();
		
		//C�lculo da presta��o em atraso;
		float valorPagamento = valorPrestacao + (valorPrestacao * (taxaJuros / 100) * diasAtraso);
		
		System.out.println("O valor da presta��o em atraso ser� igual a: R$ " + valorPagamento + " reais.");
		
		sc.close();
	}
}