import java.util.Scanner;

public class Problem1287_ProcessadorAmigavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine().trim();
            //System.out.println(str.matches("(([, ])*[0-9])*"));
            char[] arr = str.toCharArray();
            int tamanho = arr.length;
            StringBuilder sb = new StringBuilder();

            for (char c : arr) {
                if (c != ' ' && c != ',') {
                    if (c == 'o' || c == 'O') {
                        sb.append('0');
                    } else if (c == 'l') {
                        sb.append('1');
                    } else {
                        sb.append(c);
                    }
                }
            }

            try {
                int num = Integer.parseInt(sb.toString());
                if (num >= 0) {
                    System.out.println(num);
                } else {
                    System.out.println("error");
                }
            } catch (NumberFormatException e) {
                System.out.println("error");
            }
        }

        sc.close();
    }
}
