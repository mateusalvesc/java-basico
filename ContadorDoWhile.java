package javabasico;

public class ContadorDoWhile {

	public static void main(String[] args) {
		
		// exibir os valores do quadrado de 15 a 200
		
		int contador = 15;
		do {
			System.out.println(contador + "² = " + contador * contador);
			contador++;
		} while (contador <= 200);
	}
}