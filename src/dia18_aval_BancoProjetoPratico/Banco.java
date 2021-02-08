package dia18_aval_BancoProjetoPratico;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	//atributos
	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();

	//metodo construtor
	public Banco(String nome) {
		this.nome = nome;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);

	}

	//getter
	public String getNome() {
		return nome;
	}

	public int getConta(String nome) {
		int pos = 0;
		for (int i=0; i< this.contas.size(); i++) {
			if (this.contas.get(i).getCliente().getNome().equals(nome)) {
				pos = i;
			}
		}
		
		return pos;
	}

	public List<Conta> getContas() {
		return contas;
	}


}
