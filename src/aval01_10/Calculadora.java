////Escreva uma classe Calculadora que tenha os m�todos cada m�todo recebe dois par�metros:

//somar
//subtrair
//multiplicar
//dividir
//elevar a pot�ncia n

package aval01_10;

import java.util.Scanner;

public class Calculadora {
	
		
		void soma (int num1 , int num2){
			System.out.println("Soma = " + (num1+num2));
	}

		void subtracao (int num1 , int num2){
			System.out.println("Subtrair = " + (num1- num2));
	}
		void multiplicacao (int num1 , int num2){
			System.out.println("Multiplicar = " + (num1*num2));
	}
		void divisao(int num1 , int num2){
			
			if(num2==0) {
				System.out.println("Dividir = " + "n�o � divisivel por 0");
				
			}else {
				System.out.println("Dividir = " + (num1/num2));
				
			}
	}
		
		void potenciaN(int num1 , int num2){
			System.out.println("Pot�ncia de n = " + Math.pow(num1,num2));
	}

}
