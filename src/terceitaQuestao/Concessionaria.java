package terceitaQuestao;

import java.util.Scanner;

public class Concessionaria {
    private Recepcionista recepcionista;
    private Vendedor vendedor;
    private Mecanica mecanica;
    private Acessorio acessorio;

    public Concessionaria() {
        this.recepcionista = new Recepcionista();
        this.vendedor = new Vendedor();
        this.mecanica = new Mecanica();
        this.acessorio = new Acessorio();
    }

    public void novoCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " chegou na concessionária");
        recepcionista.atenderCliente();
        encaminharCliente(cliente);
    }

    public void encaminharCliente(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para qual setor deseja ser encaminhado?");
        System.out.println("1 - Vendas");
        System.out.println("2 - Oficina de mecanica");
        System.out.println("3 - Acessorios");
        System.out.println("4 - Atendimento TV");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                vendedor.adicionarClienteVendas(cliente);
                return;
            case 2:
                mecanica.adicionarClienteMecanica(cliente);
                return;
            case 3:
                acessorio.adicionarClienteAcessorio(cliente);
                return;
            case 4:
                atendimentoTv();
                return;
            default:
                System.out.println("Opção inválida");
                System.out.println("Encaminhando de volta ao recepcionista");
                recepcionista.atenderCliente();
                break;
        }
    }

    public void atendimentoTv() {
        System.out.println("------ ATENDIMENTO EM ANDAMENTO ------");
        System.out.println("Vendas de automóveis:");
        vendedor.mostrarQuantidadeClientes();
        System.out.println("Oficina mecânica:");
        mecanica.mostrarQuantidadeClientes();
        System.out.println("Acessórios:");
        acessorio.mostrarQuantidadeClientes();
        System.out.println("---------------------------------------");
    }

}
