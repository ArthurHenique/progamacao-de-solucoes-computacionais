package pratica07;
import java.util.Scanner;
public class Questão1A {

	public static void main(String[] args) {
		// A
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

        System.out.println("Matriz informada:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
	}

}
