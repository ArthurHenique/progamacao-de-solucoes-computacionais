package pratica05;
import java.util.Scanner;
public class Quest�o3 {

	public static void main(String[] args) {
		// Fatorial
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um n�mero natural para calcular o fatorial: ");
	    int num = scanner.nextInt();

	     if (num < 0) {
	     System.out.println("N�mero inv�lido. Por favor, insira um n�mero natural.");
	     } else {
	     long fatorial = 1;

	     for (int i = 1; i <= num; i++) {
	         fatorial *= i;
	       }

	     System.out.println(num + "! = " + fatorial);
	     }

	}

}
