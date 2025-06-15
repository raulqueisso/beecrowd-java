import java.util.Scanner;

public class Problem1091_Ngolonia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        while (k != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x == n || y == m) {
                    System.out.println("divisa");
                }
                else {
                    if (x < n) {
                        if (y < m) {
                            System.out.println("SO");
                        }
                        else {
                            System.out.println("NO");
                        }
                    }
                    else {
                        if (y < m) {
                            System.out.println("SE");
                        }
                        else {
                            System.out.println("NE");
                        }
                    }
                }
            }
            k = sc.nextInt();
        }
    }
}
