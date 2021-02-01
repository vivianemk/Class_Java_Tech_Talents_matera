/*Construa um algoritmo que leia 10 valores inteiros e positivos e:

Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos Esse exercício foi dado na aula 3 e
 agora vamos otimizar ele utilizando o while e for.*/


package dia04;

import java.util.Scanner;

public class ex04_01 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//criar vetor
	int [] vetor = new int[9];
    int maior=0;
    int menor=0;
	for(int i=0;i <10 ; i++) {
		System.out.println("Digite valor:");
	vetor[i] = in.nextInt();
	}
	for(int i=0;i <10 ; i++) {
		if(vetor [i]>maior) {
			maior = vetor [i];
		}
		if(vetor[i]>menor) {
			menor = vetor [i];
		}
	}
}
}
