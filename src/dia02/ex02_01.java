//Escreva um algoritmo que armazene o valor 99 em uma vari�vel Y e o valor 11 em uma vari�vel Z. 
//A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o valor que est� em Y passe para Z e vice-versa. 
//Ao final, escrever os valores que ficaram armazenados nas vari�vei

package dia02;

public class ex02_01 {
public static void main(String[] args) {
	
 int y = 99;
 int z = 11;
 int aux = 0;
 
 System.out.println ( "y= " + y +  " z= " + z);
 
 aux = y;
 y = z;
 z = aux;
 
System.out.println ( "y= " + y +  " z= " + z);
}
}
