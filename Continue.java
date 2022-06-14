package javabasico;

public class Continue {

	public static void main(String[] args) {
		
		// continue ignora os comandos abaixo e retorna para o início do laço
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			
			if (i==5) {
				continue;
			}
		}
		
	}
}