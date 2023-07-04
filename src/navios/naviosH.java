package navios;

import tabuleiro.tabuleiro;

import java.util.Scanner;

public class naviosH extends TelaInicial.JogoSimples {

    private static boolean primeiroCapitaoEscolhido = false;
    private static boolean segundoCapitaoEscolhido = false;
    private static boolean terceiroCapitaoEscolhido = false;
    private static boolean ultimaEmbarcacaoEscolhida = false;


    public static void exibirMenuH() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n Escolha Qual barco o Capitão quer Colocar Primeiro:");
            System.out.println("1 - Porta-aviões (P): ocupa 5 posições do tabuleiro");
            System.out.println("2 - Navios-tanque (N): cada um ocupa 4 posições do tabuleiro");
            System.out.println("3 - Contra-torpedeiros (C): cada um ocupa 3 posições do tabuleiro");
            System.out.println("4 - Submarinos (S): cada um ocupa 2 posições do tabuleiro");
            System.out.println("0 - Naufragar");
            System.out.print("Escolha a opção Capitão: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (!primeiroCapitaoEscolhido) {
                        System.out.println("\nPorta-aviões Escolhido!\n");
                        primeiroCapitaoEscolhido = true;
                        tabuleiro.exibirTabuleiroH();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                        tabuleiro.exibirTabuleiroH();
                    }
                    break;
                case 2:
                    if (!segundoCapitaoEscolhido) {
                        System.out.println("\nNavio-Tanque Escolhido!\n");
                        segundoCapitaoEscolhido = true;
                        tabuleiro.exibirTabuleiroH();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                    }
                    break;
                case 3:
                    if (!terceiroCapitaoEscolhido) {
                        System.out.println("\nContra-torpedeiros escolhido!\n");
                        terceiroCapitaoEscolhido = true;
                        tabuleiro.exibirTabuleiroH();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                    }
                    break;
                case 4:
                    if (!ultimaEmbarcacaoEscolhida) {
                        System.out.println("\nSubmarino Escolhido!\n");
                        ultimaEmbarcacaoEscolhida = true;
                        tabuleiro.exibirTabuleiroH();
                        break;
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");

                    }
                    break;
                case 0:
                    System.out.println(
                            "\n<---------------------------------------> \n" +
                                    "O capitão escolheu a Derrota, Patético!!! \n" +
                                    "<---------------------------------------> \n");
                    break;
                default:
                    System.out.println(
                            "<---------------------------> \n" +
                                    "Esse comando Não Existe Capitão!" +
                                    "<---------------------------> \n");
            }
        } while (opcao != 9);

        scanner.close();
    }
}

