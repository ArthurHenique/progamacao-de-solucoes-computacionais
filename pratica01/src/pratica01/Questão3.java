package pratica01;
import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		//Convessão dolar para real.
		Scanner input = new Scanner(System.in);
		
		double dolar, reais,converssão;
		
		System.out.println("Digite quantidade em dolares para converssão");
		dolar = input.nextInt();
		
		converssão = dolar * 4.88;
		System.out.println("Você possui R$ " + converssão + " em reais!");
		
		
	}

}
