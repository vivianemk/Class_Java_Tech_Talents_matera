package aval01_08;

import java.util.Scanner;

public class aval01_08 {
	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		int x = 0;
		int y = 0;
		double r = 0;
		while (y==0) {

			System.out.println("Eu sei dividir!");
			System.out.println("Informe o primeiro valor:");			
			x = teclado.nextInt();

			System.out.println("Informe o segundo valor:");
			y = teclado.nextInt();

			try {
				r = (x/y);
				System.out.println("O resultado da divisão é :\n" + r);

			} catch (Exception e) {
				System.out.println("não é divisivel por 0 \n");
			}

		}
		teclado.close();
	}

}
