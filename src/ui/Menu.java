
package ui;

import model.Aluno;
import model.Professor;
import model.Curso;
import model.Turma;
import model.Avaliacao;

import service.AlunoService;
import service.ProfessorService;
import service.CursoService;
import service.TurmaService;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private AlunoService alunoService;
    private ProfessorService professorService;
    private CursoService cursoService;
    private TurmaService turmaService;

    public Menu(AlunoService alunoService,
                ProfessorService professorService,
                CursoService cursoService,
                TurmaService turmaService) {

        this.alunoService = alunoService;
        this.professorService = professorService;
        this.cursoService = cursoService;
        this.turmaService = turmaService;
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
            System.out.println("7 - Criar turma");
            System.out.println("8 - Associar aluno a uma turma");
            System.out.println("9 - Registrar avaliacao");
            System.out.println("10 - Gerar relatorio geral");
            System.out.println("11 - Listar turmas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = lerInteiro();

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
                case 7:
                    criarTurma();
                    break;
                case 8:
                    associarAlunoTurma();
                    break;
                case 9:
                    registrarAvaliacao();
                    break;
                case 10:
                    gerarRelatorioGeral();
                    break;
                case 11:
                    listarTurmas();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        System.out.println("\nDesenvolvido por: Cauã Alves");
    }

    private int lerInteiro() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite um numero valido!");
            return -1;
        }
    }

    private void cadastrarAluno() {

        System.out.println("\n===== CADASTRAR ALUNO =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        try {
            Aluno aluno = new Aluno(nome, matricula, curso, login, senha);
            alunoService.cadastrarAluno(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
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

        try {
            Professor professor = new Professor(
                    nome, especialidade, registro, login, senha
            );

            professorService.cadastrarProfessor(professor);
            System.out.println("Professor cadastrado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar professor: " + e.getMessage());
        }
    }

    private void cadastrarCurso() {

        System.out.println("\n===== CADASTRAR CURSO =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Codigo: ");
        String codigo = scanner.nextLine();

        System.out.print("Carga horaria: ");
        int cargaHoraria = lerInteiro();

        if (cargaHoraria <= 0) {
            System.out.println("Carga horaria invalida!");
            return;
        }

        try {
            Curso curso = new Curso(nome, codigo, cargaHoraria);
            cursoService.cadastrarCurso(curso);
            System.out.println("Curso cadastrado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar curso: " + e.getMessage());
        }
    }

    private void listarAlunos() {

        System.out.println("\n===== ALUNOS CADASTRADOS =====");

        List<Aluno> alunos = alunoService.listarAlunos();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);

            System.out.println((i + 1) + " - " + aluno.getNome()
                    + " | Matricula: " + aluno.getMatricula()
                    + " | Curso: " + aluno.getCurso());
        }
    }

    private void listarProfessores() {

        System.out.println("\n===== PROFESSORES CADASTRADOS =====");

        List<Professor> professores = professorService.listarProfessores();

        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }

        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);

            System.out.println((i + 1) + " - " + professor.getNome()
                    + " | Especialidade: " + professor.getEspecialidade()
                    + " | Registro: " + professor.getRegistro());
        }
    }

    private void listarCursos() {

        System.out.println("\n===== CURSOS CADASTRADOS =====");

        List<Curso> cursos = cursoService.listarCursos();

        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);

            System.out.println((i + 1) + " - " + curso.getNome()
                    + " | Codigo: " + curso.getCodigo()
                    + " | Carga horaria: " + curso.getCargaHoraria());
        }
    }

    private void criarTurma() {

        System.out.println("\n===== CRIAR TURMA =====");

        List<Professor> professores = professorService.listarProfessores();
        List<Curso> cursos = cursoService.listarCursos();

        if (professores.isEmpty()) {
            System.out.println("Cadastre um professor antes de criar uma turma.");
            return;
        }

        if (cursos.isEmpty()) {
            System.out.println("Cadastre um curso antes de criar uma turma.");
            return;
        }

        System.out.print("Codigo da turma: ");
        String codigo = scanner.nextLine();

        System.out.println("\nSelecione o professor:");

        for (int i = 0; i < professores.size(); i++) {
            System.out.println((i + 1) + " - " + professores.get(i).getNome());
        }

        System.out.print("Numero do professor: ");
        int indiceProfessor = lerInteiro() - 1;

        if (indiceProfessor < 0 || indiceProfessor >= professores.size()) {
            System.out.println("Professor invalido!");
            return;
        }

        System.out.println("\nSelecione o curso:");

        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + " - " + cursos.get(i).getNome());
        }

        System.out.print("Numero do curso: ");
        int indiceCurso = lerInteiro() - 1;

        if (indiceCurso < 0 || indiceCurso >= cursos.size()) {
            System.out.println("Curso invalido!");
            return;
        }

        Professor professor = professores.get(indiceProfessor);
        Curso curso = cursos.get(indiceCurso);

        Turma turma = new Turma(codigo, professor, curso);

        turmaService.cadastrarTurma(turma);

        System.out.println("Turma criada com sucesso!");
    }

    private void associarAlunoTurma() {

        System.out.println("\n===== ASSOCIAR ALUNO A TURMA =====");

        List<Aluno> alunos = alunoService.listarAlunos();
        List<Turma> turmas = turmaService.listarTurmas();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }

        System.out.println("\nAlunos:");

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " - " + alunos.get(i).getNome());
        }

        System.out.print("Numero do aluno: ");
        int indiceAluno = lerInteiro() - 1;

        if (indiceAluno < 0 || indiceAluno >= alunos.size()) {
            System.out.println("Aluno invalido!");
            return;
        }

        System.out.println("\nTurmas:");

        for (int i = 0; i < turmas.size(); i++) {
            System.out.println((i + 1) + " - Codigo: "
                    + turmas.get(i).getCodigo());
        }

        System.out.print("Numero da turma: ");
        int indiceTurma = lerInteiro() - 1;

        if (indiceTurma < 0 || indiceTurma >= turmas.size()) {
            System.out.println("Turma invalida!");
            return;
        }

        Aluno aluno = alunos.get(indiceAluno);
        Turma turma = turmas.get(indiceTurma);

        turma.adicionarAluno(aluno);

        System.out.println("Aluno associado a turma com sucesso!");
    }

    private void registrarAvaliacao() {

        System.out.println("\n===== REGISTRAR AVALIACAO =====");

        List<Aluno> alunos = alunoService.listarAlunos();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " - " + alunos.get(i).getNome());
        }

        System.out.print("Selecione o aluno: ");
        int indiceAluno = lerInteiro() - 1;

        if (indiceAluno < 0 || indiceAluno >= alunos.size()) {
            System.out.println("Aluno invalido!");
            return;
        }

        System.out.print("Descricao da avaliacao: ");
        String descricao = scanner.nextLine();

        System.out.print("Nota (0 a 10): ");
        double nota;

        try {
            nota = Double.parseDouble(scanner.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Digite uma nota valida!");
            return;
        }

        try {
            Avaliacao avaliacao = new Avaliacao(descricao);
            avaliacao.atribuirNota(nota);

            alunos.get(indiceAluno).adicionarAvaliacao(avaliacao);

            System.out.println("Avaliacao registrada com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao registrar avaliacao: " + e.getMessage());
        }
    }

    private void listarTurmas() {

        System.out.println("\n===== TURMAS CADASTRADAS =====");

        List<Turma> turmas = turmaService.listarTurmas();

        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }

        for (Turma turma : turmas) {
            turma.exibirResumo();
            System.out.println("-----------------------------");
        }
    }

    private void gerarRelatorioGeral() {

        System.out.println("\n===== RELATORIO GERAL DO SISTEMA =====");

        System.out.println("\n--- ALUNOS ---");

        List<Aluno> alunos = alunoService.listarAlunos();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                aluno.gerarRelatorio();
                System.out.println("-----------------------------");
            }
        }

        System.out.println("\n--- PROFESSORES ---");

        List<Professor> professores = professorService.listarProfessores();

        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (Professor professor : professores) {
                professor.gerarRelatorio();
                System.out.println("-----------------------------");
            }
        }

        System.out.println("\n--- CURSOS ---");

        List<Curso> cursos = cursoService.listarCursos();

        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            for (Curso curso : cursos) {
                curso.gerarRelatorio();
                System.out.println("-----------------------------");
            }
        }

        System.out.println("\n--- TURMAS ---");

        List<Turma> turmas = turmaService.listarTurmas();

        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
        } else {
            for (Turma turma : turmas) {
                turma.exibirResumo();
                System.out.println("-----------------------------");
            }
        }

        System.out.println("\n===== FIM DO RELATORIO =====");
    }
}
