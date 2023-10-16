package pratica05;
import java.util.Scanner;
public class Questão8 {

	public static void main(String[] args) {
		// Elevado
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a base (primeiro número): ");
        int base = scanner.nextInt();

        System.out.print("Informe o expoente (segundo número): ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        } else {
            System.out.println("O expoente deve ser não negativo para este cálculo.");
        }

        System.out.println("O resultado da potência é: " + resultado);

	}

}
