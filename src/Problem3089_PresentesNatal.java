import java.util.Arrays;
import java.util.Scanner;

public class Problem3089_PresentesNatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {
            int[] presentes = new int[n * 2];

            for (int i = 0; i < presentes.length; i++) {
                presentes[i] = sc.nextInt();
            }

            int[] paresPresentes = new int[n];
            for (int i = 0; i < n; i++) {
                paresPresentes[i] = presentes[i] + presentes[presentes.length - 1 - i];
            }

            Arrays.sort(paresPresentes);

            System.out.printf("%d %d\n", paresPresentes[paresPresentes.length - 1], paresPresentes[0]);

            n = sc.nextInt();
        }

        sc.close();
    }
}
