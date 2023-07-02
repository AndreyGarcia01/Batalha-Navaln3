package navios;

import java.util.Scanner;

public class navios {
    private static double[][] tabuleiro;

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;

        do {
            System.out.println("Escolha Qual Navio quer colocar Primeiro Capitão \n");
            System.out.println("1.Porta-aviões (P)");
            System.out.println("2.Navios-tanque (N)");
            System.out.println("3.Contra-torpedeiros (C)");
            System.out.println("4.Submarinos (S)");
            System.out.println("Opção:");
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    colocarNavio('P', 5); // Exemplo: Colocar um porta-aviões de tamanho 5
                    break;
                case 2:
                    colocarNavio('N', 4); // Exemplo: Colocar um navio-tanque de tamanho 4
                    break;
                case 3:
                    colocarNavio('C', 3); // Exemplo: Colocar um contra-torpedeiro de tamanho 3
                    break;
                case 4:
                    colocarNavio('S', 3); // Exemplo: Colocar um submarino de tamanho 3
                    break;
                case 5:
                    return; // Finalizar colocação de navios
                default:
                    System.out.println(
                            "<-----------------------------------------------------> \n"+
                            "Ainda Não Temos esse Navio na Nossa Frota Capitão!, \n" +
                            "Por Favor Escolha um que esteja Disponível. \n" +
                            "<-----------------------------------------------------> \n");
            }
        } while (opcaoEscolhida != 8);

        scanner.close();
    }

    private static void colocarNavio(char tipoNavio, int tamanho) {
        Scanner scanner = new Scanner(System.in);

        // Lógica para posicionar o navio no tabuleiro
        System.out.printf("Posição para o navio %c de tamanho %d (Formato: linha coluna): ", tipoNavio, tamanho);
        int linha = scanner.nextInt();
        int coluna = scanner.nextInt();

        // Verificar se é possível posicionar o navio na posição escolhida
        boolean posicaoValida = true;
        if (linha < 0 || linha >= 10) {
            System.out.println("Posição inválida!");
            posicaoValida = false;
        } else {
            // Verificar se o espaço está vazio
            for (int i = 0; i < tamanho; i++) {
                if (coluna + i >= 10 || tabuleiro[linha][coluna + i] != 0) {
                    System.out.println("Posição ocupada!");
                    posicaoValida = false;
                    break;
                }
            }
        }

        // Se a posição for válida, colocar o navio no tabuleiro
        if (posicaoValida) {
            for (int i = 0; i < tamanho; i++) {
                tabuleiro[linha][coluna + i] = tipoNavio;
            }
            System.out.println("Navio colocado com sucesso!");
        }

        exibirTabuleiro();
    }

    private static void exibirTabuleiro() {
        // Código para exibir o tabuleiro com os navios posicionados
        System.out.println("Tabuleiro com Navios:");
        // ...
        // Código para exibir o tabuleiro
    }
}

