package aval01_03;

public class Pessoa {
 private String nome;
 private Universidade universidade;
 private int anoEntrada;
 
 
public Pessoa(String nome, Universidade universidade, int anoEntrada) {
	this.nome = nome;
	this.universidade = universidade;
	this.anoEntrada = anoEntrada;
}
public void exibirPessoa() {
	System.out.println("Nome: " + this.getNome());
	System.out.println("Instituição de ensino: " + this.universidade.getNome());
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Universidade getUniversidade() {
	return universidade;
}
public void setUniversidade(Universidade universidade) {
	this.universidade = universidade;
}
public int getAnoEntrada() {
	return anoEntrada;
}
public void setAnoEntrada(int anoEntrada) {
	this.anoEntrada = anoEntrada;
}
 
 
 

}
