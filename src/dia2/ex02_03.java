//Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), 
//calcular e escrever a �rea do ret�ngulo.

package dia2;
import java.util.Scanner;

public class ex02_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite base :");
		int base = in.nextInt();
		System.out.println("Digite altura: ");

		int altura = in.nextInt();

		int area = base*altura;

		System.out.println("Area do retangulo � " + area );
	}
}
