/*Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). 
 * O algoritmo deverá perguntar qual é a escolha do jogador 1 
 * (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2. 
 * No final da execução o algoritmo deverá dizer qual é o jogador vencedor 
 * ou se houve empate.
 * */

package dia03;

import java.util.Scanner;

public class ex03_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Jogador 1 : Escolha Pedra [pe], Papel [pa], Tesoura [t] ");
		String jogador1 = in.next();

		System.out.println("Jogador 2 : Escolha Pedra [pe], Papel [pa], Tesoura [t] ");
		String jogador2 = in.next();

		if(jogador1.equals(jogador2)) {
			System.out.println("Empate");
		} else if(jogador1.equals("pa")) {
			if(jogador2.equals("t")) {
				System.out.println("jogador 1 perdeu o jogo");
			}
			else {
				System.out.println("jogador 1 ganhou o jogo");
			}

		}
		else if(jogador1.equals("t")) {
			if(jogador2.equals("pe")) {
				System.out.println("jogador 1 perdeu o jogo");
			}
			else {
				System.out.println("jogador 1 ganhou o jogo");
			}

		}
		else if(jogador1.equals("pe")) {
			if(jogador2.equals("pa")) {
				System.out.println("jogador 1 perdeu o jogo");
			}
			else {
				System.out.println("jogador 1 ganhou o jogo");
			}

		}
		in.close();
	}
}




