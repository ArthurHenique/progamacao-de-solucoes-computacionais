package pratica01;
import java.util.Scanner;
public class Quest�o7 {

	public static void main(String[] args) {
		// Qauntidade sal�rios
		Scanner input = new Scanner(System.in);
		int valorSalarioMinimo, salarioFuncionario,quantidadeSalariosMinimos;
		
		System.out.println("Digite o valor do sal�rio m�nimo: ");
		valorSalarioMinimo = input.nextInt();
		
		System.out.println("Digite o valor do sal�rio do funcion�rio: ");
		salarioFuncionario = input.nextInt();
		
		quantidadeSalariosMinimos = salarioFuncionario / valorSalarioMinimo;
		System.out.println("O Funcion�rios recebe " + quantidadeSalariosMinimos + "� sal�rios m�nimos!");

	}

}
