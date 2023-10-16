package pratica08;
import java.util.Scanner;
public class Quest�o2 {
	
	public static void main(String[] args) {
		// Soma produtos
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos pre�os de produtos voc� deseja somar? ");
		int quantidadePrecos = scanner.nextInt();

		double total = somarPrecos(quantidadePrecos);

		System.out.println("Total dos pre�os: R$ " + total);

		scanner.close();
	}

	public static double somarPrecos(int quantidadePrecos) {
		Scanner scanner = new Scanner(System.in);
		double total = 0.0;

		for (int i = 1; i <= quantidadePrecos; i++) {
			System.out.print("Informe o pre�o do produto #" + i + ": R$ ");
			double preco = scanner.nextDouble();
			total += preco;
		}

		return total;

	}

}
