
import model.Aluno;
import model.Professor;
import model.Curso;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     SISTEMA DE GESTAO EDUCACIONAL");
        System.out.println("========================================");
        System.out.println("Desenvolvido por: Cauã Alves\n");

        // Criando objetos
        Aluno aluno = new Aluno("Cauã", "2026001", "ADS");

        Professor professor = new Professor(
                "Carlos", "Programação", "P001"
        );

        Curso curso = new Curso(
                "Análise e Desenvolvimento de Sistemas",
                "ADS01",
                2400
        );

        // Exibindo aluno
        System.out.println("--- ALUNO ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        // Exibindo professor
        System.out.println("\n--- PROFESSOR ---");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());
        System.out.println("Registro: " + professor.getRegistro());

        // Exibindo curso
        System.out.println("\n--- CURSO ---");
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Código: " + curso.getCodigo());
        System.out.println("Carga horária: " + curso.getCargaHoraria() + " horas");

        // Testando validações
        System.out.println("\n--- TESTES DE VALIDACAO ---");

        try {
            Aluno alunoInvalido = new Aluno("", "2026002", "ADS");
        } catch (IllegalArgumentException e) {
            System.out.println("Aluno rejeitado: " + e.getMessage());
        }

        try {
            Curso cursoInvalido = new Curso("ADS", "ADS02", -100);
        } catch (IllegalArgumentException e) {
            System.out.println("Curso rejeitado: " + e.getMessage());
        }

        System.out.println("\n========================================");
        System.out.println("          FIM DA EXECUCAO");
        System.out.println("========================================");
    }
}
