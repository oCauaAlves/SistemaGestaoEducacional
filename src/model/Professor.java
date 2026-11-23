
package model;

public class Professor extends Usuario implements Autenticacao, GeravelRelatorio {

    private String especialidade;
    private String registro;

    // Construtor
    public Professor(String nome, String especialidade, String registro, String login, String senha) {
        super(nome, login, senha);
        this.especialidade = especialidade;
        this.registro = registro;
    }

    // Autenticação
    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }

    // Gerar Relatório Professor
    @Override
    public void gerarRelatorio() {
        System.out.println("===== RELATORIO DO PROFESSOR =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Registro: " + registro);
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
