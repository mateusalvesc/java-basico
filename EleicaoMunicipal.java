package javabasico;

import java.util.Scanner;

public class EleicaoMunicipal {

	public static void main(String[] args) {
		
		// ler a quantidade total de eleitores, votos brancos e votos nulos e calcular os percentuais dos votos da elei��o
		
		System.out.println("Elei��o Municipal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade total de eleitores: ");
		int eleitores = sc.nextInt();
		System.out.println("Informe a quantidade de votos brancos: ");
		int votosBrancos = sc.nextInt();
		System.out.println("Informe a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		//C�lculo dos votos v�lidos;
		int votosValidos = eleitores - (votosBrancos + votosNulos);
		//C�lculo dos percentuais dos votos da elei��o;
		float porcentoBrancos = votosBrancos * 100 / eleitores;
		float porcentoNulos = votosNulos * 100 / eleitores;
		float porcentoValidos = votosValidos * 100 / eleitores;
		
		System.out.println("Confira os dados a seguir em % desta elei��o: ");
		System.out.println("Total: " + eleitores + " eleitores");
		System.out.println("Votos brancos: " + porcentoBrancos + "%");
		System.out.println("Votos nulos: " + porcentoNulos + "%");
		System.out.println("Votos v�lidos: " + porcentoValidos + "%");
		
		sc.close();
	}
}