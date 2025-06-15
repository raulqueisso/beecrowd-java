import java.util.Scanner;

public class Problem1973_JornadaNasEstrelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdEstrelas = sc.nextInt();
        int[] carneirosEmEstrela = new int[qtdEstrelas];
        boolean[] foiRoubada = new boolean[qtdEstrelas];

        for (int i = 0; i < qtdEstrelas; i++) {
            carneirosEmEstrela[i] = sc.nextInt();
        }

        int alvo = 0;
        while (alvo >= 0 && alvo < qtdEstrelas) {
            int carneiros = carneirosEmEstrela[alvo];

            if (carneirosEmEstrela[alvo] > 0) {
                carneirosEmEstrela[alvo]--;
                foiRoubada[alvo] = true;
            }

            if (carneiros % 2 == 0) {
                alvo--;
            } else{
                alvo++;
            }
        }

        int estrelasRoubadas = 0;
        long carneirosNaoRoubados = 0;
        for (int i = 0; i < qtdEstrelas; i++) {
            if (foiRoubada[i]) {
                estrelasRoubadas++;
            }
            carneirosNaoRoubados += carneirosEmEstrela[i];
        }

        System.out.println(estrelasRoubadas + " " + carneirosNaoRoubados);

        sc.close();
    }
}
