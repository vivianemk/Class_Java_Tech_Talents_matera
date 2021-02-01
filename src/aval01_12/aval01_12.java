//Escreva um programa que permita que o usuário digite um número entre 1 e 7 e ao final, 
//diga para o usuário qual o dia da semana que aquele número representa: 1 (Domingo), 2 (Segunda), ... 7 (Sábado)

package aval01_12;

import java.util.Scanner;

public class aval01_12 {
	
	public static void main(String[] args) {
		System.out.println("Digite um número entre 1 e 7 :  ");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
        switch (numero) {
		case 1 :
			System.out.println("Domingo");
			break;
		case 2 :
			System.out.println("Segunda");
			break;
		case 3 :
			System.out.println("Terça");
			break;
		case 4 :
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6 :
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		case 8:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero não existe");
			break;
		}
        in.close();
   }
}
