package javabasico;

import java.util.Scanner;

public class CondicaoEleitoral {

	public static void main(String[] args) {
		
		// ler o ano atual e o ano de nascimento para verificar a condi��o eleitoral
		
		System.out.println("Verifique sua condi��o eleitoral");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.println("Digite o seu ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		
		//C�lculo da idade;
		int idade = anoAtual - anoNascimento;
		
		//Condi��o composta if else if;
		if (idade < 16) {
			System.out.println(idade + " anos | Voc� ainda n�o pode votar.");
		} else if (idade >= 16 && idade < 18 || idade > 70){
			System.out.println(idade + " anos | Seu voto � opcional.");
		} else {
			System.out.println(idade + " anos | Seu voto � obrigat�rio.");
		}
		
		sc.close();
	}
}