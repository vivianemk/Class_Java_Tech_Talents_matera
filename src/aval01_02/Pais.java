package aval01_02;

public class Pais {
	private	String nome;
	private	int area;
	private int populacao;
	
	
	public Pais(String nome, int area, int populacao) {
	
		this.nome = nome;
		this.area = area;
		this.populacao = populacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	
}
