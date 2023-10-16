package pratica01;
import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		// Novo salário
		Scanner input = new Scanner(System.in);
		double salario,salarioNovo;
		
		System.out.println("Digite seu salário: ");
		salario = input.nextDouble();
		
		salarioNovo = salario * 0.25 + salario;
		System.out.println("Seu novo salário será: " + salarioNovo);
	}

}
