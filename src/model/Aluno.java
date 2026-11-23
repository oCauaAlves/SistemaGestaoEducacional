
package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario implements Autenticacao {

    private String matricula;
    private String curso;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    // Construtor
    public Aluno(String nome, String matricula, String curso, String login, String senha) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Autenticação
    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }

    // Adicionar avaliação
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
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
