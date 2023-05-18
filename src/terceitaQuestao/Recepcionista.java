package terceitaQuestao;

import java.util.Scanner;

public class Recepcionista {

    private final FilaAtendimento filaAtendimento;

    public Recepcionista() {
        filaAtendimento = new FilaAtendimento();
    }

    public void atenderCliente() {

        for (int i = 0; i < 10; i++) {
            String cpf = "12345678901";
            String nome = "Cliente " + (i + 1);
            String telefone = "12345678901";
            String endereco = "Rua " + (i + 1);
            boolean prioridade = i % 2 == 0;

            Cliente novoCliente = new Cliente(cpf, nome, telefone, endereco, prioridade);
            filaAtendimento.adicionaCliente(novoCliente);
            Concessionaria concessionaria = new Concessionaria();
            concessionaria.encaminharCliente(novoCliente);
        }

    }
}
