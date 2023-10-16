package pratica01;
import java.util.Scanner;
public class Questão7 {

	public static void main(String[] args) {
		// Qauntidade salários
		Scanner input = new Scanner(System.in);
		int valorSalarioMinimo, salarioFuncionario,quantidadeSalariosMinimos;
		
		System.out.println("Digite o valor do salário mínimo: ");
		valorSalarioMinimo = input.nextInt();
		
		System.out.println("Digite o valor do salário do funcionário: ");
		salarioFuncionario = input.nextInt();
		
		quantidadeSalariosMinimos = salarioFuncionario / valorSalarioMinimo;
		System.out.println("O Funcionários recebe " + quantidadeSalariosMinimos + "° salários mínimos!");

	}

}
