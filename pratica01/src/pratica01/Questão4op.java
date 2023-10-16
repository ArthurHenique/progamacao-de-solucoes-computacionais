package pratica01;
import javax.swing.JOptionPane;
public class Questão4op {

	public static void main(String[] args) {
		String entrada;
		double salario, salarioNovo;
		
		entrada = JOptionPane.showInputDialog("Digite seu salário: ");
		salario = Integer.parseInt(entrada);
		
		salarioNovo = salario * 0.25 + salario;
		JOptionPane.showMessageDialog(null,"Seu novo salário será: "  + salarioNovo);

	}

}
