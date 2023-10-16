package pratica01;
import javax.swing.JOptionPane;
public class Questãoo10op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		double ce, ae ,ve, raio;
		
		entrada=JOptionPane.showInputDialog("Digite o raio da esfera: ");
		raio = Integer.parseInt(entrada);
		
		ce = 2 * Math.PI * raio;
		ae = Math.PI * Math.pow(raio, 2);
		ve =  (4.0/3.0) * Math.PI * Math.pow(raio, 3);
		
		JOptionPane.showMessageDialog(null, "O comprimento da esfera será: " + ce);
		JOptionPane.showMessageDialog(null, "A área da esfera será: " + ae);
		JOptionPane.showMessageDialog(null, "O Volume da esfera será: " + ve);

	}

}
