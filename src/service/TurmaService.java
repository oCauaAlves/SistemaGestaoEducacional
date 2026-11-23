package service;

import model.Turma;
import repository.TurmaRepository;
import java.util.List;

public class TurmaService {

    private TurmaRepository repository;

    public TurmaService(TurmaRepository repository) {
        this.repository = repository;
    }

    public void cadastrarTurma(Turma turma) {
        repository.salvar(turma);
    }

    public List<Turma> listarTurmas() {
        return repository.listarTodos();
    }
}
