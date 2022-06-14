package javabasico;

public class GraosDoWhile {

	public static void main(String[] args) {
		
		// apresentar o resultado do somatório de grãos de trigo que pode conter num tabuleiro de xadrez 
		
		float quadrado = 0;
		float somatorio = 0;
		float graos = 1;
		
		// no primeiro quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos), no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8 grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o) quadro.
		do {
			somatorio += graos;
			graos *= 2;
			quadrado++;
		} while (quadrado < 64);
		System.out.println("O somatório do número de grãos de trigo que se pode obter num tabuleiro de xadrez é: " + somatorio);
	}
}