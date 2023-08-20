public class Atores {
    private String nome;
    public Atores() {
    }
    public Atores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return  nome;
    }
}
