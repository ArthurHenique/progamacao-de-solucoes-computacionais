package pratica01;
import javax.swing.JOptionPane;
public class Questão2op {

	public static void main(String[] args) {
		String entrada;
		int anoAtual,anoNascimento,idadeAtual,idade2050;
		
		entrada=JOptionPane.showInputDialog("Digite o ano nascimento: ");
        anoNascimento = Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Digite o ano atual: ");
        anoAtual = Integer.parseInt(entrada);
        
        idadeAtual = anoAtual - anoNascimento;
        idade2050 = 2050 - anoNascimento;
        
        String mensagem = "Idade no ano atual: " + idadeAtual + "\nIdade em 2050: " + idade2050;
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);

        
	}

}
