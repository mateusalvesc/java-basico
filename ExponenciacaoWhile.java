package javabasico;

public class ExponenciacaoWhile {

	public static void main(String[] args) {
		
		// apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15
		
		int base = 3;
		int expoente = 0;
		int potencia = 1;
		int contador = 1;
		
		while (expoente <= 15) {
			while (contador <= expoente) {
				potencia *= base;
				contador++;
			}
			System.out.println(base + " elevado a " + expoente + " = " + potencia);
			expoente++;
		}
	}
}