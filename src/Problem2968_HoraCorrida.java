import java.util.Scanner;

public class Problem2968_HoraCorrida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int n = sc.nextInt();

        int totalPlacas = v * n;
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            if (i > 1) {
                str.append(" ");
            }
            str.append((int) Math.ceil(totalPlacas * (i /10.0)));
        }
        System.out.println(str);

        sc.close();
    }
}
