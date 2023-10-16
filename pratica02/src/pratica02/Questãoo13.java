package pratica02;
import java.util.Scanner;
public class Questãoo13 {

	public static void main(String[] args) {
		// Apto
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantos dias foram usados: ");
		int dias = scanner.nextInt();
		
		System.out.println("Digite o tipo de apartamento(Simples'S' ou Duplo'D': ");
		char tipoApto = scanner.next().charAt(0); 
		
		double valorTotal = 0.0;
		
		if (tipoApto == 'S' || tipoApto == 's') {
			if (dias < 10) { valorTotal = 100.00;}
			else if (dias >= 10 && dias <= 15) {valorTotal = 90.00;}
			else { valorTotal = 80.00;} }
		else if (tipoApto == 'D' || tipoApto == 'd') {
			if (dias < 10) {valorTotal = 140.00;}
			else if (dias >= 10 && dias <= 15) {valorTotal = 120.00;}
			else {valorTotal = 100.00;} }
		else {
			System.out.println("Apto inválido.");scanner.close();
			return;}
		
		double aPagar = valorTotal * dias;
		
			System.out.println("Apartamento alugado pelo cliente: " + tipoApto);
			System.out.println("Números de dias alugados: " + dias);
			System.out.println("Valor a ser pago: " + aPagar);
			
			scanner.close();
	}

}
