package entities;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Pessoa setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pessoa setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoa setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }
}
