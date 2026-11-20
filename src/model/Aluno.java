
package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    // Construtor
    public Aluno(String nome, String matricula, String curso) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula inválida!");
        }

        if (curso == null || curso.isBlank()) {
            throw new IllegalArgumentException("Curso inválido!");
        }

        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Adicionar avaliação ao aluno
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}
