//Escreva um algoritmo que inverta o conte�do de uma String utilizando uma estrutura de repeti��o.
//O usu�rio ir� entrar com o valor de uma string, por exemplo "ASDFG", e o programa dever� devolver o seguinte resultado "GFDSA". 
//Dicas: Voc� ir� usar os seguinte m�todos ou atributos:


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
