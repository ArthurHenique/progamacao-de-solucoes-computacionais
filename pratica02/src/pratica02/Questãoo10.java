package pratica02;
import java.util.Scanner;
public class Quest�oo10 {

	public static void main(String[] args) {
		// Dois numeros
		Scanner input = new Scanner(System.in);
		int num1, num2,escolha;
		double resultado;
		
		
		System.out.println("Digite primeiro n�mero: ");
		num1 = input.nextInt();
		System.out.println("Digite segundo n�mero: ");
		num2 = input.nextInt();
		
		System.out.println("Escolha a opera��o:");
		System.out.println("1 - Somar os dois n�meros");
		System.out.println("2 - Multiplicar os dois n�meros");
		System.out.println("3 - Subtrair o n�mero maior pelo n�mero menor");
		System.out.println("4 - Dividir o primeiro n�mero pelo segundo");
		escolha = input.nextInt();
		
		switch (escolha) {
		case 1 : resultado = num1 + num2; 
		System.out.println("Resultado da soma: " + resultado);break;
		case 2 : resultado = num1 * num2; 
		System.out.println("Resultado da mutiplica��o: " + resultado);break;
		case 3 : if (num1 == num2) { resultado = 0.0;} 
		else if (num1 > num2) {resultado = num1 - num2;} 
		else {resultado = num2 - num1;}
		System.out.println("Resultado da subtra��o: " + resultado); break;
		case 4 : if (num2 != 0) {resultado = num1 / num2;
		System.out.println("Resultado da divis�o: " + resultado); } else {
		System.out.println("Erro: Divis�o por zero n�o permitida."); } break;
		default: System.out.println("Op��o inv�lida."); break; }
		input.close();

		}
	}
