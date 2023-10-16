package pratica05;
import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		// Fatorial
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número natural para calcular o fatorial: ");
	    int num = scanner.nextInt();

	     if (num < 0) {
	     System.out.println("Número inválido. Por favor, insira um número natural.");
	     } else {
	     long fatorial = 1;

	     for (int i = 1; i <= num; i++) {
	         fatorial *= i;
	       }

	     System.out.println(num + "! = " + fatorial);
	     }

	}

}
