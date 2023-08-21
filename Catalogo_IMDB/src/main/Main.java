package main;

import menu.Menu;
public class Main {

    public static void main(String[] args) {
        //receber atores e diretores por arraylist
        Menu menu = new Menu();
        boolean sair = false;

        do {
            menu.exibirMenu();
            menu.swCase();
        } while (!sair);
        
    }


}