package pratica01;
import javax.swing.JOptionPane;
public class Quest�o5op {

	public static void main(String[] args) {
		String entrada;
		double l1, l2, area;
		
		entrada = JOptionPane.showInputDialog("Digite a maior diagonal do losango: ");
		l1 = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite a menor diagonal do losango: ");
		l2 = Integer.parseInt(entrada);
		
		area= (l1 * l2)/2;
		JOptionPane.showMessageDialog(null, "A �rea do losango �: " + area);
		System.exit(0);
		
	}

}
