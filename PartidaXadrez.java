package javabasico;

import java.util.Scanner;

public class PartidaXadrez {

	public static void main(String[] args) {
		
		// ler o hor�rio de in�cio e fim de uma partida de xadrez e apresentar a sua dura��o 
		
		System.out.println("Jogo de Xadrez");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o hor�rio de in�cio da partida em horas inteiras: ");
		int horarioInicio = sc.nextInt();
		System.out.println("Informe o hor�rio do fim da partida em horas inteiras: ");
		int horarioFim = sc.nextInt();
		
		//C�lculo de horas da dura��o da partida;
		int horasDuracao = horarioInicio - horarioFim;
		
		//Condi��o composta if else if;
		if (horasDuracao > 24) {
		    System.out.println("Dura��o de: " + horasDuracao + " horas | Informa��o inv�lida! A dura��o m�xima de uma partida � de 24 horas.");
		} else if (horarioInicio > horarioFim) {
		    horasDuracao = horarioFim - horarioInicio + 24;
		    System.out.println("A dura��o da partida foi de: " + horasDuracao + " hora(s).");
		} else {
		    horasDuracao = horarioFim - horarioInicio;
		    System.out.println("A dura��o da partida foi de: " + horasDuracao + " hora(s)."); 
		}
		sc.close();
	}
}