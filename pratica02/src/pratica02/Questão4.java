package pratica02;
import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		// IMC
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o peso (em kg): ");
	        double peso = scanner.nextDouble();

	        System.out.println("Digite a altura (em metros): ");
	        double altura = scanner.nextDouble();

	        scanner.close();

	        double imc = peso / (altura * altura);

	        String situacaoPeso;

	        if (imc < 20) {
	            situacaoPeso = "Abaixo do Peso";
	        } else if (imc >= 20 && imc < 25) {
	            situacaoPeso = "Normal";
	        } else if (imc >= 25 && imc < 30) {
	            situacaoPeso = "Sobrepeso";
	        } else if (imc >= 30 && imc < 40) {
	            situacaoPeso = "Obesidade";
	        } else {
	            situacaoPeso = "Obesidade Mórbida";
	        }

	        System.out.println("Situação de Peso: " + situacaoPeso);

	}

}
