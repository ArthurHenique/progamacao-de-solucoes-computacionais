package pratica01;
import java.util.Scanner;
public class Quest�oo10 {

	public static void main(String[] args) {
		// Calculo esfera
		Scanner input =new Scanner(System.in);
		double ce, ae, ve, raio;
		
		System.out.println("Digite o raio da esfera: ");
		raio = input.nextDouble();
		
		ce = 2 * Math.PI * raio;
		ae = Math.PI * Math.pow(raio, 2);
		ve =  (4.0/3.0) * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O comprimento da esfera ser�: " + ce);
		System.out.println("A �rea da esfera ser�: " + ae);
		System.out.println("O Volume da esfera ser�: " + ve);

	}

}
