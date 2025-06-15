import java.util.Scanner;

public class Problem3249_DeathKnightHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int derrotas = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'C') {
                    if (str.length() > j + 1 && str.charAt(j + 1) == 'D') {
                        derrotas++;
                    }
                }
            }
        }
        System.out.println(n - derrotas);

        sc.close();
    }
}
