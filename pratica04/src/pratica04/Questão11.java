package pratica04;
import javax.swing.JOptionPane;
public class Quest�o11 {

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
		int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if (resp == JOptionPane.YES_OPTION)
		entrada = "sim";
		else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
		entrada = "n�o";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);

	}

}
