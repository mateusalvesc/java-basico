package javabasico;

import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		
		// ler o valor dos anos, meses e dias, e realizar o c�lculo total da idade expressa em dias
		
		System.out.println("Descubra sua idade expressa em dias");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos anos voc� tem: ");
		int anos = sc.nextInt();
		System.out.println("E quantos meses: ");
		int meses = sc.nextInt();
		System.out.println("E quantos dias: ");
		int dias = sc.nextInt();
		
		// c�lculo
		int idade = (anos * 365) + (meses * 30) + dias;
		System.out.println("Sua idade expressa em dias vividos � igual a: " + idade + " dias");
		
		sc.close();
	}
}