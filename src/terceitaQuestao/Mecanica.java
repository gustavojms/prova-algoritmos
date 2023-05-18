package terceitaQuestao;

public class Mecanica {
    private FilaAtendimento filaAtendimento;

    public Mecanica() {
        this.filaAtendimento = new FilaAtendimento();
    }

    public void atenderClienteMecanica() {
        if (filaAtendimento.isVazia()) {
            System.out.println("Não há clientes na fila de atendimento");
            return;
        }

        Cliente cliente = filaAtendimento.removeCliente();
        System.out.println("Cliente " + cliente.getNome() + " sendo atendido(a) pelo consultor");
        System.out.print("Proximos clientes: ");
        filaAtendimento.imprimeFila();
    }

    public void adicionarClienteMecanica(Cliente cliente) {
        filaAtendimento.adicionaCliente(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado(a) na fila de atendimento de consultoria");
        atenderClienteMecanica();
    }

    public void mostrarQuantidadeClientes() {
        System.out.println("Quantidade de clientes na fila de atendimento de consultoria: " + filaAtendimento.getQuantidadeClientes());
    }
}
