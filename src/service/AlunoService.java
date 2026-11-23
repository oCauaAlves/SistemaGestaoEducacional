package service;

import model.Aluno;
import repository.AlunoRepository;
import java.util.List;

public class AlunoService {

    private AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarAluno(Aluno aluno) {
        repository.salvar(aluno);
    }

    public List<Aluno> listarAlunos() {
        return repository.listarTodos();
    }
}
