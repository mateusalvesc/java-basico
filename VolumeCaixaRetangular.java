package javabasico;

import java.util.Scanner;

public class VolumeCaixaRetangular {

	public static void main(String[] args) {
		
		// ler a medida do comprimento, da largura e da altura de uma caixa retangular para calcular e apresentar o seu volume
		
		System.out.println("Cálculo do volume de uma caixa retangular");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a medida do comprimento da caixa em cm: ");
		float comprimento = sc.nextFloat();
		System.out.println("Digite a medida da largura da caixa em cm: ");
		float largura = sc.nextFloat();
		System.out.println("Digite a medida da altura da caixa em cm: ");
		float altura = sc.nextFloat();
		
		//Cálculo do volume;
		float volume = comprimento * largura * altura;
		System.out.println("O volume desta caixa corresponde a: " + volume + " cm.");
		
		sc.close();
	}
}