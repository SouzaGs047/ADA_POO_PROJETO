package main;


import classes.Ator;
import classes.Diretor;
import classes.Filmes;
import menu.Menu;

public class Main {
    public static void main(String[] args) {
        //receber atores e diretores por arraylist
        Menu menu = new Menu();
        
        Diretor greta_Gerwig = new Diretor("Greta Gerwig");

        Ator margot_Robbie = new Ator("Margot Robbie");
        Ator ryan_Gosling = new Ator("Ryan Gosling");
        Ator issa_Rae = new Ator("Issa Rae");

        Filmes barbie = new Filmes("Barbie",2023,"Barbielandia",10_000_000);

        barbie.setAtor(margot_Robbie);
        barbie.setAtor(ryan_Gosling);
        barbie.setAtor(issa_Rae);

        barbie.setDiretor(greta_Gerwig);
        
        menu.exibirMenu();
        System.out.println(barbie.toString());
        
    }
}