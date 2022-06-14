package javabasico;

import java.util.Scanner;

public class EleicaoMunicipal {

	public static void main(String[] args) {
		
		// ler a quantidade total de eleitores, votos brancos e votos nulos e calcular os percentuais dos votos da eleição
		
		System.out.println("Eleição Municipal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade total de eleitores: ");
		int eleitores = sc.nextInt();
		System.out.println("Informe a quantidade de votos brancos: ");
		int votosBrancos = sc.nextInt();
		System.out.println("Informe a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		//Cálculo dos votos válidos;
		int votosValidos = eleitores - (votosBrancos + votosNulos);
		//Cálculo dos percentuais dos votos da eleição;
		float porcentoBrancos = votosBrancos * 100 / eleitores;
		float porcentoNulos = votosNulos * 100 / eleitores;
		float porcentoValidos = votosValidos * 100 / eleitores;
		
		System.out.println("Confira os dados a seguir em % desta eleição: ");
		System.out.println("Total: " + eleitores + " eleitores");
		System.out.println("Votos brancos: " + porcentoBrancos + "%");
		System.out.println("Votos nulos: " + porcentoNulos + "%");
		System.out.println("Votos válidos: " + porcentoValidos + "%");
		
		sc.close();
	}
}