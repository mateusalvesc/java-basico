package javabasico;

public class ConversorTemperaturaFor {

	public static void main(String[] args) {
		
		// apresentar os valores de convers�o de graus Celsius em Fahrenheit, de 10 em 10 graus, i = 10, f = 100
		
		float fahrenheit;
		
		for (int i = 10; i <= 100; i+=10) {
			fahrenheit = (9 * i + 160) / 5;
			System.out.println(i + "�C = " + fahrenheit + "�F");
		}
		
	}
}