//Escreva um algoritmo que leia n�meros insira em um array e ap�s mostre os n�meros informados na tela.


package dia07;

import java.util.Scanner;

public class ex07_01 {
	public static void main(String[] args) {
		//criando meu scanner
		Scanner in = new Scanner(System.in);
		//criando meu vetor com 3 posi��es
		int[] num = new int [3];

		int i = 0;
		for(i=0; i<3 ; i++) {
			num[i] = in.nextInt();
		};

		for(i=0; i<3 ; i++) {
			System.out.println(num[i]);
		};
		
		
	}
}