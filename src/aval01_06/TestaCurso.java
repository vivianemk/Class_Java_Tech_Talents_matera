package aval01_06;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso curso = new Curso("Bioquimica" , "integral");
		Professor professor = new Professor("Xi Ji Pin" , "Bioquimica", "xijipin@alibaba.com");
		Aluno aluno = new Aluno("Bozo", 171);
		Aluno aluno2= new Aluno ("Kamen Rider", 001 );
		
		
		curso.setProfessor(professor);
		curso.adicionarAluno(aluno);
		curso.adicionarAluno(aluno2);
		aluno.setNota1(1);
		aluno.setNota2(2);
		aluno.setNota3(3);
		aluno.setNota4(0);
		aluno.calculaMedia();
		aluno.verificarAprovacao();
		
		aluno2.setNota1(10);
		aluno2.setNota2(5);
		aluno2.setNota3(4);
		aluno2.setNota4(10);
		aluno2.calculaMedia();
		aluno2.verificarAprovacao();
		curso.calcularMediaTurma();

	}

}
