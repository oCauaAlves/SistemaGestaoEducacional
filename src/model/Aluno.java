package model;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;

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
}
