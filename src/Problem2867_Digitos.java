import java.math.BigInteger;
import java.util.Scanner;

public class Problem2867_Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            BigInteger resultado = BigInteger.valueOf(n).pow(m);
            int digitos = 0;

            while (resultado.compareTo(BigInteger.valueOf(0)) > 0) {
                resultado = resultado.divide(BigInteger.valueOf(10));
                digitos++;
            }
            System.out.println(digitos);
        }
        sc.close();
    }
}
