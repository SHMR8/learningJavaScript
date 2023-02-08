package entities;

public class Professor extends Pessoa {
    private String salario;
    private String nomeDoCurso;

    public String getSalario() {
        return salario;
    }

    public Professor setSalario(String salario) {
        this.salario = salario;
        return this;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public Professor setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
        return this;
    }
}
