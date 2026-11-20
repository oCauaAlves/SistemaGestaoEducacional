package model;

public class Avaliacao {

    private double nota;
    private String descricao;

    // Construtor
    public Avaliacao(String descricao) {
        this.descricao = descricao;
        this.nota = 0;
    }

    // Atribuir nota com validação
    public void atribuirNota(double valor) {
        if (valor < 0 || valor > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10!");
        }
        this.nota = valor;
    }

    // Getters
    public double getNota() {
        return nota;
    }

    public String getDescricao() {
        return descricao;
    }
}
