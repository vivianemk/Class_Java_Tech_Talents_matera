package dia03;
//Escreva um algoritmo que leia um n�mero inteiro e diga se ele � par ou �mpar.

import java.util.Scanner;

public class ex03_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		int a = in.nextInt();

		if(a % 2 == 0) {
			System.out.println("numero par ");
		}
		else {
			System.out.println("numero impar");
		}
		in.close();
	}

}
