import java.util.Scanner;

public class Problem2520_UltimoAnalogimon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] mat = new int[n][m];
            int[] player = new int[2];
            int[] analogimon = new int[2];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.nextInt();

                    if (mat[i][j] == 1) {
                        player[0] = i;
                        player[1] = j;
                    } else if (mat[i][j] == 2) {
                        analogimon[0] = i;
                        analogimon[1] = j;
                    }
                }
            }

            int steps = Math.abs(player[0] - analogimon[0]) + Math.abs(player[1] - analogimon[1]);
            System.out.println(steps);
        }
    }
}
