package javabasico;

import java.util.Scanner;

public class PartidaXadrez {

	public static void main(String[] args) {
		
		// ler o horário de início e fim de uma partida de xadrez e apresentar a sua duração 
		
		System.out.println("Jogo de Xadrez");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o horário de início da partida em horas inteiras: ");
		int horarioInicio = sc.nextInt();
		System.out.println("Informe o horário do fim da partida em horas inteiras: ");
		int horarioFim = sc.nextInt();
		
		//Cálculo de horas da duração da partida;
		int horasDuracao = horarioInicio - horarioFim;
		
		//Condição composta if else if;
		if (horasDuracao > 24) {
		    System.out.println("Duração de: " + horasDuracao + " horas | Informação inválida! A duração máxima de uma partida é de 24 horas.");
		} else if (horarioInicio > horarioFim) {
		    horasDuracao = horarioFim - horarioInicio + 24;
		    System.out.println("A duração da partida foi de: " + horasDuracao + " hora(s).");
		} else {
		    horasDuracao = horarioFim - horarioInicio;
		    System.out.println("A duração da partida foi de: " + horasDuracao + " hora(s)."); 
		}
		sc.close();
	}
}