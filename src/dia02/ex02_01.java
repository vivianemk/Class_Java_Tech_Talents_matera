//Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. 
//A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. 
//Ao final, escrever os valores que ficaram armazenados nas variávei

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
