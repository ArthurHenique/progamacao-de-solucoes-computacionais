package pratica03;
import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a matrícula do aluno (ou uma matrícula negativa para sair):");
		int matricula = scanner.nextInt();
		
		while(matricula >= 0) {
			System.out.println("Informe as três notas do aluno: ");
			double nota1 = scanner.nextDouble();
			double nota2 = scanner.nextDouble();
			double nota3 = scanner.nextDouble();
			
			double media =(nota1 + nota2 + nota3) / 3;
			
			if (media >=70 ) {
				System.out.println("Aluno com matrícula " + matricula + " foi aprovado");
			} else if (media >= 60) {
				System.out.println("Aluno com matrícula " + matricula + " está em recuperação");
			} else {
				System.out.println("Aluno com matrícula " + matricula + " foi reprovado");
			}
			System.out.println("Informe a matrícula do próximo aluno (ou uma matrícula negativa para sair):"); 
			matricula = scanner.nextInt(); }
	        scanner.close();
			}
	}
