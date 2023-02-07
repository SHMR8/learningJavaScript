package program.entities;

import program.entities.entities.Contato;
public class Agenda {
    private String nome;

    private Contato[] contatos;
    public Agenda(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public Agenda setContatos(Contato[] contatos) {
        this.contatos = contatos;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Agenda setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String obterInfos(){
        String info = "Nome = "+nome + "\n";
        if (contatos != null){
            for (Contato c: contatos){
                info += c.exibirInfos();
            }
        }
        return info;
    }

}
