

//Escreva uma classe Calculadora que tenha os métodos cada método recebe dois parâmetros:
//somar
//subtrair
//multiplicar
//dividir
//elevar a potência n.

package aval01_10;

import java.util.Scanner;

public class aval01_10 {
	
	public static void main(String[] args) {
		
	 Scanner in = new Scanner (System.in);
	 System.out.println("Digite o numero ");
	 int num1 = in.nextInt();
	 System.out.println("Digite o numero ");
	 int num2 = in.nextInt();
    
	 Calculadora calculadora = new Calculadora();
	 calculadora.soma(num1, num2);
	 calculadora.subtracao(num1, num2);
	 calculadora.multiplicacao(num1, num2);
	 calculadora.divisao(num1, num2);
	 calculadora.potenciaN(num1, num2);

	 
	}

}
