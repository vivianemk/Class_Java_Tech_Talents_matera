////Escreva um algoritmo que simula um jogo da forca simples. 
//o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes, 
//caso o usuario acerte a letra o jogo dirá que ele acertou, c
//aso tenha errado, o numero de tentativas vai diminuindo.
//Caso o numero de tentativas chegue a 0 o usuário perde.

package dia07;

import java.util.Scanner;

public class ex07_05 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
	    System.out.println("Digite a palavavra para ser adivinhada");
		String palavra = in.next();
		//vetor de caracteres do tamanho da palavra
		char[] letras = new char[palavra.length()];
		
		String letra = in.next();
		int tentativas = 0;
		
		
		for(int i=0; i <palavra.length(); i++) {
			if (letra.charAt(i) == palavra.charAt(i)) {
				System.out.println("Acertou");
			}
			else {
				tentativas--;
			}
			
			//grava letra da palavra na posição do vetor letra
//			letras[i] = palavra.charAt(i);
		}
		
		
//		for (int j = 0; j < letras.length; j++) {
//			System.out.println(letras[j]);
//		}
	}

}
