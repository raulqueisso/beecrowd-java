import java.util.Scanner;

public class Problem3224_Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();

        if (a.length() < b.length()) {
            System.out.println("no");
        }
        else {
            System.out.println("go");
        }

        sc.close();
    }
}
