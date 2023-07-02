package TelaInicial;

import navios.navios;
import tabuleiro.tabuleiro;

import java.util.Scanner;

public class JogoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcaoEscolhida;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Jogar");
            System.out.println("2. Regras");
            System.out.println("3. Criadores");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Escolha o Modo de Jogo Capitão: \n");
                    String confirmar;
                    do {
                        System.out.print("Você quer jogar no modo Hardcore?? (Sim/Nao):");
                        confirmar = scanner.nextLine().trim().toLowerCase();
                    } while (!confirmar.equals("sim") && !confirmar.equals("nao"));

                    if (confirmar.equals("sim")) {
                        System.out.println("Entrando no modo hardcore...");
                        tabuleiro.exibirTabuleiroH();
                        return; // Encerra o programa
                    } else {
                        System.out.println("Continuando No jogo normal...");
                        tabuleiro.exibirTabuleiroN();
                        navios.navios();
                    }
                    return;
                case 2:
                    System.out.println(
                            "<------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->" +
                            "\nRegras do jogo: \n Seu objectivo é simples apenas derrube todos os barcos do Capitão Inimigo (ARRRGG!!), \n Ganha o melhor Capitão que conseguir derrubar toda a frota naval inimiga, \n Espero que tenha entendido, e Boa Sorte Na Batalha!!!." +
                            "\n<-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------> \n");
                    break;
                case 3:
                    System.out.println(
                            "\n<---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->" +
                            "\n  Criado pelos Capitães: \n Andrey Garcia dos Santos e Eliel Carvalho Junior" +
                            "\n<----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------> \n");
                    break;
                case 4:
                    System.out.println("Tem Certeza que quer Abandonar o Barco Capitão? (sim/nao)");
                    scanner.nextLine(); // Consumir a quebra de linha pendente após a leitura do número
                    String confirmacao = scanner.nextLine().trim().toLowerCase();
                    if (confirmacao.equals("sim")) {
                        System.out.println("Barco Afundando...");
                        return; // Encerra o programa
                    } else if (confirmacao.equals("nao") || confirmacao.equals("não")) {
                        System.out.println("Obrigado por continuar com a Gente Capitão!! \n");
                        break;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

            }
        } while (opcaoEscolhida != 8);


        scanner.close();
    }

}


