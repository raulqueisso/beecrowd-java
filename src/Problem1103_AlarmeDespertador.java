import java.util.Scanner;

public class Problem1103_AlarmeDespertador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int horaInicial = sc.nextInt();
            int minutoInicial = sc.nextInt();
            int horaFinal = sc.nextInt();
            int minutoFinal = sc.nextInt();

            if (horaInicial == minutoInicial && horaInicial == horaFinal && horaInicial == minutoFinal && horaInicial == 0) {
                break;
            }

            int horas = horaFinal - horaInicial;
            if (horaFinal < horaInicial || (horaFinal == horaInicial && minutoFinal <= minutoInicial)) {
                horas += 24;
            }

            int minutos = minutoFinal - minutoInicial;
            if (minutoFinal < minutoInicial) {
                minutos += 60;
                horas--;
            }

            minutos += horas * 60;

            System.out.println(minutos);
        }

        sc.close();
    }
}
