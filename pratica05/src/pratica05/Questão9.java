package pratica05;
import java.util.Scanner;
public class Quest�o9 {

	public static void main(String[] args) {
		// �mpares
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		int numero = scanner.nextInt();
		
		System.out.println("N�meros �mpares de 1 at� " + numero + ":");
		
		 for (int i = 1; i <= numero; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
		}
	 }
   }
}

