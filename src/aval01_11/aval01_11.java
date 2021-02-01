//Escreva um algoritmo que inverta o conteúdo de uma String utilizando uma estrutura de repetição.
//O usuário irá entrar com o valor de uma string, por exemplo "ASDFG", e o programa deverá devolver o seguinte resultado "GFDSA". 
//Dicas: Você irá usar os seguinte métodos ou atributos:


package aval01_11;

import java.util.Scanner;

public class aval01_11 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite a palavra a ser invertida :");
		String palavra = in.next();
		char[] letras = new char[palavra.length()];
		for(int i=0;i<palavra.length(); i++ ) {
			letras[i] = palavra.charAt(i);

		}


		for (int i = letras.length - 1; i >= 0; i--) {
			char c = letras[i];
			System.out.print(letras[i]);
		}
	}

}
