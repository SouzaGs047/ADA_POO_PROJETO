package classes;

public class Diretor{
    private String nome;
    
    public Diretor() {
    }
    public Diretor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeNomeDiretor(){
        System.out.println("Nome: " + nome);
    }
    @Override
    public String toString() {
        return nome;
    }
}
