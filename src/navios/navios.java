package navios;

import TelaInicial.BatalhaNaval;
import tabuleiro.tabuleiro;

import java.util.Scanner;

public class navios extends BatalhaNaval {

    private static boolean primeiroNavioEscolhido = false;
    private static boolean segundoNavioEscolhido = false;
    private static boolean terceiroNavioEscolhido = false;
    private static boolean ultimaNavioEscolhida = false;


    public static void exibirMenu() {
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
                    if (!primeiroNavioEscolhido) {
                        System.out.println("Porta-aviões Escolhido");
                        primeiroNavioEscolhido = true;
                        tabuleiro.exibirTabuleiroN();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                        tabuleiro.exibirTabuleiroN();
                    }
                    break;
                case 2:
                    if (!segundoNavioEscolhido) {
                        System.out.println("Navio-Tanque Escolhido!");
                        segundoNavioEscolhido = true;
                        tabuleiro.exibirTabuleiroN();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                    }
                    break;
                case 3:
                    if (!terceiroNavioEscolhido) {
                        System.out.println("Contra-torpedeiros escolhido!");
                        terceiroNavioEscolhido = true;
                        tabuleiro.exibirTabuleiroN();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                    }
                    break;
                case 4:
                    if (!ultimaNavioEscolhida) {
                        System.out.println("Submarino Escolhido!");
                        ultimaNavioEscolhida = true;
                        tabuleiro.exibirTabuleiroN();
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
                                    "Esse comando Não Existe Capitão!\n" +
                                    "<---------------------------> \n");
            }
        } while (opcao != 9);

        scanner.close();
    }
}

