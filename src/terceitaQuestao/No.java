package terceitaQuestao;

public class No {
    private Cliente cliente;
    private No proximo;

    public No(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
