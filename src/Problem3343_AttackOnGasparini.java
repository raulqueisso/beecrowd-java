import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3343_AttackOnGasparini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdTitas = sc.nextInt();
        int tamanhoMuralhas = sc.nextInt();
        sc.nextLine();

        char[] titas = sc.nextLine().toCharArray();
        int[] tamanhoTitas = new int[3];
        int[] obstaculos = { 0, 0, 0 };

        for (int i = 0; i < tamanhoTitas.length; i++) {
            tamanhoTitas[i] = sc.nextInt();
        }

        List<Integer> muralhas = new ArrayList<Integer>();
        muralhas.add(tamanhoMuralhas);

        for (int i = 0; i < qtdTitas; i++) {
            char tipoTita = titas[i];
            int idTipoTita = 0;
            int obstaculo;
            int tamanhoTita;

            switch (tipoTita) {
                case 'P':
                    idTipoTita = 0;
                    break;
                case 'M':
                    idTipoTita = 1;
                    break;
                case 'G':
                    idTipoTita = 2;
            }
            tamanhoTita = tamanhoTitas[idTipoTita];
            obstaculo = obstaculos[idTipoTita];

            boolean titaVivo = true;
            while (titaVivo) {
                for (int j = obstaculo; j < muralhas.size(); j++) {
                    int muralhaAtual = muralhas.get(j);
                    if (tamanhoTita <= muralhaAtual) {
                        muralhas.set(j, muralhaAtual - tamanhoTita);
                        titaVivo = false;
                        obstaculos[idTipoTita] = j;
                        break;
                    } else if (j == muralhas.size() - 1) {
                        muralhas.add(tamanhoMuralhas);
                    }
                }
            }
        }
        System.out.println(muralhas.size());

        sc.close();
    }
}
