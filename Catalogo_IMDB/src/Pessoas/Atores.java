package Pessoas;

public class Atores extends Pessoas{

    public Atores(String nome) {
        super(nome);
    }

    @Override
    public void trabalhar() {
        System.out.printf("Atuando");
    }

}
