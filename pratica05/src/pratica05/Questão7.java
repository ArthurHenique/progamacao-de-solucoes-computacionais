package pratica05;
import java.util.Scanner;
public class Questão7 {

	public static void main(String[] args) {
		// Inteiros
		 Scanner scanner = new Scanner(System.in);

	        int maior = Integer.MIN_VALUE; 
	        int menor = Integer.MAX_VALUE; 

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite um número inteiro: ");
	            int numero = scanner.nextInt();

	            if (numero > maior) {
	                maior = numero;
	            }

	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        System.out.println("O maior número é: " + maior);
	        System.out.println("O menor número é: " + menor);

	        scanner.close();
  }
}