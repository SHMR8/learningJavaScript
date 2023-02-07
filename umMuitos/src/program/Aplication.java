package program;


import program.entities.Agenda;
import program.entities.entities.Contato;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);

    System.out.println("Digite o nome da agenda: ");
    String nome = rd.nextLine();
    Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i=0; i<3;i++){
        System.out.println("Entre com os dados do contato: "+ i+1);
        Contato c = new Contato();
        System.out.println("Digite o nome: ");
        nome = rd.nextLine();
        c.setNome(nome);
        System.out.println("Digite o e-mail: ");
        String telefone = rd.nextLine();
        c.setTelefone(telefone);
        System.out.println("Digite o telefone: ");
        String email = rd.nextLine();
        c.setEmail(email);

        contatos[i] = c;
        }
        agenda.setContatos(contatos);


        System.out.println(agenda.obterInfos());
    rd.close();
    }
}
