package pratica05;
import java.util.Scanner;
public class Questão6 {

	public static void main(String[] args) {
		// Idade 
		Scanner scanner = new Scanner(System.in);
		int totalPessoas = 10;
		int somaIdades = 0;
		
		for(int i = 1 ; i <= totalPessoas; i++){
			System.out.println("Informe a idade da pessoa" + i + ":");
			int idade = scanner.nextInt();
			somaIdades += idade;
		}
		
		double mediaIdades = (double) somaIdades / totalPessoas;
		
		System.out.println("A média das idades informadas é: " + mediaIdades);
	}

}
