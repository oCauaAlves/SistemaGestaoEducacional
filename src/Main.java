
import model.Curso;
import model.CursoPresencial;
import model.CursoEAD;

public class Main {
    public static void main(String[] args) {

        // Criando curso presencial
        CursoPresencial presencial = new CursoPresencial(
                "Análise e Desenvolvimento de Sistemas",
                "ADS01",
                2400,
                "Sala 05"
        );

        // Criando curso EAD
        CursoEAD ead = new CursoEAD(
                "Gestão de Tecnologia da Informação",
                "GTI01",
                2000,
                "Moodle"
        );

        // Demonstrando polimorfismo
        Curso curso1 = presencial;
        Curso curso2 = ead;

        // Exibindo detalhes dos cursos
        curso1.detalharCurso();

        System.out.println();

        curso2.detalharCurso();

        System.out.println("\nDesenvolvido por: Cauã Alves");
    }
}
