package pratica01;
import javax.swing.JOptionPane;
public class Questão9op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		double c1,c2,hipotenusa;
		
		entrada = JOptionPane.showInputDialog("Digite o primeiro cateto do triângulo: ");
		c1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o primeiro cateto do triângulo: ");
		c2 = Integer.parseInt(entrada);
		
		hipotenusa = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
		JOptionPane.showMessageDialog(null,"A hipotenusa do triangulo é: " + hipotenusa);
	}

}
