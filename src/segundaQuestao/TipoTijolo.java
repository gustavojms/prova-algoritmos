package segundaQuestao;

import java.util.Random;

public enum TipoTijolo {

    NORMAL(1),
    ENERGIZADO(2),
    BOMBA(3);

    private final int tipo;

    TipoTijolo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return this.tipo;
    }

    public static TipoTijolo getTipoTijoloAleatorio() {
       TipoTijolo[] tijolos = TipoTijolo.values();
         int indice = new Random().nextInt(tijolos.length);
            return tijolos[indice];
    }
}
