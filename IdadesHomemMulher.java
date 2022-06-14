package javabasico;

import java.util.Scanner;

public class IdadesHomemMulher {

	public static void main(String[] args) {
		
		// ler a idade de dois homens e duas mulheres diferentes
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a idade de um homem: ");
		int idadeHomem1 = sc.nextInt();
		System.out.println("Informe a idade de outro homem: ");
		int idadeHomem2 = sc.nextInt();
		System.out.println("Informe a idade de uma mulher: ");
		int idadeMulher1 = sc.nextInt();
		System.out.println("Informe a idade de outra mulher: ");
		int idadeMulher2 = sc.nextInt();
		
		int somaIdade = 0, produtoIdade = 0;
		
		if (idadeHomem1 > idadeHomem2) {
		    if (idadeMulher1 < idadeMulher2) {
		        somaIdade = idadeHomem1 + idadeMulher1;
		        produtoIdade = idadeHomem2 * idadeMulher2;
		    } else {
		        somaIdade = idadeHomem1 + idadeMulher2;
		        produtoIdade = idadeHomem2 * idadeMulher1;
		    }
		} else if (idadeHomem1 < idadeHomem2) {
		    somaIdade = idadeHomem2 + idadeMulher1;
		    produtoIdade = idadeHomem1 * idadeMulher2;
		} else {
		    somaIdade = idadeHomem2 + idadeMulher2;
		    produtoIdade = idadeHomem1 * idadeMulher1;
		}
		
		if (idadeHomem1 == idadeHomem2 || idadeMulher1 == idadeMulher2) {
		    System.out.println("[ERRO] Digite apenas idades diferentes entre si.");
		} else {
			System.out.println("A soma entre a idade do homem mais velho e da mulher mais nova é: " + somaIdade + " anos.");
			System.out.println("O produto da idade do homem mais novo e da mulher mais velha é: " + produtoIdade + " anos.");
		}
		
		sc.close();
	}
}