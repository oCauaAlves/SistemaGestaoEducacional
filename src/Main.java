 import model.Aluno;
import model.Professor;
import model.Curso;
import model.Avaliacao;
import model.GeravelRelatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando aluno
        Aluno aluno = new Aluno(
                "Cauã", "2026001", "ADS",
                "caua", "123"
        );

        // Criando professor
        Professor professor = new Professor(
                "Carlos", "Programação", "P001",
                "carlos", "456"
        );

        // Criando curso
        Curso curso = new Curso(
                "Análise e Desenvolvimento de Sistemas",
                "ADS01",
                2400
        );

        // Criando e associando avaliação ao aluno
        Avaliacao avaliacao = new Avaliacao("Prova de Java");
        avaliacao.atribuirNota(9.5);
        aluno.adicionarAvaliacao(avaliacao);

        // Lista genérica de relatórios
        List<GeravelRelatorio> relatorios = new ArrayList<>();

        relatorios.add(aluno);
        relatorios.add(professor);
        relatorios.add(curso);

        int opcao;

        do {
            System.out.println("\n===== MENU DE RELATORIOS =====");
            System.out.println("1 - Relatório de Aluno");
            System.out.println("2 - Relatório de Professor");
            System.out.println("3 - Relatório de Curso");
            System.out.println("4 - Gerar todos os relatórios");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    relatorios.get(0).gerarRelatorio();
                    break;

                case 2:
                    relatorios.get(1).gerarRelatorio();
                    break;

                case 3:
                    relatorios.get(2).gerarRelatorio();
                    break;

                case 4:
                    System.out.println("\n===== TODOS OS RELATORIOS =====");

                    for (GeravelRelatorio relatorio : relatorios) {
                        relatorio.gerarRelatorio();
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("\nDesenvolvido por: Cauã Alves");

        scanner.close();
    }
}
