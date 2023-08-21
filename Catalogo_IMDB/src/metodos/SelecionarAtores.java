package metodos;

import java.util.ArrayList;
import java.util.Scanner;
import classes.Ator;

public class SelecionarAtores {
    public static ArrayList<Ator> buscarAtoresPorNome(EncontrarAtor encontrarAtores) {
        ArrayList<Ator> diretoresSelecionados = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean sair = false;

        do {
            System.out.println("Digite o nome de um ator (ou 'sair' para sair): ");
            String buscaDiretor = input.next();

            if (buscaDiretor.equalsIgnoreCase("sair")) {
                sair = true;
            } else {
                ArrayList<Ator> diretoresEncontrados = encontrarAtores.encontrarAtoresPorNome(buscaDiretor);
                diretoresSelecionados.addAll(diretoresEncontrados);
            }
        } while (!sair);

        return diretoresSelecionados;
    }

}
