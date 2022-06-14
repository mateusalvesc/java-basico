package javabasico;

import java.util.Scanner;

public class Cronometro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a hora que deseja ativar o despertador: ");
		int hora = sc.nextInt();
		System.out.println("Informe o minuto que deseja ativar o despertador: ");
		int minuto = sc.nextInt();
		int horas, minutos, segundos;
		
		for (horas = 0; horas < 24; horas++) {

			for (minutos = 0; minutos < 60; minutos++) {

				for (segundos = 0; segundos < 60; segundos++) {
					
					System.out.println(horas + ":" + minutos + ":" + segundos);
					
					if (hora == horas && minuto == minutos) {

						System.out.println("Acorda braço curto!");

						break;

					}
					
				}
				
				if (hora == horas && minuto == minutos) {
					break;
				}
				
			}
			
			if (hora == horas && minuto == minutos) {
				break;
			}
			
		}

		sc.close();
	}
}