package javabasico;

public class GraosDoWhile {

	public static void main(String[] args) {
		
		// apresentar o resultado do somat�rio de gr�os de trigo que pode conter num tabuleiro de xadrez 
		
		float quadrado = 0;
		float somatorio = 0;
		float graos = 1;
		
		// no primeiro quadro coloca-se 1 gr�o, no segundo quadro colocam-se 2 gr�os (neste momento t�m-se 3 gr�os), no terceiro quadro colocam-se 4 gr�os (tendo neste momento 7 gr�os), no quarto colocam-se 8 gr�os (tendo-se ent�o 15 gr�os) at� atingir o sexag�simo quarto (64o) quadro.
		do {
			somatorio += graos;
			graos *= 2;
			quadrado++;
		} while (quadrado < 64);
		System.out.println("O somat�rio do n�mero de gr�os de trigo que se pode obter num tabuleiro de xadrez �: " + somatorio);
	}
}