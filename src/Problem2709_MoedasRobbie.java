import java.util.Scanner;

public class Problem2709_MoedasRobbie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int qtdMoedas = sc.nextInt();
            int[] moedas = new int[qtdMoedas];

            for (int i = 0; i < qtdMoedas; i++) {
                moedas[i] = sc.nextInt();
            }

            int salto = sc.nextInt();
            int soma = 0;

            for (int i = qtdMoedas - 1; i >= 0; i -= salto) {
                soma += moedas[i];
            }

            boolean primo = true;
            if (soma == 1) {
                primo = false;
            }
            else if (soma % 2 == 0 && soma > 2) {
                primo = false;
            }
            else {
                for (int i = 3; i < soma / 2; i += 2) {
                    if (soma % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            }
            else {
                System.out.println("Bad boy! I’ll hit you.");
            }
        }

        sc.close();
    }
}
