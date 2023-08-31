package exemplogit;
import java.util.Scanner;

public class Calculadoradeanos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 1) Média aritmética de três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);

     // 2) Idade da pessoa em diferentes anos
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        System.out.println("Idade no ano atual: " + idadeAtual);
        System.out.println("Idade em 2050: " + idade2050);

        // ... (Continue com os outros itens)

        scanner.close();
	}

}
