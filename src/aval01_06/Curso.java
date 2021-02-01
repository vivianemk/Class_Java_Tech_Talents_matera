//Escreva uma classe Curso ok

//Que possui nome e horário.ok
//Cada curso tem Professor ok
//Professor possui nome, departamento e email.ok
//Cada Curso também pode ter vários alunos(tipo Aluno).ok
//Cada aluno tem nome, matricula e 4 notas.ok
//Crie métodos para calcular a media final do aluno.ok
//Crie método para verificar se o aluno está aprovador(media maior ou igual a 7).ok
//Crie um metodo para calcular a media da turma


package aval01_06;

import java.util.ArrayList;

public class Curso {
	String nome;
	String horario;
	Professor professor;
	private ArrayList<Aluno> alunos;
	
	public Curso(String nome, String horario) {
//		Cria uma nova lista de alunos quando for criado novo curso
		this.alunos= new ArrayList<Aluno>();	
		this.nome = nome;
		this.horario = horario;
	}
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	public void calcularMediaTurma() {
		double soma = 0;
		for (int i = 0; i <this.alunos.size(); i++) {
			soma += this.alunos.get(i).getNota1()+this.alunos.get(i).getNota2()+this.alunos.get(i).getNota3()+this.alunos.get(i).getNota4();
		}
		System.out.println("Media geral da turma do curso : " + (soma/(this.alunos.size()*4)));
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	

}
