package primeiraQuestao;//Implemente um serviço de enciclopédia, onde um usuário pode buscar verbetes que, uma vez presentes na enciclopédia, vai
//apresentar ao usuário textos que apresentam as definições associadas àqueles verbetes. Na estrutura interna do serviço, os verbetes são
//armazenados em ordem alfabética de maneira a facilitar buscas. Novos verbetes podem ser adicionados, alguns podem ser removidos por
//moderadores da enciclopédia e outros podem ter seu conteúdo alterado. Cada verbete pode ser vinculado, pelos seus autores/revisores, a
//inúmeros outros verbetes correlatos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Enciclopedia enciclopedia = new Enciclopedia();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Digite 1 para adicionar um verbete");
            System.out.println("Digite 2 para remover um verbete");
            System.out.println("Digite 3 para atualizar a definição de um verbete");
            System.out.println("Digite 4 para buscar um verbete");
            System.out.println("Digite 5 para sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite a palavra do verbete");
                String palavra = scanner.nextLine();
                System.out.println("Digite a definição do verbete");
                String definicao = scanner.nextLine();

                Verbete verbete = new Verbete(palavra, definicao);
                enciclopedia.adicionarVerbete(verbete);
            } else if (opcao == 2) {
                System.out.println("Digite a palavra do verbete");
                String palavra = scanner.nextLine();

                Verbete verbete = enciclopedia.buscarVerbete(palavra);
                enciclopedia.removerVerbete(verbete);
            } else if (opcao == 3) {
                System.out.println("Digite a palavra do verbete");
                String palavra = scanner.nextLine();
                System.out.println("Digite a nova definição do verbete");
                String definicao = scanner.nextLine();

                Verbete verbete = enciclopedia.buscarVerbete(palavra);
                enciclopedia.atualizarDefinicao(verbete, definicao);
            } else if (opcao == 4) {
                System.out.println("Digite a palavra do verbete");
                String palavra = scanner.nextLine();

                Verbete verbete = enciclopedia.buscarVerbete(palavra);
                System.out.println(verbete.getDefinicao());
            } else if (opcao == 5) {
                break;
            }


        }

        scanner.close();

    }
}