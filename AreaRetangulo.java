package javabasico;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		
		// ler a medida da base e altura de um tri�ngulo e realizar o c�lculo de sua �rea
		System.out.println("Descubra a �rea de um ret�ngulo");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida da base do ret�ngulo em cm: ");
		float base = sc.nextFloat();
		
		System.out.println("Digite a medida da altura do ret�ngulo em cm: ");
		float altura = sc.nextFloat();
		
		//C�lculo da �rea do ret�ngulo: base x altura;
		float area = base * altura;
		System.out.println("A �rea deste ret�ngulo � igual a: " + area + " cm.");
		
		sc.close();
	}
}