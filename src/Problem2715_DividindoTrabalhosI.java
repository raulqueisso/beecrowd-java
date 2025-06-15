// Solução por xTecna: https://github.com/xTecna/solucoes-da-beecrowd/blob/main/problemas/iniciante/2715/2715.java
// A minha solução estava dando time out, porque eu não estava usando pesquisa binária

import java.util.Scanner;

public class Problem2715_DividindoTrabalhosI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] x = new int[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }

            long[] somas = new long[n];
            somas[0] = x[0];
            for (int i = 1; i < n; i++) {
                somas[i] = x[i] + somas[i - 1];
            }

            int inicio = 0;
            int fim = n;
            long resposta = somas[n - 1];
            while (inicio < fim) {
                int meio = (inicio + fim) / 2;
                long rangel = somas[meio];
                long gugu = somas[n - 1] - rangel;
                resposta = Math.min(resposta, Math.abs(rangel - gugu));

                if (rangel == gugu) {
                    break;
                }
                else if (rangel < gugu) {
                    inicio = meio + 1;
                }
                else {
                    fim = meio;
                }
            }

            System.out.println(resposta);
        }

        sc.close();
    }
}
