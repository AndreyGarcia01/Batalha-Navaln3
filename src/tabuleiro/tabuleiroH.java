package tabuleiro;

public class tabuleiroH extends TelaInicial.JogoSimples {
    public static void exibirTabuleiroH() {
        int tamanhoTabuleiro = 10;

        System.out.println("Tabuleiro:");

        for (int linha = 0; linha < tamanhoTabuleiro; linha++) {
            for (int coluna = 0; coluna < tamanhoTabuleiro; coluna++) {
                System.out.print("~ ");
            }
            System.out.println();
        }
    }
}
