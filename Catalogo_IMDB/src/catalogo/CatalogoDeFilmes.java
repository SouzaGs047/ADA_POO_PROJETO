package catalogo;

import classes.Ator;
import classes.Filmes;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoDeFilmes{
    static ArrayList<Filmes> filmes = new ArrayList<>();

    public void MostrarCatalogoDeFilmes() {
        for (Filmes filme : filmes) {
            System.out.println("Nome: " + filme.getNome());
            System.out.println("Ano de Lançamento: " + filme.getAnoDeLancamento());
            System.out.println("Sinopse: "+ filme.getSinopse());
            System.out.println("Orçamento: "+ filme.getOrcamento());
            System.out.println("Diretor: " + filme.getDiretores());
            System.out.println("Atores: " + filme.getAtores());
        }
    }


    public ArrayList<Filmes> encontrarFilmePorNome(String nome) {
        ArrayList<Filmes> filmesEncontrados = new ArrayList<>();
        for (Filmes filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                filmesEncontrados.add(filme);
            }
        }
        return filmesEncontrados;
    }

    public void exibirFilmeSelecionado(ArrayList<Filmes> filmeSelecionado) {

        if (filmeSelecionado.isEmpty()) {
            System.out.println("Nenhum filme com o nome foi encontrado.");
        } else {
            for (Filmes filme : filmeSelecionado) {
                System.out.println("Nome: " + filme.getNome());
                System.out.println("Ano de Lançamento: " + filme.getAnoDeLancamento());
                System.out.println("Sinopse: " + filme.getSinopse());
                System.out.println("Orçamento: " + filme.getOrcamento());
                System.out.println("Diretor: " + filme.getDiretores());
                System.out.println("Atores: " + filme.getAtores());
            }
        }
    }
}
