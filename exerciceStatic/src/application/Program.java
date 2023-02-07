package application;
import entities.Contador;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);

    Contador.cont(10);


    rd.close();
    }
}
