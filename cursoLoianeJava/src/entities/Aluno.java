package entities;

public class Aluno extends Pessoa {
    private String curso;
    private String matricula;

    public String getCurso() {
        return curso;
    }

    public Aluno setCurso(String curso) {
        this.curso = curso;
        return this;
    }

    public String getMatricula() {
        return matricula;
    }

    public Aluno setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }
}
