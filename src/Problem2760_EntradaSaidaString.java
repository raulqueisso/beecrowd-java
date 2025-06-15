import java.util.Scanner;

public class Problem2760_EntradaSaidaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];

        for (int i = 0; i < 3; i++) {
            frases[i] = sc.nextLine();
        }

        System.out.println(frases[0] + frases[1] + frases[2]);
        System.out.println(frases[1] + frases[2] + frases[0]);
        System.out.println(frases[2] + frases[0] + frases[1]);

        for (int i = 0; i < 3; i++) {
            frases[i] = charRedux(frases[i]);
        }

        System.out.println(frases[0] + frases[1] + frases[2]);
    }

    static String charRedux(String s) {
        if (s.length() > 10) {
            return s.substring(0, 10);
        }
        return s;
    }
}