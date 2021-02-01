//Escreva um programa que receba um número como entrada e diga se ele é primo ou não.

package aval01_14;

import java.util.Scanner;

public class aval01_14 {
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Digite um numero para verificar se é primo ou não:");
		int num = in.nextInt();
		int contador = 0;
//	Precisa ter apenas 2 divisores para ser primo;
		

	for(int i= num; i > 0; i--) {
		if (num%i==0) {
			contador++;
		}
	}
	if(contador == 2) {
		System.out.println("O número é primo");
	}else
	{
		System.out.println("O número não é primo");
	}
	}

}
