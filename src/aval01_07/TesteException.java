package aval01_07;

public class TesteException {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();



		} catch (Exception e) {
			System.out.println("O numero do indice do vetor não existe ");
		}
		System.out.println("Fim do main");
	}
	static void metodo1() {
		System.out.println("Inicio do método1");
		metodo2();
		System.out.println("fim do método1");
	}
	static void metodo2() {
		System.out.println("Inicio do método2");
		int[] array = new int[10];
		for(int i = 0; i<=15; i++) {
			array[i] = i;
			System.out.println(i);

		}
		System.out.println("fim do método2");
	}
}
