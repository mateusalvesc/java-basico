package javabasico;

public class ValoresParesWhile {

	public static void main(String[] args) {
		
		// apresentar os resultados da soma e da m�dia aritm�tica dos valores pares situados na faixa num�rica de 50 a 70
		
		int contador = 50;
		int soma = 0;
		int pares = 0;
		float media = 0;
		
		while (contador <= 70) {
			if (contador % 2 == 0) {
				soma += contador;
				System.out.println("Valor par encontrado: " + contador);
				pares++;
			}
			contador++;
		}
		
		media = soma / pares;
		System.out.println("Soma dos valores = " + soma);
		System.out.println("M�dia dos valores = " + media);
	}
}