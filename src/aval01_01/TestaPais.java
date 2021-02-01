package aval01_01;

public class TestaPais {

	public static void main(String[] args) {
		Pais pais = new Pais ("BRA", "Brasil",2400000.0,1222222.0);
		System.out.println("Nome: " + pais.getNome());
		System.out.println("Codigo iso:  " + pais.getIso());
		System.out.println("Area : " + pais.getDimensão());
		System.out.println("Densidade populacional : " + pais.calculaDensidadePopulacional());

	}

}
