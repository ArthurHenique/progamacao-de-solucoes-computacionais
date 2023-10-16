package pratica01;
import java.util.Scanner;
public class Questão6 {

	public static void main(String[] args) {
		// Temperatura em Fahrenheit
		Scanner input = new Scanner(System.in);
		
		double celsius,fahrenheit;
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = input.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

	}

}
