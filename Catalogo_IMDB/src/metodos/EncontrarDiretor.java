package metodos;

import java.util.ArrayList;

import classes.Diretor;

public class EncontrarDiretor extends Diretor{

    static ArrayList<Diretor> diretores = new ArrayList<>();

    public void adicionarAtor(Diretor ator) {
        diretores.add(ator);
    }
    public void getDiretores() {
        for (Diretor ator : diretores) {
            ator.exibeNomeDiretor();
        }
    }

    public ArrayList<Diretor> encontrarDiretoresPorNome(String nome) {
        ArrayList<Diretor> diretoresEncontrados = new ArrayList<>();

        for (Diretor diretor : diretores) {
            if (diretor.getNome().equalsIgnoreCase(nome)) {
                diretoresEncontrados.add(diretor);
            }
        }

        return diretoresEncontrados;
    }

}
