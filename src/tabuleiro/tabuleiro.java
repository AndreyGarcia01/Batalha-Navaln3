package tabuleiro;

public class tabuleiro extends TelaInicial.JogoSimples {
    public static void exibirTabuleiroN() {
        int tamanhoTabuleiro = 10;

        System.out.println("Tabuleiro:");

        // Exibir letras das colunas (A, B, C, ..., J)
        System.out.print("  ");
        for (char coluna = 'A'; coluna < 'A' + tamanhoTabuleiro; coluna++) {
            System.out.print(coluna + " ");
        }
        System.out.println();

        for (int linha = 1; linha <= tamanhoTabuleiro; linha++) {
            System.out.printf("%2d", linha); // Formatação para alinhar os números das linhas
            for (int coluna = 0; coluna < tamanhoTabuleiro; coluna++) {
                System.out.print(" ~");
            }
            System.out.println();
        }
    }

}

