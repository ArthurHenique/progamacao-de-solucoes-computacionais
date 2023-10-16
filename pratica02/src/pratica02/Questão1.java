package pratica02;
import java.util.Scanner;
public class Questão1 {

	public static void main(String[] args) {
        // Aprovado ou Reprovado
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
	    int nota1 = scanner.nextInt();
	    
	    System.out.println("Digite a segunda nota: ");
	    int nota2 = scanner.nextInt();
	    
	    scanner.close();
	    
	    double media = (nota1 + nota2) / 2;
	    
	    if (media >= 7.0) {
	        System.out.println("Aprovado");
	    } else {
	        System.out.println("Reprovado");
	    }

	}

}
