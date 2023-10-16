package pratica05;
import java.util.Scanner;
public class Questãoo11 {

	public static void main(String[] args) {
		// Peso 
		Scanner scanner = new Scanner(System.in);
		
		int contadorMasculinoEntre60e80 = 0;
		int contadorFemininoEntre50e70 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe peso da pessoa " + i + ":");
            double peso = scanner.nextInt();

            System.out.println("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);

            if (peso >= 60 && peso <= 80 && sexo == 'M' || sexo == 'm') {
                contadorMasculinoEntre60e80++;
            }
            if (peso >= 50 && peso <= 70 && sexo == 'F' || sexo == 'f') {
                     contadorFemininoEntre50e70++;                	
            }
    }
        System.out.println("Quantidade de pessoas do sexo feminino entre 50 e 70 anos: " + contadorFemininoEntre50e70);
        System.out.println("Quantidade de pessoas do sexo Masculino entre 60 e 80 anos: " + contadorMasculinoEntre60e80);

	}

}
