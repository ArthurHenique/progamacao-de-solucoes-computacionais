package pratica05;
import java.util.Scanner;
public class Quest�o8 {

	public static void main(String[] args) {
		// Elevado
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a base (primeiro n�mero): ");
        int base = scanner.nextInt();

        System.out.print("Informe o expoente (segundo n�mero): ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        } else {
            System.out.println("O expoente deve ser n�o negativo para este c�lculo.");
        }

        System.out.println("O resultado da pot�ncia �: " + resultado);

	}

}
