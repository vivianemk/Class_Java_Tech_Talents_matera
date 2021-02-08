//Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.

package dia04;

import java.util.Scanner;

public class ex04_02 {
	//5*4*3*2*1 = 5
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero para transformar em fatorial ");
		int num =  in.nextInt();
		int i = num-1;

		while(i < num && i != 0) {
			num = num * i;
			i--;    
		}
	System.out.println(num);
	}
}
