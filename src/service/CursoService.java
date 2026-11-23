package service;

import model.Curso;
import repository.CursoRepository;
import java.util.List;

public class CursoService {

    private CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarCurso(Curso curso) {
        repository.salvar(curso);
    }

    public List<Curso> listarCursos() {
        return repository.listarTodos();
    }
}
