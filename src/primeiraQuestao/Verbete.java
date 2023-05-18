package primeiraQuestao;

public class Verbete {
    private String palavra;
    private String definicao;
    private Verbete verbetes;
    private Verbete proximo;

    public Verbete(String palavra, String definicao) {
        this.palavra = palavra;
        this.definicao = definicao;
        this.verbetes = null;
        this.proximo = null;
    }

    public Verbete getVerbetes() {
        return verbetes;
    }

    public void setVerbetes(Verbete verbetes) {
        this.verbetes = verbetes;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }

    public Verbete getProximo() {
        return proximo;
    }

    public void setProximo(Verbete proximo) {
        this.proximo = proximo;
    }

}
