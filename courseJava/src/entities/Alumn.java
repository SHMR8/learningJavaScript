package entities;

public class Alumn {

    private String nome;
    private int curso;
    private int matricula;
    private boolean status;

    public Alumn() {
    }

    public Alumn(String nome, int curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String nome() {
        return nome;
    }

    public Alumn setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int curso() {
        return curso;
    }

    public Alumn setCurso(int curso) {
        this.curso = curso;
        return this;
    }

    public int matricula() {
        return matricula;
    }

    public Alumn setMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    public boolean status() {
        return status;
    }

    public Alumn setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public void exibirDados(){
        System.out.println("O nome do aluno é: "+this.nome);
        System.out.println("O curso do aluno é: "+this.curso);
        System.out.println("O número da matricula do aluno é: "+this.matricula);
    }
    public boolean exibirAprovacao(int nota1, int nota2, int nota3, int nota4){
        if(nota1+nota2+nota3+nota3/4 >=7){
            return true;
        }else {
            return false;
        }
    }


}
