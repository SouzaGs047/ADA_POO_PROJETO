import Pessoas.Diretores;
import Pessoas.Pessoas;
import Pessoas.Atores;

public class Main {
    public static void main(String[] args) {

        //teste
        Pessoas greta = new Diretores("Greta Gerwig");
        Pessoas margot = new Atores("Margot Robbie");

        System.out.printf(greta.getNome() + " ");
        greta.trabalhar();

        System.out.println();

        System.out.printf(margot.getNome() + " ");
        margot.trabalhar();

    }
}