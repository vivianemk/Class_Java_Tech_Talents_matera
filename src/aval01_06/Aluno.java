package aval01_06;

public class Aluno  {
	private String nome;
	private	int matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno(String nome, int matricula) {
	    this.nome = nome;
		this.matricula = matricula;
	}


	public void calculaMedia() {
		System.out.println("A m�dia das notas = " + (this.nota1+this.nota2+this.nota3+this.nota4)/4);
		
	}


 public void verificarAprovacao() {
	 double media = (this.nota1+this.nota2+this.nota3+this.nota4)/4;
	 if(media>=7) {
		 System.out.println("Aluno aprovado");
	 }else {
		 System.out.println("Aluno reprovado");
	 }
 }


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public Aluno(String nome, int matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
}