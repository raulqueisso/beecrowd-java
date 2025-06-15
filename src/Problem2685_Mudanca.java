import java.time.LocalTime;
import java.util.Scanner;

public class Problem2685_Mudanca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int m = sc.nextInt();

            if (m == 360 || m < 90) {
                System.out.println("Bom Dia!!");
            } else if (m >= 90 && m < 180) {
                System.out.println("Boa Tarde!!");
            } else if (m >= 180 && m < 270) {
                System.out.println("Boa Noite!!");
            } else {
                System.out.println("De Madrugada!!");
            }
        }
    }
}
