package pratica04;
import java.util.Scanner;
public class Quest�o2 {

	public static void main(String[] args) {
		// valida��o de nota, sal�rio, sexo e idade)
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
		System.out.print("Informe o sal�rio (maior que zero): ");
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
