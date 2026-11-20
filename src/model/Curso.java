package model;

public class Curso {

    private String nome;
    private String codigo;
    private int cargaHoraria;

    // Construtor
    public Curso(String nome, String codigo, int cargaHoraria) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código inválido!");
        }

        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("Carga horária inválida!");
        }

        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
