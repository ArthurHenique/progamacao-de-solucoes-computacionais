package pratica03;
import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		// Prefeitura
		Scanner scanner = new Scanner(System.in);
		int habitantes = 0;
		double somaSalarios = 0.0;
		int somaFilhos = 0 ;
		
		System.out.println("Digite o salário (ou um salário negativo para encerrar):");
		double salario = scanner.nextDouble();
		
		while(salario >= 0) {
			System.out.println("Digite o número de filhos: ");
			int numFilhos = scanner.nextInt();
			
			somaSalarios += salario;
			somaFilhos +=  numFilhos;
			habitantes++;
			
			System.out.println("Digite o salário da próxima pessoa (ou um salário negativo para encerrar):");
			salario = scanner.nextDouble(); }
		
		if (habitantes > 0) {
			double mediaSalario =  somaSalarios / habitantes;
			double mediaFilhos = (double) somaFilhos / habitantes;
			
			System.out.println("Média Salarial da População: " + mediaSalario);
			System.out.println("Média do Número de Filhos da População: " + mediaFilhos);}
		else {
			System.out.println("Nenhum dado informado."); }
		
		    scanner.close();
			
		}
	}
