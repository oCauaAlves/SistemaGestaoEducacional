package model;

public class Professor {

    private String nome;
    private String especialidade;
    private String registro;

    public Professor(String nome, String especialidade, String registro) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        if (especialidade == null || especialidade.isBlank()) {
            throw new IllegalArgumentException("Especialidade inválida!");
        }

        if (registro == null || registro.isBlank()) {
            throw new IllegalArgumentException("Registro inválido!");
        }

        this.nome = nome;
        this.especialidade = especialidade;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
