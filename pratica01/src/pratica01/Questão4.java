package pratica01;
import java.util.Scanner;
public class Quest�o4 {

	public static void main(String[] args) {
		// Novo sal�rio
		Scanner input = new Scanner(System.in);
		double salario,salarioNovo;
		
		System.out.println("Digite seu sal�rio: ");
		salario = input.nextDouble();
		
		salarioNovo = salario * 0.25 + salario;
		System.out.println("Seu novo sal�rio ser�: " + salarioNovo);
	}

}
