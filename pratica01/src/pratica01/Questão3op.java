package pratica01;
import javax.swing.JOptionPane;
public class Quest�o3op {

	public static void main(String[] args) {
		String entrada;
		double dolar,converss�o;
		
		entrada = JOptionPane.showInputDialog("Digite a quantidade em dolares que deseja converter");
		dolar = Integer.parseInt(entrada);
		
		converss�o = dolar * 4.88;
		JOptionPane.showMessageDialog(null,"Voc� tem R$ " + converss�o + " em reais!");
		System.exit(0);
	}

}
