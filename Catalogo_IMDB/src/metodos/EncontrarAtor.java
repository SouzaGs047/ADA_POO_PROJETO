package metodos;

import classes.Ator;
import classes.Diretor;

import java.util.ArrayList;

public class EncontrarAtor extends Ator{

    static ArrayList<Ator> atores = new ArrayList<>();

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    public void getAtores() {
        for (Ator ator : atores) {
            ator.exibeNomeAtor();
        }
    }

    public ArrayList<Ator> encontrarAtoresPorNome(String nome) {
        ArrayList<Ator> atoresEncontrados = new ArrayList<>();

        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                atoresEncontrados.add(ator);
            }
        }
        return atoresEncontrados;
    }
}
