package pratica06;
import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        double vetor[] = new double[10];
		
        for(int i = 0; i < 10; i++) {
        	System.out.print("Digite os numeros reais " + (i + 1) + "°: ");
        	vetor[i] = scanner.nextDouble();
        }
        System.out.print("Elementos nas posições pares: ");
        for (int i = 0; i < vetor.length; i += 2) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 2) {
                System.out.print(", ");
			}
		}
		System.out.println();
		
		scanner.close();
		
	     }
	
       }
