package pratica05;
import java.util.Scanner;
public class Quest�o7 {

	public static void main(String[] args) {
		// Inteiros
		 Scanner scanner = new Scanner(System.in);

	        int maior = Integer.MIN_VALUE; 
	        int menor = Integer.MAX_VALUE; 

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite um n�mero inteiro: ");
	            int numero = scanner.nextInt();

	            if (numero > maior) {
	                maior = numero;
	            }

	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        System.out.println("O maior n�mero �: " + maior);
	        System.out.println("O menor n�mero �: " + menor);

	        scanner.close();
  }
}