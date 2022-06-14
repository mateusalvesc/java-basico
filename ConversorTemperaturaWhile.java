package javabasico;

public class ConversorTemperaturaWhile {

	public static void main(String[] args) {
		
		// apresentar os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
		
		int contador = 10;
		float fahrenheit;
		
		while (contador <= 100) {
			fahrenheit = (9 * contador + 160) / 5;
			System.out.println(contador + "ºC = " + fahrenheit + "ºF");
			contador += 10;
		}
	}
}