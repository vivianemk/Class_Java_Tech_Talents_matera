package aval01_09;

public class ConversaoDeUnidadesDeTempo {

	public void minSeg (int num1) {
		System.out.println("Minuto : " + num1*60 + " s");
	}
	public void horaMin (int num1) {
		System.out.println("Hora :" + num1*60 + " min");
	}
	public void diaHora (int num1) {
		System.out.println("Dia : " + (num1*24) + " horas");
	}
	public void semDia (int num1) {
		System.out.println("Semana:" + (num1*7 ) + " dias");
	}
	public void mesDias (int num1) {
		System.out.println("Mês:" + (num1*30) + " dias");
	}
	public void anoDias (int num1) {
		System.out.println("Ano: " + (num1*360) + " dias");
	}
}



