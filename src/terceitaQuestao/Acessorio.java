package terceitaQuestao;

public class Acessorio {
    private FilaAtendimento filaAtendimento;

    public Acessorio() {
        this.filaAtendimento = new FilaAtendimento();
    }

    public void atenderClienteAcessorio() {
        if (filaAtendimento.isVazia()) {
            System.out.println("Não há clientes na fila de atendimento");
            return;
        }

        Cliente cliente = filaAtendimento.removeCliente();
        System.out.println("Cliente " + cliente.getNome() + " sendo atendido(a) pelo consultor");
        System.out.print("Proximos clientes: ");
        filaAtendimento.imprimeFila();
    }

    public void adicionarClienteAcessorio(Cliente cliente) {
        filaAtendimento.adicionaCliente(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado(a) na fila de atendimento de consultoria");
        atenderClienteAcessorio();
    }

    public void mostrarQuantidadeClientes() {
        System.out.println("Quantidade de clientes na fila de atendimento de consultoria: " + filaAtendimento.getQuantidadeClientes());
    }
}
