package terceitaQuestao;

import java.util.Random;

public class Vendedor {
    private FilaAtendimento filaAtendimento;

    public Vendedor() {
        this.filaAtendimento = new FilaAtendimento();
    }

    public void atenderClienteVendas() {

        if (filaAtendimento.isVazia()) {
            System.out.println("Não há clientes na fila de atendimento");
            return;
        } else if (filaAtendimento.getQuantidadeClientes() < 5) {
            System.out.println("Não há clientes suficientes para atendimento");
            return;
        } else if(filaAtendimento.getQuantidadeClientes() > 5) {
            System.out.println("Atendendo próximo cliente");
            Cliente cliente = filaAtendimento.removeCliente();
        System.out.println("Cliente " + cliente.getNome() + " sendo atendido(a) pelo vendedor de vendas");
        }
        System.out.print("Proximos clientes: ");
        filaAtendimento.imprimeFila();
    }

    public void adicionarClienteVendas(Cliente cliente) {
        filaAtendimento.adicionaCliente(cliente);

        System.out.println("Cliente " + cliente.getNome() + " adicionado(a) na fila de atendimento de vendas");
        atenderClienteVendas();
    }

    public void mostrarQuantidadeClientes() {
        System.out.println("Quantidade de clientes na fila de atendimento de vendas: " + filaAtendimento.getQuantidadeClientes());
    }
}
