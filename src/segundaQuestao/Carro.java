package segundaQuestao;

public class Carro {

    private int distancia;
    private TipoCarro tipo;
    private int quantidadeTijolosEnergizados;
    private int quantidadeTijolosBombas;

    public Carro() {
        this.distancia = 0;
        this.tipo = TipoCarro.NORMAL;
        this.quantidadeTijolosEnergizados = 0;
        this.quantidadeTijolosBombas = 0;
    }

    public String getTipo() {
        return switch (tipo) {
            case NORMAL -> "NORMAL";
            case ENERGIZADO -> "ENERGIZADO";
            case EXPLODIDO -> "EXPLODIDO";
        };
    }

    public TipoCarro getTipoCarro() {
        return tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getQuantidadeTijolosEnergizados() {
        return quantidadeTijolosEnergizados;
    }

    public int getQuantidadeTijolosBombas() {
        return quantidadeTijolosBombas;
    }

    public void mover() {
        distancia++;
    }

    public void pular() {
        distancia += 2;
    }

    public void proteger() {
        tipo = TipoCarro.ENERGIZADO;
        quantidadeTijolosEnergizados++;
    }

    public void explodir() {
        quantidadeTijolosBombas++;
        if (quantidadeTijolosBombas < quantidadeTijolosEnergizados) {
            tipo = TipoCarro.EXPLODIDO;
        } else {
            tipo = TipoCarro.ENERGIZADO;
        }
    }

    public void setTipo(TipoCarro tipoCarro) {
        this.tipo = tipoCarro;
    }
}
