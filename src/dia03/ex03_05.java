//Escreva um algoritmo em Java que seja capaz de fazer as seguintes opera��es matem�ticas 
//(adi��o, subtra��o, multiplica��o e divis�o).
//Todas as opera��es ser�o entre dois valores. 
//No come�o do algoritmo pergunte ao usu�rio qual opera��o ele deseja fazer e 
//quais s�o os valores.

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

		System.out.println("Qual opera��o deseja fazer : ");
		System.out.println("1-adicao 2-subtracao 3-multiplicacao 4-divisao");
		int operacao = in.nextInt();
		if(operacao == 1) {
			System.out.println("Adi��o: " + adicao );
		} else if (operacao ==2)  {
			System.out.println("Subtra��o: " + subtracao );
		}
		else if (operacao ==3)  { 
			System.out.println("Multiplica��o: " + multiplicacao );

		}
		else if (operacao ==4)  { 
			System.out.println("Divis�o: " + divisao );
		} else {
			System.out.println("Opera��o inv�lida");
		}
		in.close();

	}
	
}
