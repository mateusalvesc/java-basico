package javabasico;

import java.util.Scanner;

public class CondicaoEleitoral {

	public static void main(String[] args) {
		
		// ler o ano atual e o ano de nascimento para verificar a condição eleitoral
		
		System.out.println("Verifique sua condição eleitoral");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.println("Digite o seu ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		
		//Cálculo da idade;
		int idade = anoAtual - anoNascimento;
		
		//Condição composta if else if;
		if (idade < 16) {
			System.out.println(idade + " anos | Você ainda não pode votar.");
		} else if (idade >= 16 && idade < 18 || idade > 70){
			System.out.println(idade + " anos | Seu voto é opcional.");
		} else {
			System.out.println(idade + " anos | Seu voto é obrigatório.");
		}
		
		sc.close();
	}
}