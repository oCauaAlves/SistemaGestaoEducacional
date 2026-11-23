package model;

public class Administrador extends Usuario implements Autenticacao {

    // Construtor
    public Administrador(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    // Autenticação
    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }
}
