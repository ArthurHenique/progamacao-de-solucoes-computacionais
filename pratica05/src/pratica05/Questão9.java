package pratica05;
import java.util.Scanner;
public class Questão9 {

	public static void main(String[] args) {
		// Ímpares
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = scanner.nextInt();
		
		System.out.println("Números ímpares de 1 até " + numero + ":");
		
		 for (int i = 1; i <= numero; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
		}
	 }
   }
}

