package pratica05;
import java.util.Scanner;
public class Quest�o4 {

	public static void main(String[] args) {
		// Media idades
		Scanner scanner = new Scanner(System.in);
		
		int idade, soma = 0, contador = 0;
		
		System.out.println("Informe as idades(digite negativo para encerrar):");
		
		while(true){
			idade = scanner.nextInt();
			
			if(idade < 0) {
				break;
			}
			soma += idade;
			contador++;
		}
		
		if(contador > 0) {
			double media = (double) soma / contador;
			System.out.println("A m�dia das idades �: " + media);
		}else {
			System.out.println("Nenhuma idade informada.");
		}

	}

}
