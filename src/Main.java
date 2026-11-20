
import model.Aluno;
import model.Professor;
import model.Curso;
import model.Turma;

public class Main {
    public static void main(String[] args) {

        // Criando alunos
        Aluno aluno1 = new Aluno("Cauã", "2026001", "ADS");
        Aluno aluno2 = new Aluno("João", "2026002", "ADS");
        Aluno aluno3 = new Aluno("Pedro", "2026003", "ADS");

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

        // Adicionando alunos
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        // Exibindo resumo da turma
        System.out.println("=== TURMA APÓS ADICIONAR ALUNOS ===");
        turma.exibirResumo();

        // Removendo aluno pela matrícula
        turma.removerAluno("2026002");

        // Exibindo resumo atualizado
        System.out.println("\n=== TURMA APÓS REMOVER ALUNO ===");
        turma.exibirResumo();


        // Identificação do desenvolvedor
        System.out.println("\nDesenvolvido por: Cauã Alves");
    }
}
