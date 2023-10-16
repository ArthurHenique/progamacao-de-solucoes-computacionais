package pratica02;
import java.util.Scanner;
public class Questão9 {

	public static void main(String[] args) {
		// Planeta
		Scanner input =new Scanner(System.in);
		int escolhaPlaneta;
		double gravidade,v0,t,vT;
		String nomePlaneta;
		
		System.out.println("Selecione um planeta: ");
		System.out.println("1_Mercúrio");
		System.out.println("2_Venus");
		System.out.println("3_Terra");
		System.out.println("4_Marte");
		System.out.println("5_Jupiter");
		System.out.println("6_Saturno");
		System.out.println("7_Urano");
		System.out.println("8_Netuno");
		System.out.println("9_Plutão");
		escolhaPlaneta = input.nextInt();
		
		switch (escolhaPlaneta) { case 1 : gravidade = 3.7 ; nomePlaneta = "Mercúrio";break;
		case 2 : gravidade = 8.8 ; nomePlaneta = "Vênus";break;
		case 3 : gravidade = 9.8 ; nomePlaneta = "Terra";break;
		case 4 : gravidade = 3.8 ; nomePlaneta = "Marte";break;
		case 5 : gravidade = 26.4 ; nomePlaneta = "Júpiter";break;
		case 6 : gravidade = 11.5 ; nomePlaneta = "Saturno";break;
		case 7 : gravidade = 9.3 ; nomePlaneta = "Urano";break;
		case 8 : gravidade = 12.2 ; nomePlaneta = "Netuno";break;
		case 9 : gravidade = 0.6 ; nomePlaneta = "Plutão";break;
		default : System.out.println("Planeta escolhido inválido."); 
		input.close();return;
		}
		
		System.out.println("Informe a velocidade inicial (v0 em m/s):");
		v0 = input.nextDouble();
		
		System.out.println("Informe o instante de tempo (t em segundos):"); 
		t = input.nextDouble();
		 
		vT = v0 - gravidade * t; double hT = v0 * t - 0.5 * gravidade * t * t;
		
		System.out.println("Planeta escolhido: " + nomePlaneta);
		System.out.println("Velocidade v(" + t + "): " + vT + " m/s");
		System.out.println("Altura h(" + t + "): " + hT + " metros");
		input.close();
		
	}

}
