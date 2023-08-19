public class Filmes {
    private String nome;
    private int anoDeLancamento;
    private String sinopse;
    private double orcamento;
    private Diretores diretor;
    private Atores atores;


    public Filmes() {
    }

    public Filmes(String nome, int anoDeLancamento, String sinopse, double orcamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.sinopse = sinopse;
        this.orcamento = orcamento;
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

    public Diretores getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretores diretor) {
        this.diretor = diretor;
    }

    public Atores getAtores() {
        return atores;
    }

    public void setAtores(Atores atores) {
        this.atores = atores;
    }


    @Override
    public String toString() {
        return  "Nome= " + nome +
                ", Ano de Lancamento= " + anoDeLancamento +
                ", Sinopse= " + sinopse +
                ", Orcamento= " + orcamento +
                ", Diretor= " + diretor +
                ", Atores= " + atores
                ;
    }
}