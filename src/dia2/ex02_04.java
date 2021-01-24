//Escreva um algoritmo para ler o número total de eleitores de um município,
//o número de votos brancos, nulos e válidos.
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
package dia2;

import java.util.Scanner;


public class ex02_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite total de eleitores ");
		int totalDeEleitores = in.nextInt();
		System.out.println("Digite total de votos brancos");
		int brancos = in.nextInt();
		System.out.println("Digite total de votos nulos ");
		int nulos = in.nextInt();
		System.out.println("Digite total de votos validos ");
		int validos = in.nextInt();
		
		
		double calcularPercentualBrancos = (brancos*100/totalDeEleitores);
	    double calcularPercentualNulos = (nulos*100/totalDeEleitores);
		double calcularPercentualValidos = (validos*100/totalDeEleitores);
		
		System.out.println("Percentual de votos Brancos: " + calcularPercentualBrancos +"%");
		System.out.println("Percentual de votos Nulos: " + calcularPercentualNulos + "%");
		System.out.println("Percentual de votos Validos: " + calcularPercentualValidos +"%");

		
		in.close();
		
		
	}

}
