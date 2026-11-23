package model;

public class CursoEAD extends Curso {

    private String plataformaVirtual;

    // Construtor
    public CursoEAD(String nome, String codigo, int cargaHoraria, String plataformaVirtual) {
        super(nome, codigo, cargaHoraria);
        this.plataformaVirtual = plataformaVirtual;
    }

    // Sobrescrevendo o método
    @Override
    public void detalharCurso() {
        System.out.println("===== CURSO EAD =====");
        super.detalharCurso();
        System.out.println("Plataforma virtual: " + plataformaVirtual);
    }

    public String getPlataformaVirtual() {
        return plataformaVirtual;
    }

    public void setPlataformaVirtual(String plataformaVirtual) {
        this.plataformaVirtual = plataformaVirtual;
    }
}
