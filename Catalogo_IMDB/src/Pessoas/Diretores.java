package Pessoas;

public class Diretores extends Pessoas{

    public Diretores(String nome) {
        super(nome);
    }

    @Override
    public void trabalhar() {
        System.out.printf("Dirigindo");
    }

}
