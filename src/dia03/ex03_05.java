//Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas 
//(adição, subtração, multiplicação e divisão).
//Todas as operações serão entre dois valores. 
//No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e 
//quais são os valores.

package dia03;

import java.util.Scanner;

public class ex03_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um numero :");
		int a = in.nextInt();
		System.out.println("Digite o segundo numero :");
		int b = in.nextInt();

		int adicao = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		int divisao = a / b;

		System.out.println("Qual operação deseja fazer : ");
		System.out.println("1-adicao 2-subtracao 3-multiplicacao 4-divisao");
		int operacao = in.nextInt();
		if(operacao == 1) {
			System.out.println("Adição: " + adicao );
		} else if (operacao ==2)  {
			System.out.println("Subtração: " + subtracao );
		}
		else if (operacao ==3)  { 
			System.out.println("Multiplicação: " + multiplicacao );

		}
		else if (operacao ==4)  { 
			System.out.println("Divisão: " + divisao );
		} else {
			System.out.println("Operação inválida");
		}
		in.close();

	}
	
}
