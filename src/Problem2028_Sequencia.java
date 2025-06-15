import java.util.Scanner;

public class Problem2028_Sequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caso = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int qtd = 1;
            StringBuilder str = new StringBuilder();
            caso++;

            for (int i = 0; i <= n; i++) {
                qtd += i;
                if (i == 0) {
                    str.append(0);
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    str.append(" ").append(i);
                }
            }

            String numOuNums = (qtd > 1) ? "numeros" : "numero";
            System.out.println("Caso " + caso + ": " + qtd + " " + numOuNums);
            System.out.println(str);
            System.out.println();
        }
    }
}