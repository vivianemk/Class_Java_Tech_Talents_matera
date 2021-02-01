//Escreva uma classe que represente um país.
//
//Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira.
//
//Escreva a classe e forneça os seus membros a seguir: Construtor que inicialize o código ISO, o nome e a dimensão do país; Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e dimensão do país;
//
//Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;
//
//Um método que informe se outro país é limítrofe do país que recebeu a mensagem;
//
//Um método que retorne a densidade populacional do país;
//
//Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países. Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.



package aval01_01;

import java.util.ArrayList;

public class Pais {
	private String iso;
	private String nome;
	private double populacao;
	private double dimensão;
	private ArrayList<Pais> fronteira;

	public Pais(String iso, String nome, double populacao, double dimensão) {

		this.iso = iso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensão = dimensão;
		this.fronteira = new ArrayList<>();

	}

	public boolean verificaIgualdade(Pais pais) {
		if(this.iso == pais.getIso()) {
			return true;
		}else {
			return false;
		}
	}

	public double calculaDensidadePopulacional() {
		double resultado = this.populacao/this.dimensão;
		return resultado;

	}

	//getters
	public String getIso() {
		return iso;
	}

	public String getNome() {
		return nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public double getDimensão() {
		return dimensão;
	}

	public ArrayList<Pais> getFronteira() {
		return fronteira;
	}

	//setters
	public void setIso(String iso) {
		this.iso = iso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public void setDimensão(double dimensão) {
		this.dimensão = dimensão;
	}

	public void setFronteira(ArrayList<Pais> fronteira) {
		this.fronteira = fronteira;
	}

}
