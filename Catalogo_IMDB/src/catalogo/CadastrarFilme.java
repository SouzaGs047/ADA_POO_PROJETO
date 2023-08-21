package catalogo;

import classes.Diretor;
import classes.Filmes;
import classes.Ator;

import java.util.ArrayList;

public class CadastrarFilme extends CatalogoDeFilmes{

    public void adicionarFilme(String nome, int anoDeLancamento, String sinopse, double orcamento, ArrayList<Diretor> diretores, ArrayList<Ator> atores) {
        filmes.add(new Filmes(nome, anoDeLancamento, sinopse, orcamento, diretores, atores));
    }

}