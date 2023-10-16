package pratica03;
import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		// Audiência
		Scanner scanner = new Scanner(System.in);
		 int canal;
		 int totalAudienciaTotal = 0;
		 int [] audienciaPorCanal = new int [13];
		 
		     System.out.println("Informe o número do canal (2, 4, 5, 7, 12) e o número de pessoas assistindo (ou 0 para encerrar):");
		 
		 while(true) {
			 System.out.println("Número do canal (ou 0 para encerrar): ");
			 canal = scanner.nextInt();
			 
			 if (canal ==0) {break;}
			 
			 if (canal >= 2 && canal <= 12) {
			 System.out.println("Número de pessoas assistindo: ");
			 int audiencia = scanner.nextInt();
			
	         audienciaPorCanal[canal] += audiencia; 
	         totalAudienciaTotal += audiencia;
			 } else {
			 System.out.println("Canal inválido. Informe um canal válido (2, 4, 5, 7, 12)."); } 
			 }
			 
		     System.out.println("Percentual de audiência por canal:"); 
		     for (int i = 2; i <= 12; i++) {
			 if (audienciaPorCanal[i] > 0) {
			 double percentual = (double)audienciaPorCanal[i] / totalAudienciaTotal * 100;
			 System.out.println("Canal "+ i + ": " + percentual + "%"); } }
		     
		     scanner.close();
			 }
		 }
		
