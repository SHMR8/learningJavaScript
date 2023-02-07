package Program;
import Calculadora.Calc;
import entities.Alumn;

import java.util.Scanner;
public class application {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
/*
    System.out.println("Digite o nome do aluno: ");
    String name = rd.nextLine();
    System.out.println("Digite o numero do curso");
    int curso = rd.nextInt();
    System.out.println("Digite o numero da matricula");
    int matricula = rd.nextInt();

        System.out.println("Digite a 1º nota:");
        int nota1 = rd.nextInt();
        System.out.println("Digite a 2º nota:");
        int nota2 = rd.nextInt();
        System.out.println("Digite a 3º nota:");
        int nota3 = rd.nextInt();
        System.out.println("Digite a 4º nota:");
        int nota4 = rd.nextInt();


        Alumn aluno = new Alumn(name,curso,matricula);
        aluno.exibirDados();
        if (aluno.exibirAprovacao(nota1,nota2,nota3,nota4)==true){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }*/
         int resultado;

        resultado = Calc.soma(5,10);

        System.out.println(resultado);
    rd.close();
    }
}
