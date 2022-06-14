package javabasico;

public class PotenciasFor {

	public static void main(String[] args) {
		
		// exibir os resultados das potências de 3 do expoente 0 até o 15
		
		int base = 3;
		int potencia = 0;
		
		for (int expoente = 0; expoente < 16; expoente++) {
			potencia = 1;
			for (int contador = 1; contador <= expoente; contador++) {
				potencia *= base;	
			}
			System.out.println(base + " elevado a " + expoente + " = " + potencia);
		}
		
	}
}