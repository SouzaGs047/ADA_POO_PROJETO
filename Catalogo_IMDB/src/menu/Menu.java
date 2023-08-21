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

public class Menu {
    public void exibirMenu(){
        System.out.print("""
                                    \n***IMDB***
                         
                            1. Adicionar Diretor
                            2. Adicionar Ator
                            3. Lista de Atores e Diretores
                            
                            4. Adicionar Filme
                            5. Catalogo de Filmes
                            6. Pesquisar Filme
                            
                            7. Sair
                         
                           Escolha uma opcao: 
                           """);
    }
    

    public void swCase() {
        Scanner input = new Scanner(System.in);
        int opcaoMenu = input.nextInt();

        switch (opcaoMenu) {
            case 1 -> {
                limpar();
                System.out.print("***CADASTRAR DIRETOR***\n");
                EncontrarDiretor encontrarDiretores = new EncontrarDiretor();
                System.out.print("Digite o nome do Diretor: ");
                String nomeDiretor = input.next();
                encontrarDiretores.adicionarAtor(new Diretor(nomeDiretor));
                input.nextLine();
            }

            case 2 -> {
                limpar();
                System.out.print("***CADASTRAR ATOR***\n");
                EncontrarAtor metodosAtor = new EncontrarAtor();
                System.out.print("Digite o nome do Ator: ");
                String nomeAtor = input.next();
                metodosAtor.adicionarAtor(new Ator(nomeAtor));
                input.nextLine();
            }

            case 3 -> {
                limpar();
                System.out.print("***CATALOGO DE ELENCO***\n");
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
                limpar();
                CadastrarFilme cadastrarFilme = new CadastrarFilme();

                System.out.print("***CADASTRO DE FILME***\n");
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
                limpar();
                System.out.print("***CATALOGO DE FILMES***\n");
                CatalogoDeFilmes catalogoDeFilmes = new CatalogoDeFilmes();
                System.out.println("Filmes: ");
                catalogoDeFilmes.MostrarCatalogoDeFilmes();
                System.out.println();
            }
            case 6 -> {
                limpar();
                CatalogoDeFilmes catalogoDeFilmes = new CatalogoDeFilmes();
                System.out.println("***PESQUISA DE FILME***\n");
                System.out.print("Digite o nome do Filme para pesquisar: ");
                String nomeDoFilme = input.next();

                ArrayList<Filmes> filmeSelecionado = catalogoDeFilmes.encontrarFilmePorNome(nomeDoFilme);
                catalogoDeFilmes.exibirFilmeSelecionado(filmeSelecionado);

            }

            case 7 -> {
                limpar();
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
