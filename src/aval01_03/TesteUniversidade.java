package aval01_03;

public class TesteUniversidade {
	public static void main(String[] args) {
		
		Universidade universidade = new Universidade("Universidade Federal de Viçosa");
		Pessoa pessoa = new Pessoa("Isacio", universidade, 1980);
		pessoa.exibirPessoa();
	
	}

	
}
