package javabasico;

import java.util.Scanner;

public class VerificaLogin {

	public static void main(String[] args) {
		
		// ler um n�mero que � referente ao c�digo de usu�rio, se corresponder ao valor armazenado, prossiga e solicite a senha, se n�o encerre o programa
		
		Scanner sc = new Scanner(System.in);
		
		int codigoCadastrado = 1234;
		int senhaCadastrada = 9999;

		System.out.println("Digite o n�mero de c�digo do usu�rio:");
		int codigoDigitado = sc.nextInt();
		int senhaDigitada;

		
		if (codigoDigitado == codigoCadastrado) {
		    System.out.println("Digite o n�mero da senha do usu�rio:");
		    senhaDigitada = sc.nextInt();
		    if (senhaDigitada == senhaCadastrada) {
		        System.out.println("Acesso permitido!");
		    } else {
		        System.out.println("Senha incorreta!");
		    }
		} else {
		    System.out.println("Usu�rio inv�lido!");
		}
		
		sc.close();
	}
}