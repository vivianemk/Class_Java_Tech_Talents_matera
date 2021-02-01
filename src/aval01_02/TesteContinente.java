package aval01_02;

public class TesteContinente {
public static void main(String[] args) {
	Continente continente = new Continente("America do Sul");
	Pais brasil = new Pais("Brasil", 8510295, 211755692);
	Pais argentina = new Pais("Argentina", 2780400, 44938712);
	continente.adicionarPais(brasil);
	continente.adicionarPais(argentina);

	
	
	System.out.println("Area do continente = " + continente.exibirArea()+ " Km2");
	System.out.println("População do continente = " + continente.exibirPopulacao());
	System.out.println("Densidade populacional = " + continente.densidadePopulacional() + " população/Km2");
	System.out.println("Pais de maior população do continente = " + continente.getPais(continente.maiorPopulacao()));
	System.out.println("Pais de menor população do continente = " + continente.getPais(continente.menorPopulacao()));
	
	System.out.println("Pais de maior area do continente = " + continente.getPais(continente.maiorArea()));
	System.out.println("Pais de menor area do continente  = " + continente.getPais(continente.menorArea()));
	
	System.out.println("A razão entre o maior pais e o menor pais é de " + continente.razaoArea());
}
}
