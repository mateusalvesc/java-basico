package javabasico;

public class Metodo02 {
	
	public static void main(String[] args) {
		
		operacoes();
	}
	
	public static void operacoes() {
		
		int numero1 = 15;
		int numero2 = 20;
		int soma, subtracao, multiplicacao; 
		float divisao;
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = (float) numero1 / numero2;
		
		System.out.println("O resultado da soma dos valores � igual a: " + soma);
		System.out.println("O resultado da subtraca��o dos valores � igual a: " + subtracao);
		System.out.println("O resultado da multiplica��o dos valores � igual a: " + multiplicacao);
		System.out.println("O resultado da divis�o dos valores � igual a: " + divisao);
	}
}