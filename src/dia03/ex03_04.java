//Construa um algoritmo que leia 10 valores inteiros e positivos e:

//Encontre o maior valor
//Encontre o menor valor
//Calcule a média dos números lidos

package dia03;

import java.util.Scanner;

public class ex03_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println( "Digite um numero ");
		int a = in.nextInt();
		System.out.println( "Digite um numero ");
		int b = in.nextInt();
		System.out.println( "Digite um numero ");
		int c = in.nextInt();
		System.out.println( "Digite um numero ");
		int d = in.nextInt();
		System.out.println( "Digite um numero ");
		int e = in.nextInt();
		System.out.println( "Digite um numero ");
		int f = in.nextInt();
		System.out.println( "Digite um numero ");
		int g = in.nextInt();
		System.out.println( "Digite um numero ");
		int h = in.nextInt();
		System.out.println( "Digite um numero ");
		int i = in.nextInt();
		System.out.println( "Digite um numero ");
		int j = in.nextInt();

		int maior = a;
		int menor = a;

		if(b > maior) {
			maior = b;
		}

		if(c > maior) {
			maior = c;
		}

		if(d > maior) {
			maior = d;
		}

		if(e > maior) {
			maior = e;
		}
		if(f > maior) {
			maior = f;
		}
		if(g > maior) {
			maior = g;
		}

		if(h> maior) {
			maior =h;
		}

		if(i > maior) {
			maior = i;
		}

		if(j > maior) {
			maior = j;
		}


		System.out.println("Maior é : " + maior);



		if(b < menor) {
			menor = b;
		}

		if(c < menor) {
			menor = c;
		}

		if(d < menor) {
			menor = d;
		}

		if(e < menor) {
			menor = e;
		}
		if(f < menor) {
			menor = f;
		}
		if(g < menor) {
			menor = g;
		}

		if(h< menor) {
			menor =h;
		}

		if(i < menor) {
			menor = i;
		}

		if(j < menor) {
			menor = j;
		}


		System.out.println("menor é : " + menor);


		int somaDeValores = a+b+c+d+e+f+g+h+i+j;

		System.out.println(" A média é : " + somaDeValores/10 );

		in.close();

	}

}
