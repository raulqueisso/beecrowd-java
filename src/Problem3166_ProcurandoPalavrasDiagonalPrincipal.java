import java.util.Locale;
import java.util.Scanner;

public class Problem3166_ProcurandoPalavrasDiagonalPrincipal {
    static char[][] matriz;
    static int linhas;
    static int colunas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        linhas = sc.nextInt();
        colunas = sc.nextInt();
        sc.nextLine();

        String[] palavras = new String[n];
        for (int i = 0; i < n; i++) {
            palavras[i] = sc.nextLine().trim().toLowerCase(Locale.ROOT);
        }

        matriz = new char[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            matriz[i] = sc.nextLine().trim().toLowerCase(Locale.ROOT).toCharArray();
        }

        for (int i = 0; i < n; i++) {
            pesquisarPalavra(palavras[i]);
        }

        sc.close();
    }

    static void pesquisarPalavra(String palavra) {
        String palavraInvertida = inverterPalavra(palavra);

        // DIAGONAL PRINCIPAL
        String diagonal = "";
        for (int i = 0; i < linhas; i++) {
            diagonal += matriz[i][i];
        }
        if (diagonal.contains(palavra) || diagonal.contains(palavraInvertida)) {
            System.out.printf("1 Palavra \"%s\" na diagonal principal\n", palavra);
            return;
        }

        // ACIMA DA DIAGONAL PRINCIPAL
        String[] acimaDiagonal = new String[colunas - 1];
        int inc = 1;
        for (int i = 0; i < colunas - 1; i++) {
            acimaDiagonal[i] = "";
            for (int j = 0; j < Math.min(colunas - 1, colunas - inc); j++) {
                if (j > linhas - 1) {
                    continue;
                }
                acimaDiagonal[i] += matriz[j][j + inc];
            }
            inc++;

            if (acimaDiagonal[i].contains(palavra) || acimaDiagonal[i].contains(palavraInvertida)) {
                System.out.printf("2 Palavra \"%s\" acima da diagonal principal\n", palavra);
                return;
            }
        }

        // ABAIXO DA DIAGONAL PRINCIPAL
        String[] abaixoDiagonal = new String[linhas - 1];
        inc = 1;
        for (int i = 0; i < linhas - 1; i++) {
            abaixoDiagonal[i] = "";
            for (int j = 0; j < Math.min(linhas - 1, linhas - inc); j++) {
                if (j > colunas - 1) {
                    continue;
                }
                abaixoDiagonal[i] += matriz[j + inc][j];
            }
            inc++;

            if (abaixoDiagonal[i].contains(palavra) || abaixoDiagonal[i].contains(palavraInvertida)) {
                System.out.printf("3 Palavra \"%s\" abaixo da diagonal principal\n", palavra);
                return;
            }
        }

        // INEXISTENTE
        System.out.printf("4 Palavra \"%s\" inexistente\n", palavra);
    }

    static String inverterPalavra(String palavra) {
        char[] caracteres = palavra.toCharArray();
        for (int i = 0; i < caracteres.length / 2; i++) {
            char aux = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - i - 1];
            caracteres[caracteres.length - i - 1] = aux;
        }

        String resultado = "";
        for (int i = 0; i < caracteres.length; i++) {
            resultado += caracteres[i];
        }
        return resultado;
    }
}