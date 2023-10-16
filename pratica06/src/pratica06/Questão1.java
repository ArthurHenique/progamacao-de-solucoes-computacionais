package pratica06;
import java.util.Scanner;
public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int[] vetor = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "° número inteiros: ");
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
		
		int somaPares = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				somaPares += vetor[i];
			}
		}
		
		System.out.println("Soma dos pares: " + somaPares);
		
		scanner.close();
	}

}
