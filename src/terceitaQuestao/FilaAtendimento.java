package terceitaQuestao;

public class FilaAtendimento {
    private No primeiro;
    private No ultimo;
    private int quantidadeClientes;

    public FilaAtendimento() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantidadeClientes = 0;
    }
    public void adicionaCliente(Cliente cliente) {
        No novoNo = new No(cliente);
        if(this.quantidadeClientes == 0) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
        }
        quantidadeClientes++;
    }

    public Cliente removeCliente() {
        if (this.quantidadeClientes == 0) {
            return null;
        }

        No cliente = this.primeiro;

        if(this.primeiro == this.ultimo) {
            this.primeiro = null;
            this.ultimo = null;
            quantidadeClientes--;
            return cliente.getCliente();
        }

        this.primeiro = this.primeiro.getProximo();
        quantidadeClientes--;
        return cliente.getCliente();
    }

    public No getPrimeiro() {
        return this.primeiro;
    }

    public int getQuantidadeClientes() {
        int quantidadeClientes = 0;
        No cliente = this.primeiro;
        while (cliente != null) {
            quantidadeClientes++;
            cliente = cliente.getProximo();
        }
        return quantidadeClientes;
    }

    public boolean isVazia() {
        return this.quantidadeClientes == 0;
    }

    public void imprimeFila() {
        No cliente = this.primeiro;
        while (cliente != null) {
            cliente = cliente.getProximo();
        }
    }
}
