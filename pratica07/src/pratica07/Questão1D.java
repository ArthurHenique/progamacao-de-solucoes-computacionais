package pratica07;
import java.util.Scanner;
public class Quest�o1D {

	public static void main(String[] args) {
		// D
		Scanner scanner = new Scanner(System.in);

        int linhas = 5;
        int colunas = 5;

        double[][] matriz = new double[linhas][colunas];

        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        for (int i = 0; i < linhas; i++) {
            double temp = matriz[i][i];
            matriz[i][i] = matriz[i][colunas - 1 - i];
            matriz[i][colunas - 1 - i] = temp;
        }

        System.out.println("Matriz resultante ap�s trocar diagonais:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

	}

}
