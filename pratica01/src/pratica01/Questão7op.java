package pratica01;
import javax.swing.JOptionPane;
public class Quest�o7op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		int valorSalarioMinimo,salarioFuncionario,quantidadeSalariosMinimos;
		
		entrada = JOptionPane.showInputDialog("Digite o valor do sal�rio m�nimo");
		valorSalarioMinimo = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio: ");
		salarioFuncionario = Integer.parseInt(entrada);
		
		quantidadeSalariosMinimos = salarioFuncionario / valorSalarioMinimo;
		JOptionPane.showMessageDialog(null,"O funcion�rio recebe " + quantidadeSalariosMinimos + "� sal�rios m�nimos!");
		
		
	}

}
