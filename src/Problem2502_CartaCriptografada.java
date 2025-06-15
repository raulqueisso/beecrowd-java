import java.util.Scanner;

public class Problem2502_CartaCriptografada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int c = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            String[] cipher = new String[2];
            cipher[0] = sc.nextLine().toLowerCase();
            cipher[1] = sc.nextLine().toLowerCase();

            for (int i = 0; i < n; i++) {
                String phrase = sc.nextLine();
                StringBuilder newPhrase = new StringBuilder();

                for (int j = 0; j < phrase.length(); j++) {
                    char character = phrase.charAt(j);

                    for (int k = 0; k < c; k++) {
                        if (Character.toLowerCase(character) == cipher[0].charAt(k)) {
                            if (Character.isUpperCase(character)) {
                                newPhrase.append(Character.toUpperCase(cipher[1].charAt(k)));
                                continue;
                            }
                            newPhrase.append(cipher[1].charAt(k));
                        } else if (Character.toLowerCase(character) == cipher[1].charAt(k)) {
                            if (Character.isUpperCase(character)) {
                                newPhrase.append(Character.toUpperCase(cipher[0].charAt(k)));
                                continue;
                            }
                            newPhrase.append(cipher[0].charAt(k));
                        }
                    }
                    if (newPhrase.length() < j + 1) {
                        newPhrase.append(character);
                    }
                }
                System.out.println(newPhrase);
            }
            System.out.println();
        }
    }
}
