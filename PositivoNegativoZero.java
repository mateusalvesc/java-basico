package javabasico;

import java.util.Scanner;

public class PositivoNegativoZero {

	public static void main(String[] args) {
		
		// ler um valor e exibir a mensagem se � positivo, negativo ou zero
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor num�rico inteiro: ");
		int valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println(valor + " � um valor positivo!");
		} else if (valor == 0) {
			System.out.println(valor + " � um valor zero!");
		} else {
			System.out.println(valor + " � um valor negativo!");
		}
		
		sc.close();
	}
}