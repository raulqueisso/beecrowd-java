import java.util.Locale;
import java.util.Scanner;

public class Problem1160_CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int populacaoA = sc.nextInt();
            int populacaoB = sc.nextInt();
            double crescimentoA = sc.nextDouble();
            double crescimentoB = sc.nextDouble();
            int anos = 0;

            while (populacaoA <= populacaoB && anos <= 100) {
                populacaoA *= 1 + (crescimentoA / 100);
                populacaoB *= 1 + (crescimentoB / 100);
                anos++;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            }
            else {
                System.out.println(anos + " anos.");
            }
        }
    }
}
