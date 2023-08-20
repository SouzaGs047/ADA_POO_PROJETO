package metodos;

import java.util.Scanner;
import classes.Ator;

public class MetodosAtor extends Ator{
    
    public void solicitarNomeAtor(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do ator: ");
        String nome = input.nextLine();
        
        this.setNome(nome);
    }
}
