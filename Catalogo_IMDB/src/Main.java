public class Main {
    public static void main(String[] args) {
        //receber atores e diretores por arraylist

        Diretores greta_Gerwig = new Diretores("Greta Gerwig");
        Atores margot_Robbie = new Atores("Margot Robbie");

        Filmes barbie = new Filmes("Barbie",2023,"Barbielandia",10_000_000);

        barbie.setDiretor(greta_Gerwig);
        barbie.setAtores(margot_Robbie);

        System.out.println(barbie.toString());

    }
}