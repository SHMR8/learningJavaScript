package program.entities.entities;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public Contato setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Contato setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contato setEmail(String email) {
        this.email = email;
        return this;
    }
    public String exibirInfos(){
        return "Nome = "+ nome +
                "Telefone = "+ telefone+
                   "Email = "+ email;
    }
}
