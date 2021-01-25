//Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
//Escreva um algoritmo que determina o maior também.

package dia03;

import java.util.Scanner;

public class ex03_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite numero a");
	
		int a = in.nextInt();
		
		System.out.println("Digite numero b");
		
		int b = in.nextInt();
		
		if(a <b ) {
			System.out.println("a menor que b");
		} else
			System.out.println(" a é maior que b");
		in.close();
	}

}
