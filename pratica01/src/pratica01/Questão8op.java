package pratica01;
import javax.swing.JOptionPane;
public class Questão8op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		double pesoAtual,pesoEngordar,pesoEmagrecer;
		
		entrada = JOptionPane.showInputDialog("Digite seu peso atual: ");
		pesoAtual = Integer.parseInt(entrada);
		
		pesoEngordar = pesoAtual + (pesoAtual * 0.15);
		pesoEmagrecer = pesoAtual - (pesoAtual * 0.20);
		JOptionPane.showMessageDialog(null," Seu peso se emagrecer será " + pesoEmagrecer + "kg. Se engordar será " + pesoEngordar + "kg." );
		System.exit(0);

	}

}
