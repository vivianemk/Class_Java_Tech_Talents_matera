//Escreva um programa que receba como entrada o n�mero do m�s (1, 2, ..., 12) e o ano (0, ..., 2xxx),
//e devolva para o usu�rio a quantidade de dias que tem aquele m�s.
//Dica: preste aten��o com anos bissextos.


package aval01_13;

import java.util.Scanner;

public class aval01_13 {
	public static void main(String[] args) {
		System.out.println("Digite o numero do m�s e logo em seguida o numero do ano");
		Scanner in = new Scanner(System.in);
		int mes = in.nextInt();
		int ano = in.nextInt();
		boolean bissexto;
		// divisivel por 400 OU
		// divis�vel por 4 - E
		// n�o pode ser divisivel por 100;
		if( ( ano %400==0)||(ano % 4==0 && ano%100 !=0)) {
			bissexto = true;
		} else {
			bissexto = false;
		}

		if(mes==2&&bissexto) {
			System.out.println("qde dia � igual a 29");
		} else if (mes==2){
			System.out.println("qde dia � igual a 28");
		} else

			if (mes==4||mes==6||mes==9||mes==11) {
				System.out.println("qde dia � igual a 30");
			}else {
				System.out.println("qde dia � igual a 31");
			}
		in.close();
	}
}
