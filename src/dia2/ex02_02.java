//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

package dia2;
 import java.util.Scanner;
 
public class ex02_02 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	
	System.out.println("Antecessor é " +  (a -1));
}
}
