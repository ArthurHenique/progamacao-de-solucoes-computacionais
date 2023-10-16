package pratica05;
import java.util.Scanner;
public class Questãoo12 {

	public static void main(String[] args) {
		// Tabuada
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Informe um número: ");
	        int numero = scanner.nextInt();

	        System.out.println("Tabuada de multiplicação de " + numero + ":");

	        for (int i = 0; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }

	}

}
