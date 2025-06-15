import java.math.BigInteger;
import java.util.Scanner;

public class Problem2802_DividindoCirculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long linhas = (long) n * (n - 1) / 2;
        long interseccoes = (long) n * (n -1) * (n - 2) * (n -3) / 24;
        long partes = 1 + linhas + interseccoes;
        System.out.println(partes);

        sc.close();
    }
}
