package javabasico;

public class TiposDados {

	public static void main(String[] args) {
		
		// -128 até 127
		byte numeroPequeno = 127;
		System.out.println("byte: " + numeroPequeno);
		
		// -32768 até 32767
		short numeroMaior = 128;
		System.out.println("short: " + numeroMaior);
		
		// -2,147,483,648 até 2,147,483,647 
		int numero = 2147483647;
		System.out.println("int: " + numero);
		
		// -9223372036854775808 até 9223372036854775807
		long numeroGrandao = 9223372036854775807l;
		System.out.println("long: " + numeroGrandao);
		
		// 9.99 or 3.14515
		float valor = 123.12345f;
		System.out.println("float: " + valor);
		
		double numeroGrande = 123456.123456;
		System.out.println("double: " + numeroGrande);
		
		// apenas um caracterer
		char caracter = 'f';
		System.out.println("char: " + caracter);
		
		// conjunto de caracteres
		String nome = "Mateus Alves Conceição";
		System.out.println("String: " + nome);
		
		// verdadeiro ou falso
		boolean questao = true;
		System.out.println("boolean: " + questao);
		
	}
}