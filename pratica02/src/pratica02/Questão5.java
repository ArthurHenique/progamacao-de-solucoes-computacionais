package pratica02;
import java.util.Scanner;
public class Quest�o5 {

	public static void main(String[] args) {
		// Fun��o
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um valor para x: ");
	        double x = scanner.nextDouble();

	        double resultado;

	        if (x < -2) {
	            resultado = 2 * x + 2;
	        } else if (x >= -2 && x < 3) {
	            resultado = -x;
	        } else {
	            resultado = 3;
	        }

	        System.out.println("O valor da fun��o f(x) para x = " + x + " �: " + resultado);

	        scanner.close();

	}

}
