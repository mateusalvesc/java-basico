package javabasico;

public class ContadorFor {

	public static void main(String[] args) {
		
		// exibir os valores do quadrado de 15 a 200
		
		for (int contador = 15; contador < 201; contador++) {
			System.out.println(contador + "² = " + contador * contador);
		}
	}
}