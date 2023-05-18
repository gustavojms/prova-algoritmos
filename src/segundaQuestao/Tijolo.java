package segundaQuestao;

public class Tijolo {
    private Tijolo proximo;
    private final TipoTijolo tipo;

    public Tijolo(TipoTijolo tipo) {
        this.tipo = tipo;
        this.proximo = null;
    }

    public Tijolo getProximo() {
        return this.proximo;
    }

    public void setProximo(Tijolo proximo) {
        this.proximo = proximo;
    }

    public TipoTijolo getTipo() {
        return this.tipo;
    }
}
