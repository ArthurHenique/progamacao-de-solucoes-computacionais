package pratica02;

import java.util.Scanner;

public class Quest�o2 {

	public static void main(String[] args) {
		// Tri�ngulo
		 Scanner input = new Scanner(System.in);
		    
			System.out.println("Digite os lados do tri�ngulo: ");
			
			double l1, l2, l3;
			l1 = input.nextDouble();
			l2 = input.nextDouble();
			l3 = input.nextDouble();
				
			if (l1 == l2 && l2 == l3)
			System.out.println("Equil�tero");
				
			else if (l1 == l2 || l1 == l3 || l2 == l3)
			System.out.println("Is�sceles");
				
			else
			System.out.println("Escaleno");
	}

}
