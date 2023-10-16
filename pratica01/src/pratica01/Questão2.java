package pratica01;
import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
		// Calculo de Idade
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
 
        System.out.println("Digite o ano atual: ");
        int anoAtual = input.nextInt();
        
       int idadeAtual = anoAtual - anoNascimento;
       int idade2050 = 2050 - anoNascimento;
       
       System.out.println("Idade no ano atual: " + idadeAtual);
       System.out.println("Idade em 2050: " + idade2050);
	}

}
