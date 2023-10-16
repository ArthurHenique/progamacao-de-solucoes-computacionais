package pratica02;
import java.util.Scanner;
public class Questãoo10 {

	public static void main(String[] args) {
		// Dois numeros
		Scanner input = new Scanner(System.in);
		int num1, num2,escolha;
		double resultado;
		
		
		System.out.println("Digite primeiro número: ");
		num1 = input.nextInt();
		System.out.println("Digite segundo número: ");
		num2 = input.nextInt();
		
		System.out.println("Escolha a operação:");
		System.out.println("1 - Somar os dois números");
		System.out.println("2 - Multiplicar os dois números");
		System.out.println("3 - Subtrair o número maior pelo número menor");
		System.out.println("4 - Dividir o primeiro número pelo segundo");
		escolha = input.nextInt();
		
		switch (escolha) {
		case 1 : resultado = num1 + num2; 
		System.out.println("Resultado da soma: " + resultado);break;
		case 2 : resultado = num1 * num2; 
		System.out.println("Resultado da mutiplicação: " + resultado);break;
		case 3 : if (num1 == num2) { resultado = 0.0;} 
		else if (num1 > num2) {resultado = num1 - num2;} 
		else {resultado = num2 - num1;}
		System.out.println("Resultado da subtração: " + resultado); break;
		case 4 : if (num2 != 0) {resultado = num1 / num2;
		System.out.println("Resultado da divisão: " + resultado); } else {
		System.out.println("Erro: Divisão por zero não permitida."); } break;
		default: System.out.println("Opção inválida."); break; }
		input.close();

		}
	}
