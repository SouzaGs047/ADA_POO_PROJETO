package menu;

import java.util.Scanner;

public class Menu {
    public void exibirMenu(){
        System.out.print("""
                                    ***IMDB***
                         
                           "1. Adicionar funcionario");
                            2. Listar funcionários");
                            3. Sair");
                         
                           Escolha uma opcao: 
                           """);
    }
    
  
    
    
    public void swCase() {
        Scanner input = new Scanner(System.in);
        int opcaoMenu = input.nextInt();

        switch (opcaoMenu) {
            case 1:
                limpar();
                input.nextLine();
                break;
                
            case 2:
                limpar();  
                break;
                
            case 3:
                System.exit(0);
                break;
                
            default:
                System.out.println("Digite uma opção válida!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                input.nextLine();
        }
    }

    
    public static void limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
