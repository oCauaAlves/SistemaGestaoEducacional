
package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario implements Autenticacao,GeravelRelatorio {

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

    // Gerar Relatório Aluno
    @Override
    public void gerarRelatorio() {
        System.out.println("===== RELATORIO DO ALUNO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Quantidade de avaliações: " + avaliacoes.size());

        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println("Avaliação: " + avaliacao.getDescricao() + " | Nota: " + avaliacao.getNota());
        }
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
