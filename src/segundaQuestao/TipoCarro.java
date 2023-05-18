package segundaQuestao;

public enum TipoCarro {

    NORMAL(1),
    ENERGIZADO(2),
    EXPLODIDO(3);

    private int tipo;

    private TipoCarro(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
