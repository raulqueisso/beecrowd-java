import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2770_TamanhoPlaca {
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);

        String linha = "";
        while((linha = reader.readLine()) != null) {
            String[] linhaArray = linha.split(" ");
            int[] dimensoesPlaca = { Integer.parseInt(linhaArray[0]), Integer.parseInt(linhaArray[1]) };
            int qtdPedidos = Integer.parseInt(linhaArray[2]);

            int[][] dimensoesClientes = new int[qtdPedidos][2];
            for (int i = 0; i < qtdPedidos; i++) {
                linhaArray = reader.readLine().split(" ");
                dimensoesClientes[i][0] = Integer.parseInt(linhaArray[0]);
                dimensoesClientes[i][1] = Integer.parseInt(linhaArray[1]);

                if ((dimensoesPlaca[0] >= dimensoesClientes[i][0] && dimensoesPlaca[1] >= dimensoesClientes[i][1]) || (dimensoesPlaca[1] >= dimensoesClientes[i][0] && dimensoesPlaca[0] >= dimensoesClientes[i][1])) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }
            }
        }
        reader.close();
    }
}
