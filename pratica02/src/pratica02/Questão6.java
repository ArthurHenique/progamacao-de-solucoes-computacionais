package pratica02;
import java.util.Scanner;
public class Quest�o6 {

	public static void main(String[] args) {
		// X,Y,Z
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Informe o primeiro lado em cm: ");
	    double a = scanner.nextDouble();

	    System.out.print("Informe o segundo lado em cm: ");
	    double b = scanner.nextDouble();

	    System.out.print("Informe o terceiro lado em cm: ");
	    double c = scanner.nextDouble();

	    scanner.close();

	    boolean condicao1 = Math.abs(b - c) < a && a < b + c;
	    boolean condicao2 = Math.abs(a - c) < b && b < a + c;
	    boolean condicao3 = Math.abs(a - b) < c && c < a + b;

	    if (condicao1 && condicao2 && condicao3) {
	    System.out.println("Os tr�s valores informados podem ser os comprimentos dos lados de um tri�ngulo.");
	    } else {
	    System.out.println("Os tr�s valores informados N�O podem ser os comprimentos dos lados de um tri�ngulo.");
	        }

	}

}
