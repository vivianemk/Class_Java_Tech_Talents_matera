//Escreva uma classe ConversaoDeUnidadesDeTempo com m�todos est�ticos para convers�o aproximada de velocidade segundo a lista abaixo.

//1 minuto = 60 segundos
//1 hora = 60 minutos
//1 dia = 24 horas
//1 semana = 7 dias
//1 m�s = 30 dias
//1 ano = 365 dias


package aval01_09;

import java.util.Scanner;

public class aval01_09 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero para convers�o em unidade de tempo:" );
		int num1 = in.nextInt();
		
		ConversaoDeUnidadesDeTempo conversao = new ConversaoDeUnidadesDeTempo();
		
		conversao.minSeg(num1);
		conversao.horaMin(num1);
		conversao.diaHora(num1);
		conversao.semDia(num1);
		conversao.mesDias(num1);
		conversao.anoDias(num1);
	}

}
