
package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private Professor professor;
    private Curso curso;
    private List<Aluno> listaAlunos;

    // Construtor
    public Turma(String codigo, Professor professor, Curso curso) {
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
        this.listaAlunos = new ArrayList<>();
    }

    // Adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    // Remover aluno por matrícula
    public void removerAluno(String matricula) {
        listaAlunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    // Exibir resumo da turma
    public void exibirResumo() {
        System.out.println("===== RESUMO DA TURMA =====");
        System.out.println("Código: " + codigo);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : listaAlunos) {
            System.out.println("- " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
        }
        System.out.println("\nQuantidade de alunos matriculados: " + listaAlunos.size());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
