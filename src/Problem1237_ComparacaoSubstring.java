import java.util.Scanner;

public class Problem1237_ComparacaoSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            if (str1.length() > str2.length()) {
                System.out.println(comparar(str1, str2));
            } else {
                System.out.println(comparar(str2, str1));
            }
        }

        sc.close();
    }

    public static int comparar(String maior, String menor) {
        for (int tamanhoSub = menor.length(); tamanhoSub > 0; tamanhoSub--) {
            for (int i = 0; i <= menor.length() - tamanhoSub; i++) {
                String sub = menor.substring(i, tamanhoSub + i);
                if (maior.contains(sub)) {
                    return tamanhoSub;
                }
            }
        }
        return 0;
    }
}
