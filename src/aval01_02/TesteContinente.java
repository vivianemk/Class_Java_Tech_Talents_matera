package aval01_02;

public class TesteContinente {
public static void main(String[] args) {
	Continente continente = new Continente("America do Sul");
	Pais brasil = new Pais("Brasil", 8510295, 211755692);
	Pais argentina = new Pais("Argentina", 2780400, 44938712);
	continente.adicionarPais(brasil);
	continente.adicionarPais(argentina);

	
	
	System.out.println("Area do continente = " + continente.exibirArea()+ " Km2");
	System.out.println("Popula��o do continente = " + continente.exibirPopulacao());
	System.out.println("Densidade populacional = " + continente.densidadePopulacional() + " popula��o/Km2");
	System.out.println("Pais de maior popula��o do continente = " + continente.getPais(continente.maiorPopulacao()));
	System.out.println("Pais de menor popula��o do continente = " + continente.getPais(continente.menorPopulacao()));
	
	System.out.println("Pais de maior area do continente = " + continente.getPais(continente.maiorArea()));
	System.out.println("Pais de menor area do continente  = " + continente.getPais(continente.menorArea()));
	
	System.out.println("A raz�o entre o maior pais e o menor pais � de " + continente.razaoArea());
}
}
