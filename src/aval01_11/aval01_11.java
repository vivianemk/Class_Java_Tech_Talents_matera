//Escreva um algoritmo que inverta o conte�do de uma String utilizando uma estrutura de repeti��o.
//O usu�rio ir� entrar com o valor de uma string, por exemplo "ASDFG", e o programa dever� devolver o seguinte resultado "GFDSA". 
//Dicas: Voc� ir� usar os seguinte m�todos ou atributos:


package aval01_11;

import java.util.Scanner;

public class aval01_11 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite a palavra a ser invertida :");
		//insere uma palavra
		String palavra = in.next();
		//cria vetor de letras do tamanho da palavra digitada
		char[] letras = new char[palavra.length()];
		
		//percorre a palavra digitada
		for(int i=0;i<palavra.length(); i++ ) {
			//insere cada letra da palavra em uma posi��o do vetor letras
			letras[i] = palavra.charAt(i);

		}

		//percorre o vetor de letras inversamente da �ltuma para primeira posi��o 
		for (int i = letras.length - 1; i >= 0; i--) {
			//imprime letra do vetor letras
			System.out.print(letras[i]);
		}
		
	}

}
