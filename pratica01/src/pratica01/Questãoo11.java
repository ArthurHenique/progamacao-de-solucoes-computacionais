package pratica01;
import java.util.Scanner;
public class Quest�oo11 {

	public static void main(String[] args) {
		// Calculadora
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Digite um n�mero para calcular a tabuada de multiplica��o: ");
	     int numero = scanner.nextInt();

	     System.out.println("Tabuada de multiplica��o para " + numero + ":");

	      for (int i = 1; i <= 10; i++) {
	      int resultado = numero * i;
	      System.out.println(numero + " x " + i + " = " + resultado);
	}
	   
    }
}  

