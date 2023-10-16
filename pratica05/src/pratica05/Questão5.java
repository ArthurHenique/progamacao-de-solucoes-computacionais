package pratica05;
import java.util.Scanner;
public class Questão5 {

	public static void main(String[] args) {
		// Maior e menor
		Scanner scanner = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Informe os números (digite 0 para encerrar):");

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
            System.out.println("Maior número informado: " + maior);
            System.out.println("Menor número informado: " + menor);
        } else {
            System.out.println("Nenhum número informado ou somente o número 0 foi informado.");
        }

	}

}
