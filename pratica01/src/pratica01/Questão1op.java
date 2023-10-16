package pratica01;
import javax.swing.JOptionPane;
public class Questão1op {

	public static void main(String[] args) {
        String entrada;
        double num1,num2,num3,media;
        
        entrada=JOptionPane.showInputDialog("Digite o Número");
        num1 = Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Digite o Número");
        num2 = Integer.parseInt(entrada);		
        
        entrada=JOptionPane.showInputDialog("Digite o Número");
        num3 = Integer.parseInt(entrada);		
        
        media= (num1+num2+num3)/3;
        JOptionPane.showMessageDialog(null,"A somo é: "+ media);
        System.exit(0);
	}

}
