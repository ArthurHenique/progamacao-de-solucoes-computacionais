package pratica01;
import java.util.Scanner;
public class Quest�o3 {

	public static void main(String[] args) {
		//Convess�o dolar para real.
		Scanner input = new Scanner(System.in);
		
		double dolar, reais,converss�o;
		
		System.out.println("Digite quantidade em dolares para converss�o");
		dolar = input.nextInt();
		
		converss�o = dolar * 4.88;
		System.out.println("Voc� possui R$ " + converss�o + " em reais!");
		
		
	}

}
