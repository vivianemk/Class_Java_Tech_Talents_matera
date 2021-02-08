//Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

package dia07;

import java.util.Scanner;

public class ex07_03 {
	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		int[]num = new int[3];
		int i =0;
		int numpar = 0;

		for(i=0; i<3; i++) {
			num[i] = in.nextInt();
			if(num[i]% 2== 0) {
				numpar=numpar+1;
			}

		}
		System.out.println("Quantidade de numeros pares: " + numpar);
	}

}
