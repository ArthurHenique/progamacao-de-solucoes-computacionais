package pratica01;
import javax.swing.JOptionPane;
public class Questão6op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		double celsius,fahrenheit;
		
		entrada = JOptionPane.showInputDialog("Digite a temperatura em celsius: ");
		celsius = Integer.parseInt(entrada);
		
		fahrenheit = (celsius * 1.8) + 32;
	    JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é: " + fahrenheit);
		System.exit(0);
		
	}

}
