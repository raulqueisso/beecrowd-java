import java.io.IOException;
import java.util.Scanner;

public class Problem1448_TelefoneSemFio {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numInstancias = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstancias; i++) {
            char[] fraseOriginal = scanner.nextLine().toCharArray();
            char[] fraseTime1 = scanner.nextLine().toCharArray();
            char[] fraseTime2 = scanner.nextLine().toCharArray();
            int pontosTime1 = 0;
            int pontosTime2 = 0;
            int primeiroTimeAPontuar = 0;

            int tamanho = fraseOriginal.length;
            for (int j = 0; j < tamanho; j++) {
                if (fraseOriginal[j] == fraseTime1[j]) {
                    pontosTime1++;

                    if (primeiroTimeAPontuar == 0 && fraseOriginal[j] != fraseTime2[j]) {
                        primeiroTimeAPontuar = 1;
                    }
                }

                if (fraseOriginal[j] == fraseTime2[j]) {
                    pontosTime2++;

                    if (primeiroTimeAPontuar == 0 && fraseOriginal[j] != fraseTime1[j]) {
                        primeiroTimeAPontuar = 2;
                    }
                }
            }

            System.out.println("Instancia " + (i + 1));
            if (pontosTime1 > pontosTime2) {
                System.out.println("time 1");
            } else if (pontosTime2 > pontosTime1) {
                System.out.println("time 2");
            } else if (primeiroTimeAPontuar != 0) {
                System.out.println("time " + primeiroTimeAPontuar);
            } else {
                System.out.println("empate");
            }

            System.out.println();
        }

        scanner.close();
    }
}
