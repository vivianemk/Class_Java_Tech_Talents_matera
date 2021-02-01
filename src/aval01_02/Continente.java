////Escreva uma classe Continente.
//
//Um continente possui um nome e é composto por um conjunto de países.
//Forneça os membros de classe a seguir:
//Construtor que inicialize o nome do continente;ok
//Um método que permita adicionar países aos continentes;ok
//Um método que retorne a dimensão total do continente;ok
//Um método que retorne a população total do continente;ok
//Um método que retorne a densidade populacional do continente;ok
//Um método que retorne o país com maior população no continente;ok
//Um método que retorne o país com menor população no continente;ok
//Um método que retorne o país de maior dimensão territorial no * continente;OK
//Um método que retorne o país de menor dimensão territorial no * continente;OK
//Um método que retorne a razão territorial do maior pais em relação ao menor país.

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
