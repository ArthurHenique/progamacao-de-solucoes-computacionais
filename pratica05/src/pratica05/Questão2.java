package pratica05;
import java.util.Scanner;
public class Quest�o2 {

	public static void main(String[] args) {
		// N�meros inteiros
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero positivo: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero positivo: ");
		int num2 = scanner.nextInt();
		
		if (num1 > 0 && num2 > 0){
			int limiteInferior = Math.min(num1, num2);
			int limiteSuperior = Math.max(num1, num2);
			
		System.out.println("N�meros inteiros entre " + limiteInferior + " e " + limiteSuperior + ":");
		
		 for (int i = limiteInferior; i <= limiteSuperior; i++) {
			 System.out.print(i + " ");
		 }
		}else {
            System.out.println("Por favor, informe n�meros inteiros positivos.");
		}

	}

}
