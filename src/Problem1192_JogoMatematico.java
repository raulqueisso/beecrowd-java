import java.util.Scanner;

public class Problem1192_JogoMatematico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String linha = sc.next();

            int dig1 = Integer.parseInt(String.valueOf(linha.charAt(0)));
            char letra = linha.charAt(1);
            int dig2 = Integer.parseInt(String.valueOf(linha.charAt(2)));
            int result;

            if (dig1 == dig2) {
                result = dig1 * dig2;
            }
            else if (Character.isUpperCase(letra)) {
                result = dig2 - dig1;
            }
            else {
                result = dig1 + dig2;
            }
            System.out.println(result);
        }
    }
}
