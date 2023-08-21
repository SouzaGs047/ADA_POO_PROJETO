package metodos;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Diretor;

public class SelecionarDiretores {
    public static ArrayList<Diretor> buscarDiretoresPorNome(EncontrarDiretor encontrarDiretores) {
        ArrayList<Diretor> diretoresSelecionados = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean sair = false;

        do {
            System.out.println("Digite o nome de um diretor (ou 'sair' para sair): ");
            String buscaDiretor = input.next();

            if (buscaDiretor.equalsIgnoreCase("sair")) {
                sair = true;
            } else {
                ArrayList<Diretor> diretoresEncontrados = encontrarDiretores.encontrarDiretoresPorNome(buscaDiretor);
                diretoresSelecionados.addAll(diretoresEncontrados);
            }
        } while (!sair);

        return diretoresSelecionados;
    }
}

