/*Construa um algoritmo que leia 10 valores inteiros e positivos e:

Encontre o maior valor ok
Encontre o menor valor ok
Calcule a média dos números lidos Esse exercício foi dado na aula 3 e
 agora vamos otimizar ele utilizando o while e for.*/


package dia04;

import java.util.Scanner;

public class ex04_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//criar vetor
		int [] vetor = new int[10];
		int maior=0;
		int soma = 0;
//	Exemplo com while...	
//	   int i =0;
//	   while(i<10) {
//		   vetor[i] = in.nextInt();
//		   i++;
//	   }
//	   

		for(int i=0;i <10 ; i++) {
			System.out.println("Digite valor:");
			vetor[i] = in.nextInt();
		}

		int menor = vetor[0];
		for(int i=0;i <10 ; i++) {
			if(vetor [i]>maior) {
				maior = vetor [i];
			}
			if(vetor[i]<menor) {
				menor = vetor [i];
			}

			soma = soma + vetor[i];
		}
		System.out.println(" Maior = " + maior );
		System.out.println(" Menor = " + menor);
		System.out.println("Média = " + soma/10 );
		
		
	}
}
