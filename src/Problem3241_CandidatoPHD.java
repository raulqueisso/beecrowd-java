import java.util.Scanner;

public class Problem3241_CandidatoPHD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (sc.hasNextLine()) {
                String linha = sc.nextLine().trim();

                if (Character.isDigit(linha.charAt(0))) {
                    String[] nums = linha.split("\\+");
                    int soma = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                    System.out.println(soma);
                }
                else {
                    System.out.println("skipped");
                }
            }
        }

        sc.close();
    }
}
