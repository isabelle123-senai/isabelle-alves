package exercico04;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    String nome;
    int idade;
    String matricula;
    String curso;
    double mediaFinal;

    public Aluno(String nome, int idade, String matricula, String curso, double mediaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.mediaFinal = mediaFinal;
    }
}

public class ex03 {

	 private List<Aluno> alunos = new ArrayList<>();

	    public void adicionarAluno(String nome, int idade, String matricula, String curso, double mediaFinal) {
	        alunos.add(new Aluno(nome, idade, matricula, curso, mediaFinal));
	    }

	    public List<Aluno> filtrarAlunos(String curso, int idadeMinima, double mediaMinima) {
	        List<Aluno> resultado = new ArrayList<>();

	        for (Aluno aluno : alunos) {
	            if (aluno.curso.equalsIgnoreCase(curso)
	                    && aluno.idade >= idadeMinima
	                    && aluno.mediaFinal >= mediaMinima) {
	                resultado.add(aluno);
	            }
	        }

	        return resultado;
	    } 
	    public Aluno buscarPorMatricula(String matricula) {
	        for (Aluno aluno : alunos) {
	            if (aluno.matricula.equalsIgnoreCase(matricula)) {
	                return aluno;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        ex03 sistema = new ex03();

	        sistema.adicionarAluno("Ana", 20, "A001", "Engenharia", 8.5);
	        sistema.adicionarAluno("Bruno", 22, "A002", "Engenharia", 6.0);
	        sistema.adicionarAluno("Carlos", 19, "A003", "Direito", 7.5);
	        sistema.adicionarAluno("Diana", 21, "A004", "Engenharia", 9.0);

	       List<Aluno> filtrados = sistema.filtrarAlunos("Engenharia", 20, 7.0);

	        System.out.println("Alunos filtrados:");
	        for (Aluno a : filtrados) {
	            System.out.println(a.nome + " - " + a.curso + " - Média: " + a.mediaFinal);
	        }

	       
	        Aluno encontrado = sistema.buscarPorMatricula("A003");

	        if (encontrado != null) {
	            System.out.println("\nAluno encontrado:");
	            System.out.println(encontrado.nome + " - " + encontrado.curso);
	        } else {
	            System.out.println("Aluno não encontrado.");
	        }
	    }
}
