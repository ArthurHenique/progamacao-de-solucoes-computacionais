package pratica01;
import java.util.Scanner;
public class Questão1 {

	public static void main(String[] args) {
		// Media de três notas
        Scanner input = new Scanner(System.in);
        
       double num1, num2, num3, media;
       
       System.out.println("Informe o 1° numero:");
       num1 = input.nextInt();
       System.out.println("Informe o 2° numero:");
       num2 = input.nextInt();
       System.out.println("Informe o 3° numero:");
       num3 = input.nextInt();
       
       media = (num1 + num2 + num3)/3;
       System.out.println("A media é: " + media);
	}

}
