package javabasico;

public class GeradorNumeros {

	public static void main(String[] args) {
		
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		int numero = (int) (5 + aleatorio * (10 - 5));
		System.out.println(numero);
		
		int numero2 = (int) (1 + aleatorio * (100 - 1));
		System.out.println(numero2);
	}
}