package pratica05;
import java.util.Scanner;
public class Quest�oo12 {

	public static void main(String[] args) {
		// Tabuada
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Informe um n�mero: ");
	        int numero = scanner.nextInt();

	        System.out.println("Tabuada de multiplica��o de " + numero + ":");

	        for (int i = 0; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }

	}

}
