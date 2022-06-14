package javabasico;

import java.util.Scanner;

public class VerificaLogin {

	public static void main(String[] args) {
		
		// ler um número que é referente ao código de usuário, se corresponder ao valor armazenado, prossiga e solicite a senha, se não encerre o programa
		
		Scanner sc = new Scanner(System.in);
		
		int codigoCadastrado = 1234;
		int senhaCadastrada = 9999;

		System.out.println("Digite o número de código do usuário:");
		int codigoDigitado = sc.nextInt();
		int senhaDigitada;

		
		if (codigoDigitado == codigoCadastrado) {
		    System.out.println("Digite o número da senha do usuário:");
		    senhaDigitada = sc.nextInt();
		    if (senhaDigitada == senhaCadastrada) {
		        System.out.println("Acesso permitido!");
		    } else {
		        System.out.println("Senha incorreta!");
		    }
		} else {
		    System.out.println("Usuário inválido!");
		}
		
		sc.close();
	}
}