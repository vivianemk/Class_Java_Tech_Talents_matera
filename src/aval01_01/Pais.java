//Escreva uma classe que represente um pa�s.
//
//Um pa�s � representado atrav�s dos atributos: c�digo ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), popula��o (ex.: 193.946.886) e a sua dimens�o em Km2 (ex.: 8.515.767,049). Al�m disso, cada pa�s mant�m uma lista de outros pa�ses com os quais ele faz fronteira.
//
//Escreva a classe e forne�a os seus membros a seguir: Construtor que inicialize o c�digo ISO, o nome e a dimens�o do pa�s; M�todos de acesso (getter/setter) para as propriedades c�digo ISSO, nome, popula��o e dimens�o do pa�s;
//
//Um m�todo que permita verificar se dois objetos representam o mesmo pa�s (igualdade sem�ntica). Dois pa�ses s�o iguais se tiverem o mesmo c�digo ISO;
//
//Um m�todo que informe se outro pa�s � lim�trofe do pa�s que recebeu a mensagem;
//
//Um m�todo que retorne a densidade populacional do pa�s;
//
//Um m�todo que receba um pa�s como par�metro e retorne a lista de vizinhos comuns aos dois pa�ses. Considere que um pa�s tem no m�ximo 40 outros pa�ses com os quais ele faz fronteira.



package aval01_01;

import java.util.ArrayList;

public class Pais {
	private String iso;
	private String nome;
	private double populacao;
	private double dimens�o;
	private ArrayList<Pais> fronteira;

	public Pais(String iso, String nome, double populacao, double dimens�o) {

		this.iso = iso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimens�o = dimens�o;
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
		double resultado = this.populacao/this.dimens�o;
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

	public double getDimens�o() {
		return dimens�o;
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

	public void setDimens�o(double dimens�o) {
		this.dimens�o = dimens�o;
	}

	public void setFronteira(ArrayList<Pais> fronteira) {
		this.fronteira = fronteira;
	}

}
