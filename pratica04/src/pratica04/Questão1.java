package pratica04;
import javax.swing.JOptionPane;
public class Quest�o1 {

	public static void main(String[] args) {
		String entrada;
		int numero1, numero2, soma;
		do {
		entrada = JOptionPane.showInputDialog("Informe o primeiro n�mero: ");
		numero1 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Informe o segundo n�mero: ");
		numero2 = Integer.parseInt(entrada);
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "A soma �: " + soma);
		entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)�o");
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);

	}

}
