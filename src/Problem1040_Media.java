import java.util.Locale;
import java.util.Scanner;

public class Problem1040_Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        float[] nota = new float[4];
        float media = 0;

        for (int i = 0; i < nota.length; i++) {
            nota[i] = sc.nextFloat();
        }
        media = (nota[0] * 2 + nota[1] * 3 + nota[2] * 4 + nota[3] * 1) / 10 ;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }
        else if (media >= 5.0) {
            System.out.println("Aluno em exame.");
            if (sc.hasNextFloat()) {
                float notaExame = sc.nextFloat();

                System.out.println("Nota do exame: " + notaExame);
                media = (media + notaExame) / 2;
                if (media >= 5.0) {
                    System.out.println("Aluno aprovado.");
                }
                else {
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f%n", media);
            }
        }
        else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
