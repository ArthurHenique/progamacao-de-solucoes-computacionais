package pratica01;
import javax.swing.JOptionPane;
public class Questão7op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		int valorSalarioMinimo,salarioFuncionario,quantidadeSalariosMinimos;
		
		entrada = JOptionPane.showInputDialog("Digite o valor do salário mínimo");
		valorSalarioMinimo = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o salário do funcionário: ");
		salarioFuncionario = Integer.parseInt(entrada);
		
		quantidadeSalariosMinimos = salarioFuncionario / valorSalarioMinimo;
		JOptionPane.showMessageDialog(null,"O funcionário recebe " + quantidadeSalariosMinimos + "° salários mínimos!");
		
		
	}

}
