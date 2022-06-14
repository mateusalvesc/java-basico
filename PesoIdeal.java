package javabasico;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		// ler o nome, sexo e altura de uma pessoa e apresentar o seu peso ideal, com base nas informações passadas
		
		System.out.println("Peso ideal");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite seu sexo [M/F]: ");
		String sexo = sc.nextLine();
		System.out.println("Digite a sua altura: ");
		float altura = sc.nextFloat();
		
		float pesoIdeal = 0;
		// condição composta;
		if (sexo == "M") {
			pesoIdeal = 72.7f * altura - 58;
			System.out.println(nome + ", o seu peso ideal é: " + pesoIdeal + " Kg.");
		} else if (sexo == "F") {
			pesoIdeal = 62.1f * altura - 44.7f;
			System.out.println(nome + ", o seu peso ideal é: " + pesoIdeal + " Kg.");
		} else {
			System.out.println("[ERRO] Digite apenas'M' ou 'F' para escolher o sexo.");
		}
		
		sc.close();
	}
}