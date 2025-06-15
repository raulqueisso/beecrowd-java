import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Problem2493_JogoOperador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int t = sc.nextInt();
            sc.nextLine();
            int[][] nums = new int[t][3];

            for (int i = 0; i < t; i++) {
                String[] linha = sc.nextLine().split("[ =]");

                for (int j = 0; j < 3; j++) {
                    nums[i][j] = Integer.parseInt(linha[j]);
                }
            }
            String[] perdedores = new String[t];
            int qtdPerdedores = 0;

            for (int i = 0; i < t; i++) {
                String[] palpite = sc.nextLine().split(" ");
                int index = Integer.parseInt(palpite[1]) - 1;

                boolean teste = TestaSoma(nums[index][0], nums[index][1], nums[index][2]);

                if (Objects.equals(palpite[2], "+") && !teste) {
                    perdedores = AtualizaPerdedores(perdedores, palpite[0]);
                    qtdPerdedores++;
                }
                else if (Objects.equals(palpite[2], "-") && !TestaSubtracao(nums[index][0], nums[index][1], nums[index][2])) {
                    perdedores = AtualizaPerdedores(perdedores, palpite[0]);
                    qtdPerdedores++;
                }
                else if (Objects.equals(palpite[2], "*") && !TestaMultiplicacao(nums[index][0], nums[index][1], nums[index][2])) {
                    perdedores = AtualizaPerdedores(perdedores, palpite[0]);
                    qtdPerdedores++;
                }
                else if (Objects.equals(palpite[2], "I") && (
                        TestaSoma(nums[index][0], nums[index][1], nums[index][2])
                        || TestaSubtracao(nums[index][0], nums[index][1], nums[index][2])
                        || TestaMultiplicacao(nums[index][0], nums[index][1], nums[index][2]))) {
                    perdedores = AtualizaPerdedores(perdedores, palpite[0]);
                    qtdPerdedores++;
                }
            }

            String[] perdedoresSorted = new String[qtdPerdedores];

            for (int i = 0; i < perdedoresSorted.length; i++) {
                if (perdedores[i] != null) {
                    perdedoresSorted[i] = perdedores[i];
                }
            }

            Arrays.sort(perdedoresSorted);
            String nomesPerdedores = "";

            if (qtdPerdedores == 0) {
                System.out.println("You Shall All Pass!");
            } else if (qtdPerdedores == t) {
                System.out.println("None Shall Pass!");
            }
            else {
                for (int i = 0; i < perdedoresSorted.length; i++) {
                    nomesPerdedores += perdedoresSorted[i];
                    nomesPerdedores += " ";
                }
                nomesPerdedores = nomesPerdedores.trim();
                System.out.println(nomesPerdedores);
            }
        }

        sc.close();
    }

    static boolean TestaSoma(int a, int b, int c) {
        return a + b == c;
    }

    static boolean TestaSubtracao(int a, int b, int c) {
        return a - b == c;
    }

    static boolean TestaMultiplicacao(int a, int b, int c) {
        return a * b == c;
    }

    static String[] AtualizaPerdedores(String[] p, String nome) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) {
                p[i] = nome;
                break;
            }
        }
        return p;
    }
}