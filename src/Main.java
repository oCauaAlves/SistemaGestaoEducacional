
import model.Aluno;
import model.Professor;
import model.Curso;
import model.Turma;
import model.Avaliacao;

public class Main {
    public static void main(String[] args) {

        // Criando alunos
        Aluno aluno1 = new Aluno("Cauã", "2026001", "ADS");
        Aluno aluno2 = new Aluno("João", "2026002", "ADS");

        // Criando professor
        Professor professor = new Professor(
                "Carlos", "Programação", "P001"
        );

        // Criando curso
        Curso curso = new Curso(
                "Análise e Desenvolvimento de Sistemas",
                "ADS01",
                2400
        );

        // Criando turma
        Turma turma = new Turma("T001", professor, curso);

        // Adicionando alunos à turma
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        // Criando avaliações
        Avaliacao avaliacao1 = new Avaliacao("Prova de Java");
        Avaliacao avaliacao2 = new Avaliacao("Trabalho de POO");

        // Atribuindo notas
        avaliacao1.atribuirNota(9.5);
        avaliacao2.atribuirNota(8.0);

        // Associando avaliações aos alunos
        aluno1.adicionarAvaliacao(avaliacao1);
        aluno2.adicionarAvaliacao(avaliacao2);

        // Exibindo avaliações dos alunos da turma
        System.out.println("===== AVALIACOES DA TURMA =====");

        for (Aluno aluno : turma.getListaAlunos()) {
            System.out.println("\nAluno: " + aluno.getNome());

            for (Avaliacao avaliacao : aluno.getAvaliacoes()) {
                System.out.println("Avaliação: "
                        + avaliacao.getDescricao());

                System.out.println("Nota: "
                        + avaliacao.getNota());
            }
        }

        // Testando validação da nota
        System.out.println("\n===== TESTE DE VALIDACAO =====");

        try {
            avaliacao1.atribuirNota(11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Identificação do desenvolvedor
        System.out.println("\nDesenvolvido por: Cauã Alves");
    }
}
