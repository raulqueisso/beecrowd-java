import java.util.Scanner;

public class Problem2718_LuzesNatal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            String binary = Long.toBinaryString(x);
            int qtd = 0;
            int qtdMaior = 0;

            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    qtd++;
                }
                else {
                    qtdMaior = Math.max(qtd, qtdMaior);
                    qtd = 0;
                }
            }
            qtdMaior = Math.max(qtd, qtdMaior);

            System.out.println(qtdMaior);
        }
    }
}
