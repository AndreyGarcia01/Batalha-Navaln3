package navios;

import TelaInicial.BatalhaNaval;
import tabuleiro.tabuleiroH;

import java.util.Scanner;

public class naviosH extends BatalhaNaval {

    private static boolean primeiroNavioEscolhido = false;
    private static boolean segundoNavioEscolhido = false;
    private static boolean terceiroNavioEscolhido = false;
    private static boolean ultimoNavioEscolhida = false;


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
                    if (!primeiroNavioEscolhido) {
                        System.out.println("\nPorta-aviões Escolhido!\n");
                        primeiroNavioEscolhido = true;
                        tabuleiroH.exibirTabuleiroH();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                        tabuleiroH.exibirTabuleiroH();
                    }
                    break;
                case 2:
                    if (!segundoNavioEscolhido) {
                        System.out.println("\nNavio-Tanque Escolhido!\n");
                        segundoNavioEscolhido = true;
                        tabuleiroH.exibirTabuleiroH();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                    }
                    break;
                case 3:
                    if (!terceiroNavioEscolhido) {
                        System.out.println("\nContra-torpedeiros escolhido!\n");
                        terceiroNavioEscolhido = true;
                        tabuleiroH.exibirTabuleiroH();
                    } else {
                        System.out.println(
                                "\n<----------------------------------------------------------------------------> \n" +
                                        "Atente-se que somos uma frota pequena e não temos mais do que 1 de cada barco! \n" +
                                        "<----------------------------------------------------------------------------> \n");
                    }
                    break;
                case 4:
                    if (!ultimoNavioEscolhida) {
                        System.out.println("\nSubmarino Escolhido!\n");
                        ultimoNavioEscolhida = true;
                        tabuleiroH.exibirTabuleiroH();
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

