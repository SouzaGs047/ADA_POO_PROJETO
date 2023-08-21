package classes;

import java.util.List;
import java.util.ArrayList;

public class Filmes {
    private String nome;
    private int anoDeLancamento;
    private String sinopse;
    private double orcamento;
    private List<Diretor> diretoresDoFilme;
    private List<Ator> atoresDoFilme;


    public Filmes() {
        this.diretoresDoFilme = new ArrayList<>();
        this.atoresDoFilme = new ArrayList<>();
    }

    public Filmes(String nome, int anoDeLancamento, String sinopse, double orcamento,ArrayList<Diretor> diretores,ArrayList<Ator> atores) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.sinopse = sinopse;
        this.orcamento = orcamento;
        this.diretoresDoFilme = diretores;
        this.atoresDoFilme = atores;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }



    public void setAtor(ArrayList<Ator> atores) {
        atoresDoFilme.addAll(atores);
    }
    public List<Ator> getAtores() {
        return atoresDoFilme;
    }


    public void setDiretor(ArrayList<Diretor> diretores) {
        diretoresDoFilme.addAll(diretores);
    }
    public List<Diretor> getDiretores() {
        return diretoresDoFilme;
    }

    @Override
    public String toString() {
        return  "nome= " + nome +
                ", anoDeLancamento= " + anoDeLancamento +
                ", sinopse= " + sinopse +
                ", orcamento= " + orcamento +
                ", diretor= " + diretoresDoFilme +
                ", atores= " + atoresDoFilme
                ;
    }
}
