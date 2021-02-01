////Escreva uma classe Continente.
//
//Um continente possui um nome e � composto por um conjunto de pa�ses.
//Forne�a os membros de classe a seguir:
//Construtor que inicialize o nome do continente;ok
//Um m�todo que permita adicionar pa�ses aos continentes;ok
//Um m�todo que retorne a dimens�o total do continente;ok
//Um m�todo que retorne a popula��o total do continente;ok
//Um m�todo que retorne a densidade populacional do continente;ok
//Um m�todo que retorne o pa�s com maior popula��o no continente;ok
//Um m�todo que retorne o pa�s com menor popula��o no continente;ok
//Um m�todo que retorne o pa�s de maior dimens�o territorial no * continente;OK
//Um m�todo que retorne o pa�s de menor dimens�o territorial no * continente;OK
//Um m�todo que retorne a raz�o territorial do maior pais em rela��o ao menor pa�s.

package aval01_02;

import java.util.ArrayList;

public class Continente {
	String nome;
	private ArrayList<Pais> paises;

	public Continente(String nome) {
		this.paises= new ArrayList<Pais>();
		this.nome = nome;
	}
	public void adicionarPais(Pais pais) {
		this.paises.add(pais);
	}
	
	public int exibirArea() {
		int area =0; 
		for (int i = 0; i <this.paises.size(); i++) {
			area+= this.paises.get(i).getArea();	
		}
		return area;
	}
	
	public int exibirPopulacao() {
		int populacao =0; 
		for (int i = 0; i <this.paises.size(); i++) {
			populacao += this.paises.get(i).getPopulacao();	
		}
		return populacao;
	}
	
	public int densidadePopulacional() {
		int densidade = this.exibirPopulacao()/this.exibirArea();
		return densidade;
	}
	
	public int maiorPopulacao() {
		int maior = 0;
		int posicao = 0;
		for (int i = 0; i < this.paises.size(); i++) {
			if (maior < this.paises.get(i).getPopulacao()) {
				maior = this.paises.get(i).getPopulacao();
				posicao = i;
			}
		}
		return posicao;
	}
	
	public int menorPopulacao() {
		int menor = this.paises.get(0).getPopulacao();
		int posicao = 0;
		for (int i = 0; i < this.paises.size(); i++) {
			if (menor >= this.paises.get(i).getPopulacao()) {
				menor = this.paises.get(i).getPopulacao();
				posicao = i;
			}
		}
		return posicao;
	}
	
	public int maiorArea() {
		int maior = 0;
		int posicao = 0;
		for (int i = 0; i < this.paises.size(); i++) {
			if (maior < this.paises.get(i).getArea()) {
				maior = this.paises.get(i).getArea();
				posicao = i;
			}
		}
		return posicao;
	}
	
	public int menorArea() {
		int menor = this.paises.get(0).getArea();
		int posicao = 0;
		for (int i = 0; i < this.paises.size(); i++) {
			if (menor >= this.paises.get(i).getArea()) {
				menor = this.paises.get(i).getArea();
				posicao = i;
			}
		}
		return posicao;
	}
	
	public int razaoArea() {
		int razao = (this.paises.get(this.menorArea()).getArea()*100)/this.paises.get(this.maiorArea()).getArea();
		return razao;
	}

	public String getNome() {
		return nome;
	}
	public String getPais(int num) {
		return this.paises.get(num).getNome();
	}

}
