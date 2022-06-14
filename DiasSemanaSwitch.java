package javabasico;

import java.util.Scanner;

public class DiasSemanaSwitch {

	public static void main(String[] args) {
		
		// ler um número e exibir o dia da semana correspondente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para saber o dia da semana correspondente: ");
		int numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Não existe dia correspondente ao número digitado!");
			break;
		}
		sc.close();
	}
}