package pratica05;
import java.util.Scanner;
public class Quest�o5 {

	public static void main(String[] args) {
		// Maior e menor
		Scanner scanner = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Informe os n�meros (digite 0 para encerrar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior n�mero informado: " + maior);
            System.out.println("Menor n�mero informado: " + menor);
        } else {
            System.out.println("Nenhum n�mero informado ou somente o n�mero 0 foi informado.");
        }

	}

}
