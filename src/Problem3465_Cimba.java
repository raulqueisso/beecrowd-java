import java.util.Locale;
import java.util.Scanner;

public class Problem3465_Cimba {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("%.3f m2\n", area);

        sc.close();
    }
}
