package pratica03;
import java.util.Scanner;
public class Quest�o3 {

	public static void main(String[] args) {
		// Audi�ncia
		Scanner scanner = new Scanner(System.in);
		 int canal;
		 int totalAudienciaTotal = 0;
		 int [] audienciaPorCanal = new int [13];
		 
		     System.out.println("Informe o n�mero do canal (2, 4, 5, 7, 12) e o n�mero de pessoas assistindo (ou 0 para encerrar):");
		 
		 while(true) {
			 System.out.println("N�mero do canal (ou 0 para encerrar): ");
			 canal = scanner.nextInt();
			 
			 if (canal ==0) {break;}
			 
			 if (canal >= 2 && canal <= 12) {
			 System.out.println("N�mero de pessoas assistindo: ");
			 int audiencia = scanner.nextInt();
			
	         audienciaPorCanal[canal] += audiencia; 
	         totalAudienciaTotal += audiencia;
			 } else {
			 System.out.println("Canal inv�lido. Informe um canal v�lido (2, 4, 5, 7, 12)."); } 
			 }
			 
		     System.out.println("Percentual de audi�ncia por canal:"); 
		     for (int i = 2; i <= 12; i++) {
			 if (audienciaPorCanal[i] > 0) {
			 double percentual = (double)audienciaPorCanal[i] / totalAudienciaTotal * 100;
			 System.out.println("Canal "+ i + ": " + percentual + "%"); } }
		     
		     scanner.close();
			 }
		 }
		
