package javabasico;

import java.util.Scanner;

public class DivisaoInteiraDoWhile {

	public static void main(String[] args) {
		
		// ler o valor do dividendo e divisor para apresentar o resultado da divis�o inteira atrav�s do loop 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Divis�o inteira atrav�s de looping");
		
		int dividendo, divisor;
		int auxiliar = 0;
		int quociente = -1;
		System.out.println("Informe o dividendo: ");
		dividendo = sc.nextInt();
		System.out.println("Informe o divisor: ");
		divisor = sc.nextInt();
		
		do {
			auxiliar = auxiliar + divisor;
			quociente++;
		} while (auxiliar <= dividendo);
		
		System.out.println(quociente);
		sc.close();
	}
}