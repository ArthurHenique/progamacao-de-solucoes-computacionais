package pratica02;
import java.util.Scanner;
public class Quest�oo11 {

	public static void main(String[] args) {
		// Diarias
		Scanner input = new Scanner(System.in);
		int dias,quantidade;
		double valor,taxaServi�os,totalAPagar;
		
		System.out.println("Quantos dias: ");
		dias = input.nextInt();
		
		valor = 500.00;
		
		if (dias < 15 ) {taxaServi�os = 15 * dias;}
		else if (dias == 15 ) {taxaServi�os = 10 * dias;}
		else {taxaServi�os = 5 * dias;}
		
		totalAPagar = valor * dias + taxaServi�os;
		
		System.out.println("N�mero de di�ria: " + dias);
		System.out.println("Total a ser pago: R$ " + totalAPagar);
		
	}

}
