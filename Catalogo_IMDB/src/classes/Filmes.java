package classes;

import java.util.List;
import java.util.ArrayList;

public class Filmes {
    private String nome;
    private int anoDeLancamento;
    private String sinopse;
    private double orcamento;
    private Diretor diretor;
    private List<Ator> atores;


    public Filmes() {
    }

    public Filmes(String nome, int anoDeLancamento, String sinopse, double orcamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.sinopse = sinopse;
        this.orcamento = orcamento;
        this.atores = new ArrayList<>();
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

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }


    public void setAtor(Ator ator) {
        atores.add(ator);
    }
    public List<Ator> getAtores() {
        return atores;
    }

    @Override
    public String toString() {
        return  "nome= " + nome +
                ", anoDeLancamento= " + anoDeLancamento +
                ", sinopse= " + sinopse +
                ", orcamento= " + orcamento +
                ", diretor= " + diretor +
                ", atores= " + atores
                ;
    }
}
