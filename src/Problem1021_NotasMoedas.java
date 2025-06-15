import java.util.Locale;
import java.util.Scanner;

public class Problem1021_NotasMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] valorNotas = { 100, 50, 20, 10, 5, 2 };
        double[] valorMoedas = { 1, 0.5 , 0.25, 0.10, 0.05, 0.01 };
        int[] qtdNotas = new int[valorNotas.length];
        int[] qtdMoedas = new int[valorMoedas.length];

        double n = sc.nextDouble();

        System.out.println("NOTAS:");
        for (int i = 0; i < valorNotas.length; i++) {
            while (n >= valorNotas[i]) {
                n -= valorNotas[i];
                qtdNotas[i]++;
            }
            String str = String.format("%d nota(s) de R$ %.2f", qtdNotas[i], valorNotas[i]);
            System.out.println(str);
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < valorMoedas.length; i++) {
            if (i == valorMoedas.length - 1 && n > 0.009 && n < 0.01) {
                n += 0.001;
            }

            while (n > valorMoedas[i]) {
                n -= valorMoedas[i];
                qtdMoedas[i]++;
            }
            String str = String.format("%d moeda(s) de R$ %.2f", qtdMoedas[i], valorMoedas[i]);
            System.out.println(str);
        }
        sc.close();
    }
}