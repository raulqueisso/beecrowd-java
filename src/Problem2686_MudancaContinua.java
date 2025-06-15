import java.util.Locale;
import java.util.Scanner;

public class Problem2686_MudancaContinua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        while (sc.hasNext()) {

            double m = sc.nextDouble();

            if (m == 360 || m < 90) {
                System.out.println("Bom Dia!!");
            } else if (m >= 90 && m < 180) {
                System.out.println("Boa Tarde!!");
            } else if (m >= 180 && m < 270) {
                System.out.println("Boa Noite!!");
            } else {
                System.out.println("De Madrugada!!");
            }

            int hours = (int) ((m * 24) / 360) + 6;
            if (hours >= 24) {
                hours -= 24;
            }

            double remainder = (m * 24) % 360;

            int minutes = (int) remainder / 6;
            int seconds = (int) ((remainder / 6) - minutes) / 6;

            String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println(time);
        }
    }
}