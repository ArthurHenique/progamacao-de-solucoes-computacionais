package pratica02;
import java.util.Scanner;
public class Quest�o8 {

	public static void main(String[] args) {
		// Produtos
		Scanner input = new Scanner(System.in);
		int codigo;
		double pre�o;
		
		System.out.println("Infome o c�digo(1 a 5): ");
		codigo = input.nextInt();

		pre�o = 0.0;
		
		switch (codigo){
		case 1 : pre�o = 99.99; 
		System.out.println("Produto: Sapato"); break; 
		case 2: pre�o = 103.89; 
		System.out.println("Produto: Bolsa"); break; 
		case 3: pre�o = 49.98; 
		System.out.println("Produto: Camisa"); break; 
		case 4: pre�o = 89.72; 
		System.out.println("Produto: Cal�a"); break; 
		case 5: pre�o = 97.35; 
		System.out.println("Produto: Blusa"); break; 
		default: 
		System.out.println("C�digo de produto inv�lido."); break; }
		 
		if (pre�o > 0) { System.out.println("Pre�o: R$ " + pre�o);} 

	}

}
