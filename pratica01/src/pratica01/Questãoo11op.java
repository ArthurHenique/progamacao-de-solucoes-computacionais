package pratica01;
import javax.swing.JOptionPane;
public class Quest�oo11op {

	public static void main(String[] args) {
		String entrada;
		int resultado,numero;
		
		entrada = JOptionPane.showInputDialog("Digite o numero da mutiplica��o: ");
		numero = Integer.parseInt(entrada);
		
		for (int i = 1; i <= 10; i++) {
		resultado = numero * i;
		
		JOptionPane.showMessageDialog(null, numero + " x " + i + " = " + resultado);

	}
		System.exit(0);
	}	
}
