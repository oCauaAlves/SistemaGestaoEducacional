
import repository.AlunoRepository;
import repository.ProfessorRepository;
import repository.CursoRepository;
import repository.TurmaRepository;

import service.AlunoService;
import service.ProfessorService;
import service.CursoService;
import service.TurmaService;

import ui.Menu;

public class Main {

    public static void main(String[] args) {

        // Criando os repositórios
        AlunoRepository alunoRepository = new AlunoRepository();
        ProfessorRepository professorRepository = new ProfessorRepository();
        CursoRepository cursoRepository = new CursoRepository();
        TurmaRepository turmaRepository = new TurmaRepository();

        // Criando os serviços
        AlunoService alunoService = new AlunoService(alunoRepository);
        ProfessorService professorService = new ProfessorService(professorRepository);
        CursoService cursoService = new CursoService(cursoRepository);
        TurmaService turmaService = new TurmaService(turmaRepository);

        // Integrando as camadas através do menu
        Menu menu = new Menu(
                alunoService,
                professorService,

                cursoService,
                turmaService
        );

        // Iniciando o sistema
        menu.executar();
    }
}
