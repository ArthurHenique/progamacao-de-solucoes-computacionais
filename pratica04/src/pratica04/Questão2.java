package pratica04;
import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
		// validação de nota, salário, sexo e idade)
		Scanner scanner = new Scanner(System.in);
		double nota;
		double salario;
		char sexo;
		int idade;
		
	do {
		System.out.print("Informe a nota (entre 0 e 10): ");
		nota = scanner.nextDouble();
	}while (nota < 0 || nota > 10);
		
	do {
		System.out.print("Informe o salário (maior que zero): ");
		salario = scanner.nextDouble();
	}while (salario <= 0);
	
	do {
		System.out.print("Informe o sexo (m ou f): ");
		sexo = scanner.next().charAt(0);
	}while (sexo != 'm' && sexo != 'f');
	
	do {
		System.out.print("Informe a idade (entre 0 e 120): ");
		idade = scanner.nextInt();
	}while (idade < 0 || idade > 120);
	
	    System.out.println("Dados informados com sucesso!");
	
	}

}
