package service;

import model.Professor;
import repository.ProfessorRepository;
import java.util.List;

public class ProfessorService {

    private ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProfessor(Professor professor) {
        repository.salvar(professor);
    }

    public List<Professor> listarProfessores() {
        return repository.listarTodos();
    }
}
