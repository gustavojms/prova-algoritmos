package segundaQuestao;

public class Pista {

    private TipoTijolo[] pista;
    private int tamanho;
    private int posicaoCarro;

    public Pista(int tamanho) {
        this.tamanho = tamanho;
        this.pista = new TipoTijolo[tamanho];
        this.posicaoCarro = 0;
    }

    public void gerarPista() {
        for (int i = 0; i < tamanho; i++) {
            pista[i] = TipoTijolo.getTipoTijoloAleatorio();
        }
    }

    public void expandirPista() {
        TipoTijolo[] novaPista = new TipoTijolo[tamanho * 2];
        for (int i = 0; i < tamanho; i++) {
            novaPista[i] = pista[i];
        }
        pista = novaPista;
        tamanho *= 2;
    }

    public void moverCarro() {
        if (posicaoCarro < tamanho - 1) {
            posicaoCarro++;
        }
    }

    public void pularCarro(int posicao) {
        if (posicao < tamanho - 1) {
            posicaoCarro += 2;
        }
    }

    public boolean explodeBomba() {
        return pista[posicaoCarro] == TipoTijolo.BOMBA;
    }

    public boolean carroEnergizado() {
        return pista[posicaoCarro] == TipoTijolo.ENERGIZADO;
    }

    public void destruirTijolo() {
        if(posicaoCarro < tamanho - 1) {
            System.arraycopy(pista, posicaoCarro + 1, pista, posicaoCarro, tamanho - posicaoCarro - 1);
            pista[tamanho - 1] = null;
            tamanho--;
        }
    }

    public int quantidadeTijolos() {
        return tamanho;
    }

    public int quantidadeTijolosEnergizados() {
        int quantidade = 0;
        for (TipoTijolo tipoTijolo : pista) {
            if (tipoTijolo == TipoTijolo.ENERGIZADO) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int quantidadeTijolosBomba() {
        int quantidade = 0;
        for (TipoTijolo tipoTijolo : pista) {
            if (tipoTijolo == TipoTijolo.BOMBA) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public String pistaToString() {
        StringBuilder pistaString = new StringBuilder();
        for (TipoTijolo tipoTijolo : pista) {
            if (tipoTijolo != null) {
                pistaString.append(tipoTijolo.getTipo()).append(" ");
            }
        }
        return pistaString.toString();
    }
}
