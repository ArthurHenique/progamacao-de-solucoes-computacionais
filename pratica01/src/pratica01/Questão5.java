package pratica01;
import java.util.Scanner;
public class Questão5 {

	public static void main(String[] args) {
		// Área do losango
		Scanner input = new Scanner(System.in);
		double l1, l2, area;
				
		System.out.println("Digite o maior diagonal do losango: ");
		l1 = input.nextDouble();
				
		System.out.println("Digite o menor diagonal do losango: ");
		l2 = input.nextDouble();
				
		area = (l1 * l2) /2;
		System.out.println("A área do losando é: " + area);

	}

}
