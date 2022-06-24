package javabasico;

public class ExemploString {

	public static void main(String[] args) {
		
		/* tabela ascii
		char sexo = 'M';
		System.out.println(sexo); */
		
		String nome, sobrenome;
		
		nome = "Mateus";
		sobrenome = "Alves";
		
		System.out.println(nome);
		
		// realiza a contagem de caracteres
		System.out.println("A variável nome possui: " + nome.length() + " letras.");
		
		// transforma em letras minúsculas
		System.out.println(nome.toLowerCase());
		
		// transforma em letras maiúsculas
		System.out.println(nome.toUpperCase());
		
		// localizar
		System.out.println(nome.indexOf("s"));
		
		// concatenação
		System.out.println(nome + "\n" + sobrenome);
		
		// método concat
		System.out.println("O nome e sobrenome é: " + nome.concat(" " + sobrenome));
	}
}