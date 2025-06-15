import java.util.Scanner;

public class Problem2632_MagicAndSword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int largura = sc.nextInt();
            int altura = sc.nextInt();
            int xRetangulo = sc.nextInt();
            int yRetangulo = sc.nextInt();
            sc.nextLine();

            String magia = sc.next();
            int nivel = sc.nextInt();
            int xCirculo = sc.nextInt();
            int yCirculo = sc.nextInt();
            int danoRecebido = 0;
            int danoMagia = 0;
            int raioMagia = 0;
            int[] raiosMagia;

            switch (magia) {
                case "fire":
                    danoMagia = 200;
                    raiosMagia = new int[]{20, 30, 50};
                    raioMagia = raiosMagia[nivel - 1];
                    break;
                case "water":
                    danoMagia = 300;
                    raiosMagia = new int[]{10, 25, 40};
                    raioMagia = raiosMagia[nivel - 1];
                    break;
                case "earth":
                    danoMagia = 400;
                    raiosMagia = new int[]{25, 55, 70};
                    raioMagia = raiosMagia[nivel - 1];
                    break;
                case "air":
                    danoMagia = 100;
                    raiosMagia = new int[]{18, 38, 60};
                    raioMagia = raiosMagia[nivel - 1];
                    break;
            }

            for (int j = yRetangulo; j <= yRetangulo + altura; j++) {
                for (int k = xRetangulo; k <= xRetangulo + largura; k++) {
                    double dist = Math.sqrt(Math.pow(k - xCirculo, 2) + Math.pow(j - yCirculo, 2));
                    if (dist <= raioMagia) {
                        j = yRetangulo + altura;
                        k = xRetangulo + largura;
                        danoRecebido = danoMagia;
                    }
                }
            }

            System.out.println(danoRecebido);
        }
        sc.close();
    }
}
