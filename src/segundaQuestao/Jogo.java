package segundaQuestao;

import java.util.Scanner;

public class Jogo {

    private final int TAMANHO_PISTA = 20;
    private Pista pista;
    private Carro carro;

    public Jogo() {
        this.pista = new Pista(TAMANHO_PISTA);
        this.carro = new Carro();
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo!");
        System.out.println("Aperte m para mover o carro, para pular aperte p");
        System.out.println(carro.getTipo());
        System.out.println(pista.pistaToString());
        pista.gerarPista();

        while(carro.getTipoCarro() != TipoCarro.EXPLODIDO && pista.quantidadeTijolos() > 0) {
            String comando = scanner.nextLine();
            if(comando.equals("m")) {
                pista.moverCarro();
                carro.mover();
            } else if(comando.equals("p")) {
                pista.pularCarro(carro.getDistancia());
                carro.pular();
            } else {
                System.out.println("Comando inválido");
            }
            if(pista.explodeBomba()) {
                carro.explodir();
            } else if(pista.carroEnergizado()) {
                carro.proteger();
            } else {
                carro.setTipo(TipoCarro.NORMAL);
            }
            pista.destruirTijolo();
            System.out.println(carro.getTipo());
            System.out.println(pista.pistaToString());

        }

        if(carro.getTipoCarro() == TipoCarro.EXPLODIDO) {
            System.out.println("Você perdeu!");
            System.out.println("Distância percorrida: " + carro.getDistancia());
            System.out.println("Quantidade de tijolos energizados: " + carro.getQuantidadeTijolosEnergizados());
            System.out.println("Quantidade de bombas: " + carro.getQuantidadeTijolosBombas());

        } else {
            System.out.println("Você ganhou!");
            System.out.println("Distância percorrida: " + carro.getDistancia());
            System.out.println("Quantidade de tijolos energizados: " + carro.getQuantidadeTijolosEnergizados());
            System.out.println("Quantidade de bombas: " + carro.getQuantidadeTijolosBombas());

        }

    }
}
