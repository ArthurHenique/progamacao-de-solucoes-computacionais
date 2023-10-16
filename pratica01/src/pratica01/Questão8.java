package pratica01;
import java.util.Scanner;
public class Questão8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pesoAtual,pesoEngordar,pesoEmagrecer;
		
		System.out.println("Digite seu peso atual: ");
		pesoAtual = input.nextDouble();
		
		pesoEngordar = pesoAtual + (pesoAtual * 0.15);
		pesoEmagrecer = pesoAtual - (pesoAtual * 0.20);
		
		System.out.println("Seu peso caso engordar será " + pesoEngordar + "kg.Se emagrecer será " + pesoEmagrecer + "kg.");

	}

}
