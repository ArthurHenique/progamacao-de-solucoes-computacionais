package pratica02;
import java.util.Scanner;
public class Questão8 {

	public static void main(String[] args) {
		// Produtos
		Scanner input = new Scanner(System.in);
		int codigo;
		double preço;
		
		System.out.println("Infome o código(1 a 5): ");
		codigo = input.nextInt();

		preço = 0.0;
		
		switch (codigo){
		case 1 : preço = 99.99; 
		System.out.println("Produto: Sapato"); break; 
		case 2: preço = 103.89; 
		System.out.println("Produto: Bolsa"); break; 
		case 3: preço = 49.98; 
		System.out.println("Produto: Camisa"); break; 
		case 4: preço = 89.72; 
		System.out.println("Produto: Calça"); break; 
		case 5: preço = 97.35; 
		System.out.println("Produto: Blusa"); break; 
		default: 
		System.out.println("Código de produto inválido."); break; }
		 
		if (preço > 0) { System.out.println("Preço: R$ " + preço);} 

	}

}
