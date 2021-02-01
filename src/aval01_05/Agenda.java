//Escreva uma classe Agenda
//
//cont�m v�rios contatos do tipo Contato.
//Cada contato possui nome, telefone e email.
//Agenda tamb�m possui um nome.
//Crie m�todos que retornam(mostrar na tela) uma String com a informa��o de cada contato

package aval01_05;

import java.util.ArrayList;

public class Agenda {
	
	private String nome;
	private ArrayList<Contato> contatos;
	

	public Agenda(String nome) {
		this.nome = nome;
		this.contatos = new ArrayList<Contato>();
	}
	
	public void adicionaContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public void exibirContato (Contato contato) {
		System.out.println("Agenda : " + this.nome);
		System.out.println("Nome : "+ contato.getNome());
		System.out.println("Telefone: " + contato.getTelefone());
		System.out.println("Email :" + contato.getEmail());
		System.out.println("");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
