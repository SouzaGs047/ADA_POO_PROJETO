package menu;

import java.util.ArrayList;
import java.util.Scanner;

import catalogo.CadastrarFilme;
import catalogo.CatalogoDeFilmes;
import classes.Ator;
import classes.Diretor;
import classes.Filmes;
import metodos.EncontrarAtor;
import metodos.EncontrarDiretor;
import metodos.SelecionarAtores;
import metodos.SelecionarDiretores;
import catalogo.CadastrarFilme;

public class Menu {
    public void exibirMenu(){
        System.out.print("""
                                    ***IMDB***
                         
                            1. Adicionar Diretor
                            2. Adicionar Ator
                            3. Lista de Atores e Diretores
                            
                            4. Adicionar Filme
                            5. Pesquisar Filme
                            
                            6. Sair
                         
                           Escolha uma opcao: 
                           """);
    }
    

    public void swCase() {
        Scanner input = new Scanner(System.in);
        int opcaoMenu = input.nextInt();

        switch (opcaoMenu) {
            case 1 -> {
                limpar();
                EncontrarDiretor encontrarDiretores = new EncontrarDiretor();
                System.out.print("Digite o nome do Diretor: ");
                String nomeDiretor = input.next();
                encontrarDiretores.adicionarAtor(new Diretor(nomeDiretor));
                input.nextLine();
            }

            case 2 -> {
                limpar();
                EncontrarAtor metodosAtor = new EncontrarAtor();
                System.out.print("Digite o nome do Ator: ");
                String nomeAtor = input.next();
                metodosAtor.adicionarAtor(new Ator(nomeAtor));
                input.nextLine();
            }

            case 3 -> {
                EncontrarDiretor encontrarDiretores = new EncontrarDiretor();
                System.out.println("Diretores: ");
                encontrarDiretores.getDiretores();
                System.out.println();

                EncontrarAtor metodosAtor = new EncontrarAtor();
                System.out.println("Atores: ");
                metodosAtor.getAtores();
                System.out.println();

                input.nextLine();
            }

            case 4 -> {
                CadastrarFilme cadastrarFilme = new CadastrarFilme();

                System.out.print("Digite o nome do Filme: ");
                String nome = input.next();
                System.out.print("Digite o Ano de Lançamento: ");
                int ano = input.nextInt();
                System.out.print("Digite a Sinopse: ");
                String sinopse = input.next();
                System.out.print("Digite o orçamento: ");
                double orcamento = input.nextInt();

                EncontrarDiretor encontrarDiretores = new EncontrarDiretor();
                ArrayList<Diretor> diretoresSelecionados = SelecionarDiretores.buscarDiretoresPorNome(encontrarDiretores);

                EncontrarAtor encontrarAtor = new EncontrarAtor();
                ArrayList<Ator> atoresSelecionados = SelecionarAtores.buscarAtoresPorNome(encontrarAtor);

                cadastrarFilme.adicionarFilme(nome, ano, sinopse, orcamento, diretoresSelecionados, atoresSelecionados);
            }


            case 5 -> {
                CatalogoDeFilmes catalogoDeFilmes = new CatalogoDeFilmes();
                System.out.print("Digite o nome do Filme para pesquisar: ");
                String nomeDoFilme = input.next();

                ArrayList<Filmes> filmeSelecionado = catalogoDeFilmes.encontrarFilmePorNome(nomeDoFilme);
                catalogoDeFilmes.exibirFilmeSelecionado(filmeSelecionado);

            }

            case 6 -> {
                System.out.println("Saindo...");
                input.close();
                System.exit(0);
            }

            default -> {
                System.out.println("Digite uma opção válida!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                input.nextLine();
        }
        }
    }

    
    public static void limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
