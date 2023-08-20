package metodos;

import java.util.Scanner;
import classes.Diretor;

public class MetodosDiretor extends Diretor{
    
    public void solicitarNomeDiretor(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do diretor: ");
        String nome = input.nextLine();
        
        this.setNome(nome);
    }
}
