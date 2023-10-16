package pratica02;
import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		//Media 3 notas
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = scanner.nextInt();
		    
		System.out.println("Digite a segunda nota: ");
		int nota2 = scanner.nextInt();

		System.out.println("Digite a terceira nota: ");
		int nota3 = scanner.nextInt();
		
		double media = (nota1 + nota2 + nota3) /3;
		
		scanner.close();
		
	    if (media >= 0 && media < 3) {
	          System.out.println("REPROVADO");
	    } else if (media >= 3 && media < 7) {
	          System.out.println("EXAME");
	    } else if (media >= 7 && media <= 10) {
	          System.out.println("APROVADO");
	    } else {
	          System.out.println("Média fora do intervalo válido (0 a 10)");

	      }

	}

}
