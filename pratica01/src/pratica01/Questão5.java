package pratica01;
import java.util.Scanner;
public class Quest�o5 {

	public static void main(String[] args) {
		// �rea do losango
		Scanner input = new Scanner(System.in);
		double l1, l2, area;
				
		System.out.println("Digite o maior diagonal do losango: ");
		l1 = input.nextDouble();
				
		System.out.println("Digite o menor diagonal do losango: ");
		l2 = input.nextDouble();
				
		area = (l1 * l2) /2;
		System.out.println("A �rea do losando �: " + area);

	}

}
