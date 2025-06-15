import java.util.Locale;
import java.util.Scanner;

public class Problem2761_EntradaSaidaTipos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        float b = sc.nextFloat();
        char c = sc.next().charAt(0);
        String d = sc.nextLine().replaceFirst(" ", "");

        System.out.printf("%d%.6f%s%s\n", a, b, c, d);
        System.out.printf("%d\t%.6f\t%s\t%s\n", a, b, c, d);
        System.out.printf("%10d%10.6f%10c%10s\n", a, b, c, d);

        sc.close();
    }
}
