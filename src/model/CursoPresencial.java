package model;

public class CursoPresencial extends Curso {

    private String salaAula;

    // Construtor
    public CursoPresencial(String nome, String codigo, int cargaHoraria, String salaAula) {
        super(nome, codigo, cargaHoraria);
        this.salaAula = salaAula;
    }

    // Sobrescrevendo o método
    @Override
    public void detalharCurso() {
        System.out.println("===== CURSO PRESENCIAL =====");
        super.detalharCurso();
        System.out.println("Sala de aula: " + salaAula);
    }

    public String getSalaAula() {
        return salaAula;
    }

    public void setSalaAula(String salaAula) {
        this.salaAula = salaAula;
    }
}
