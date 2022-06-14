package javabasico;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		
		// ler o nome e o sexo de uma pessoa e apresentar a saudação correspondente
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe seu sexo: [1] Masculino | [2] Feminino");
		int sexo = sc.nextInt();
		
		switch (sexo) {
		case 1: {
			System.out.println("Seja bem-vindo, Sr. " + nome + "!");
			break;
		}
		case 2: {
			System.out.println("Seja bem-vinda, Sra. " + nome + "!");
			break;
		}
		default:
			System.out.println("[ERRO] Opção inválida!");
			break;
		}
		
		sc.close();
	}
}