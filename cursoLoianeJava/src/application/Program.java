package application;

import entities.Aluno;
import entities.Pessoa;
import entities.Professor;

public class Program {
    public static void main(String[] args) {


        Aluno junin = new Aluno();
        Professor fessor = new Professor();

        junin.setNome("Barbosinha");
        fessor.setTelefone("9991000");


        Pessoa aluno = new Aluno();
        /*Neste caso não se tem acesso aos atributos do Aluno */
    }
}
