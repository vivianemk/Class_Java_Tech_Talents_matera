//Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.

package dia07;

import java.util.Scanner;

public class ex07_04 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] num = new int[3];
		int i =0;
		int maior = 0;
		
		for(i=0; i<3; i++) {
			num[i]= in.nextInt();
			if(num[i]>maior) {
				maior= num[i];
			}
		}
		System.out.println("Maior numero = " + maior);
	}

}
