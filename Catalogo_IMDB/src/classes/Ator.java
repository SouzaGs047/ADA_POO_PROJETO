package classes;

public class Ator {
    private String nome;
    
    public Ator() {
    }
    public Ator(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeNomeAtor() {
        System.out.println("Nome: " + nome);
    }

    public String toString() {
        return  nome;
    }

}
