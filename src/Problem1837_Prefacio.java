import java.util.Scanner;

public class Problem1837_Prefacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int q;
        int r;

        if (a < 0) {
            if (b > 0) {
                q = (int) Math.floor(a / b);
            }
            else  {
                q = (int) Math.ceil(a / b);
            }
            r = (int) (a - (b * q));
        }
        else {
            q = (int) (a / b);
            r = (int) (a % b);
        }

        System.out.printf("%d %d%n", q, r);
    }
}
