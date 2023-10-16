package pratica06;
import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double vetor[] = new double[10];
		
		for(int i = 0; i < 10; i++) {
		System.out.print("Digite os numeros reais " + (i + 1) + "°: ");
		vetor[i] = scanner.nextInt(); 
		}
		System.out.print("Vetor: [");
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]);
			if ( i < vetor.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		System.out.print("Posições dos números negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        scanner.close();
	}

}
