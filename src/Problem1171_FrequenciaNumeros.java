import java.util.Scanner;

public class Problem1171_FrequenciaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int qtd = 1;
            int num = numeros[i];

            for (int j = i + 1; j < n; j++) {
                if (numeros[i] != numeros[j]) {
                    i = j - 1;
                    break;
                }
                qtd++;

                if (j == n - 1) {
                    i = n;
                }
            }
            System.out.printf("%d aparece %d vez(es)\n", num, qtd);
        }

        sc.close();
    }
}
