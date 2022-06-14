package javabasico;

import java.util.Scanner;

public class ResultadoPartida {

	public static void main(String[] args) {
		
		// ler o nome de dois times, os gols marvados por cada um e apresentar o resultado da partida
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do primeiro time: ");
		String time1 = sc.nextLine();
		System.out.println("Informe o nome do segundo time: ");
		String time2 = sc.nextLine();
		System.out.println("Informe a quantidade de gols marcados pelo " + time1 + ": ");
		int gols1 = sc.nextInt();
		System.out.println("Informe a quantidade de gols marcados pelo " + time2 + ": ");
		int gols2 = sc.nextInt();
		
		if (gols1 == gols2) {
			System.out.println("Empate: " + gols1 + " x " + gols2);
		} else if (gols1 > gols2) {
			System.out.println("Vitória do " + time1 + ": " + gols1 + " x " + gols2);
		} else {
			System.out.println("Vitória do " + time2 + ": " + gols2 + " x " + gols1);
		}
		
		sc.close();
	}
}