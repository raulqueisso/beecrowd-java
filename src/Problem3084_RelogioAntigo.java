import java.util.Scanner;

public class Problem3084_RelogioAntigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int h = sc.nextInt();
            int m = sc.nextInt();

            int horas = (12 * h) / 360;
            int minutos = (60 * m) / 360;

            String str = String.format("%02d:%02d", horas, minutos);
            System.out.println(str);
        }
        sc.close();
    }
}
