package pratica11POO1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome e preço do primeiro produto:");
        String nome1 = scanner.nextLine();
        double preco1 = scanner.nextDouble();
        scanner.nextLine();

        Produto produto1 = new Produto(nome1, preco1);

        System.out.println("Informe o nome e preço do segundo produto:");
        String nome2 = scanner.nextLine();
        double preco2 = scanner.nextDouble();
        scanner.nextLine(); 

        Produto produto2 = new Produto(nome2, preco2);

        System.out.println("Informe o percentual de reajuste para o primeiro produto:");
        double percentual = scanner.nextDouble();
        produto1.reajustaPreco(percentual);

        System.out.println("\nInformações do primeiro produto:");
        produto1.exibe();

        System.out.println("\nInformações do segundo produto:");
        produto2.exibe();

        System.out.println("\nÚltimo ID gerado: " + Produto.getUltimoId());

        scanner.close();
    }


}
