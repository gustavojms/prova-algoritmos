package primeiraQuestao;

public class Fila {
    private Verbete primeiro;
    private Verbete ultimo;

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void enfileirar(Verbete verbete) {
        if (this.primeiro == null) {
            this.primeiro = verbete;
            this.ultimo = verbete;
        } else if (verbete.getPalavra().compareTo(primeiro.getPalavra()) <= 0){
            verbete.setProximo(primeiro);
            primeiro = verbete;
        } else if (verbete.getPalavra().compareTo(ultimo.getPalavra()) >= 0) {
            ultimo.setProximo(verbete);
            ultimo = verbete;
        } else {
            Verbete atual = primeiro;
            while (atual.getProximo().getPalavra().compareTo(verbete.getPalavra()) < 0) {
                atual = atual.getProximo();
            }

            verbete.setProximo(atual.getProximo());
            atual.setProximo(verbete);
        }
    }

    public Verbete desenfileirar() {
        if (this.primeiro == null) {
            return null;
        }

        Verbete verbete = primeiro;
        primeiro = primeiro.getProximo();

        if (primeiro == null) {
            ultimo = null;
        }

        verbete.setProximo(null);
        return verbete;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }
}
