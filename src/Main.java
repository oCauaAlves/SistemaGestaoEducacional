
import model.Aluno;
import model.Professor;
import model.Administrador;

public class Main {
    public static void main(String[] args) {

        // Criando usuários
        Aluno aluno = new Aluno("Cauã", "2026001", "ADS", "caua", "123");

        Professor professor = new Professor("Carlos", "Programação", "P001", "carlos", "456");

        Administrador administrador = new Administrador("Maria", "maria", "789");

        // Testando autenticação do aluno
        System.out.println("===== AUTENTICACAO =====");
        System.out.println("Aluno: " + aluno.autenticar("caua", "123"));

        // Testando autenticação do professor
        System.out.println("Professor: " + professor.autenticar("carlos", "456"));

        // Testando autenticação do administrador
        System.out.println("Administrador: " + administrador.autenticar("maria", "789"));

        // Testando login incorreto
        System.out.println("Login incorreto: " + aluno.autenticar("caua", "999"));

        // Identificação do desenvolvedor
        System.out.println("\nDesenvolvido por: Cauã Alves");
    }
}
