
package ui;

import model.Aluno;
import model.Professor;
import model.Curso;
import service.AlunoService;
import service.ProfessorService;
import service.CursoService;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private AlunoService alunoService;
    private ProfessorService professorService;
    private CursoService cursoService;

    public Menu(AlunoService alunoService,
                ProfessorService professorService,
                CursoService cursoService) {

        this.alunoService = alunoService;
        this.professorService = professorService;
        this.cursoService = cursoService;
    }

    public void executar() {

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE GESTAO EDUCACIONAL =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar curso");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar professores");
            System.out.println("6 - Listar cursos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:
                    cadastrarAluno();
                    break;

                case 2:
                    cadastrarProfessor();
                    break;

                case 3:
                    cadastrarCurso();
                    break;

                case 4:
                    listarAlunos();
                    break;

                case 5:
                    listarProfessores();
                    break;

                case 6:
                    listarCursos();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("\nDesenvolvido por: Cauã Alves");
    }

    private void cadastrarAluno() {

        System.out.println("\n===== CADASTRAR ALUNO =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, curso, login, senha);

        alunoService.cadastrarAluno(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void cadastrarProfessor() {

        System.out.println("\n===== CADASTRAR PROFESSOR =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        System.out.print("Registro: ");
        String registro = scanner.nextLine();

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Professor professor = new Professor(
                nome, especialidade, registro, login, senha
        );

        professorService.cadastrarProfessor(professor);

        System.out.println("Professor cadastrado com sucesso!");
    }

    private void cadastrarCurso() {

        System.out.println("\n===== CADASTRAR CURSO =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Carga horária: ");
        int cargaHoraria = Integer.parseInt(scanner.nextLine());

        Curso curso = new Curso(nome, codigo, cargaHoraria);

        cursoService.cadastrarCurso(curso);

        System.out.println("Curso cadastrado com sucesso!");
    }

    private void listarAlunos() {

        System.out.println("\n===== ALUNOS CADASTRADOS =====");

        for (Aluno aluno : alunoService.listarAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("-----------------------------");
        }
    }

    private void listarProfessores() {

        System.out.println("\n===== PROFESSORES CADASTRADOS =====");

        for (Professor professor : professorService.listarProfessores()) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Especialidade: " + professor.getEspecialidade());
            System.out.println("Registro: " + professor.getRegistro());
            System.out.println("-----------------------------");
        }
    }

    private void listarCursos() {

        System.out.println("\n===== CURSOS CADASTRADOS =====");

        for (Curso curso : cursoService.listarCursos()) {
            System.out.println("Nome: " + curso.getNome());
            System.out.println("Código: " + curso.getCodigo());
            System.out.println("Carga horária: " + curso.getCargaHoraria());
            System.out.println("-----------------------------");
        }
    }
}
