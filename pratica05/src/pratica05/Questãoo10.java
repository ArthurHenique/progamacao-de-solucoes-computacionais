package pratica05;
import java.util.Scanner;
public class Questãoo10 {

	public static void main(String[] args) {
		// Sexo idade
		Scanner scanner = new Scanner(System.in);
		int contadorFemininoEntre20e40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            System.out.println("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);

            if (idade >= 20 && idade <= 40 && sexo == 'F' || sexo == 'f') {
                contadorFemininoEntre20e40++;
            }
    }
        System.out.println("Quantidade de pessoas do sexo feminino entre 20 e 40 anos: " + contadorFemininoEntre20e40);
  }
}