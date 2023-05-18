package primeiraQuestao;

public class Enciclopedia {
    private Fila verbetes;

    public Enciclopedia() {
        verbetes = new Fila();
    }

    public void adicionarVerbete(Verbete verbete) {
        verbetes.enfileirar(verbete);
    }

    public void removerVerbete(Verbete verbete) {
        Fila temp = new Fila();

        while (!verbetes.estaVazia()) {
            Verbete v = verbetes.desenfileirar();
            if (!v.equals(verbete)) {
                temp.enfileirar(v);
            }
        }
        verbetes = temp;
    }

    public void atualizarDefinicao(Verbete verbete, String novaDefinicao) {
        verbete.setDefinicao(novaDefinicao);
    }

    public Verbete buscarVerbete(String palavra) {
        Fila temp = new Fila();
        Verbete verbete = null;

        while (!verbetes.estaVazia()) {
            Verbete v = verbetes.desenfileirar();
            if (v.getPalavra().equals(palavra)) {
                verbete = v;
            }
            temp.enfileirar(v);
        }
        verbetes = temp;
        return verbete;
    }
}
