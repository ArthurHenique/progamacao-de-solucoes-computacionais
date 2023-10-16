package pratica02;
import java.util.Scanner;
public class Quest�oo12 {

	public static void main(String[] args) {
		// Academia
		Scanner scanner = new Scanner(System.in);
		 
		  System.out.println("Digite a idade do cliente:"); 
		  int idade = scanner.nextInt();
		  
		  System.out.println("Digite o sexo do cliente (M para masculino, F para feminino):");
		  char sexo = scanner.next().charAt(0);
		  
		  double mensalidade = 0.0;
		  
		  if (sexo == 'M' || sexo == 'm') { 
			  if (idade <= 15) { mensalidade = 60.00; }
			  else if (idade >= 16 && idade <= 18) { mensalidade = 75.00; } 
			  else if (idade >= 19 && idade <= 30) { mensalidade = 90.00; } 
			  else if (idade >= 31 && idade <= 40) { mensalidade = 85.00; } 
			  else { mensalidade = 80.00; } } 
		  else if (sexo == 'F' || sexo == 'f') { 
			  if (idade <= 18) { mensalidade = 60.00; } 
			  else if (idade >= 19 && idade <= 25) { mensalidade = 90.00; } 
			  else if (idade >= 26 && idade <= 40) { mensalidade = 85.00; } 
			  else { mensalidade = 80.00; } } 
		  else {
		  System.out.println("Sexo inv�lido."); scanner.close(); 
		  return; }
		  
		  System.out.println("Idade do cliente: " + idade + " anos");
		  System.out.println("Sexo do cliente: " + (sexo == 'M' || sexo == 'm' ?
		  "Masculino" : "Feminino")); System.out.println("Mensalidade a ser paga: R$ " + mensalidade);
		   scanner.close();
		}
	}
