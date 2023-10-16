package pratica01;
import javax.swing.JOptionPane;
public class Questão3op {

	public static void main(String[] args) {
		String entrada;
		double dolar,converssão;
		
		entrada = JOptionPane.showInputDialog("Digite a quantidade em dolares que deseja converter");
		dolar = Integer.parseInt(entrada);
		
		converssão = dolar * 4.88;
		JOptionPane.showMessageDialog(null,"Você tem R$ " + converssão + " em reais!");
		System.exit(0);
	}

}
