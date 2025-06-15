import java.util.Scanner;

public class Problem3042_DesviandoArvoresNatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        while (m != 0) {
            int posicao = 1;
            int toques = 0;

            for (int i = 0; i < m; i++) {
                int[] pista = new int[3];

                for (int j = 0; j < pista.length; j++) {
                    pista[j] = sc.nextInt();
                }

                if (pista[posicao] != 0) {
                    int livre = -1;
                    for (int j = 0; j < pista.length; j++) {
                        if (pista[j] == 0) {
                            livre = j;
                        }
                    }
                    toques += Math.abs(posicao - livre);
                    posicao = livre;
                }
            }
            System.out.println(toques);

            m = sc.nextInt();
        }

        sc.close();
    }
}
