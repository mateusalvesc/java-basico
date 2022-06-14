package javabasico;

import java.util.Scanner;

public class EleicaoSindical {

	public static void main(String[] args) {
		
		// ler a quantidade de votos válidos de três candidatos, votos nulos e brancos e apresentar os percentuais da eleição
		
		System.out.println("Eleição Sindical");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de votos válidos do candidato A: ");
		int votosCandidatoA = sc.nextInt();
		System.out.println("Informe a quantidade de votos válidos do candidato B: ");
		int votosCandidatoB = sc.nextInt();
		System.out.println("Informe a quantidade de votos válidos do candidato C: ");
		int votosCandidatoC = sc.nextInt();
		System.out.println("Informe a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		System.out.println("Informe a quantidade de votos brancos: ");
		int votosBrancos = sc.nextInt();
		
		//Cálculo da quantidade de votos;
		int totalEleitores = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosNulos + votosBrancos;
		int totalVotosValidos = votosCandidatoA + votosCandidatoB + votosCandidatoC;
		//Cálculo do percentual dos votos;
		int percentualVotosValidos = totalVotosValidos * 100 / totalEleitores;
		int percentualVotosA = votosCandidatoA * 100 / totalEleitores; 
		int percentualVotosB = votosCandidatoB * 100 / totalEleitores;
		int percentualVotosC = votosCandidatoC * 100 / totalEleitores;
		int percentualVotosNulos = votosNulos * 100 / totalEleitores;
		int percentualVotosBrancos = votosBrancos * 100 / totalEleitores;
		
		//Verificação do candidato vencedor;
		String candidatoVencedor;
		if (votosCandidatoA > votosCandidatoB && votosCandidatoA > votosCandidatoC) {
			candidatoVencedor = "Candidato A.";
		} else if (votosCandidatoB > votosCandidatoA && votosCandidatoB > votosCandidatoC) {
			candidatoVencedor = "Candidato B.";
		} else {
			candidatoVencedor = "Candidato C.";
		}
		
		//Saída de dados;
		System.out.println("Resultados da Eleição Sindical");
		System.out.println("Total: " + totalEleitores + " eleitores.");
		System.out.println("Percentual de votos válidos: " + percentualVotosValidos + "%.");
		System.out.println("Percentual de votos do candidato A: " + percentualVotosA + "%.");
		System.out.println("Percentual de votos do candidato B: " + percentualVotosB + "%.");
		System.out.println("Percentual de votos do candidato C: " + percentualVotosC + "%.");
		System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%.");
		System.out.println("Percentual de votos brancos: " + percentualVotosBrancos + "%.");
		System.out.println("O vencedor desta eleição sindical para o cargo de presidente foi o: " + candidatoVencedor);
		System.out.println("FIM");
		
		sc.close();
	}
}