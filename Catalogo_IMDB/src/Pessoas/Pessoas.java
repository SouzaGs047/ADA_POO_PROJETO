package Pessoas;

//classe abstrata para trabalhar com herança e polimorfismo
public abstract class Pessoas {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void trabalhar();

}
