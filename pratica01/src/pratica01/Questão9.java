package pratica01;
import java.util.Scanner;
public class Questão9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double c1,c2,hipotenusa;
		
		System.out.println("Digite o primeiro cateto do triângulo: ");
		c1 = input.nextDouble();
		
		System.out.println("Digite o segundo cateto do triângulo: ");
		c2 = input.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
		System.out.println("A hipotenusa será: " + hipotenusa);
		
		

	}

}
