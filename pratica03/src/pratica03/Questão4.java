package pratica03;
import java.util.Scanner;
public class Quest�o4 {

	public static void main(String[] args) {
		// Prefeitura
		Scanner scanner = new Scanner(System.in);
		int habitantes = 0;
		double somaSalarios = 0.0;
		int somaFilhos = 0 ;
		
		System.out.println("Digite o sal�rio (ou um sal�rio negativo para encerrar):");
		double salario = scanner.nextDouble();
		
		while(salario >= 0) {
			System.out.println("Digite o n�mero de filhos: ");
			int numFilhos = scanner.nextInt();
			
			somaSalarios += salario;
			somaFilhos +=  numFilhos;
			habitantes++;
			
			System.out.println("Digite o sal�rio da pr�xima pessoa (ou um sal�rio negativo para encerrar):");
			salario = scanner.nextDouble(); }
		
		if (habitantes > 0) {
			double mediaSalario =  somaSalarios / habitantes;
			double mediaFilhos = (double) somaFilhos / habitantes;
			
			System.out.println("M�dia Salarial da Popula��o: " + mediaSalario);
			System.out.println("M�dia do N�mero de Filhos da Popula��o: " + mediaFilhos);}
		else {
			System.out.println("Nenhum dado informado."); }
		
		    scanner.close();
			
		}
	}
