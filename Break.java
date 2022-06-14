package javabasico;

public class Break {

	public static void main(String[] args) {
		
		// break ignora os demais comandos e fecha o laço
		
		for (int i = 1; i <= 1000; i++) {
			
			System.out.println(i);
			
			if (i == 20) {
				break;
			}

		}
		
	}
}