package pratica02;
import java.util.Scanner;
public class Questãoo11 {

	public static void main(String[] args) {
		// Diarias
		Scanner input = new Scanner(System.in);
		int dias,quantidade;
		double valor,taxaServiços,totalAPagar;
		
		System.out.println("Quantos dias: ");
		dias = input.nextInt();
		
		valor = 500.00;
		
		if (dias < 15 ) {taxaServiços = 15 * dias;}
		else if (dias == 15 ) {taxaServiços = 10 * dias;}
		else {taxaServiços = 5 * dias;}
		
		totalAPagar = valor * dias + taxaServiços;
		
		System.out.println("Número de diária: " + dias);
		System.out.println("Total a ser pago: R$ " + totalAPagar);
		
	}

}
