package application;
import entities.Recursive;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);

    System.out.println(Recursive.contador(5));


    rd.close();
    }
}
