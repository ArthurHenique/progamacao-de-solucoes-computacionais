package pratica01;
import javax.swing.JOptionPane;
public class Quest�o1op {

	public static void main(String[] args) {
        String entrada;
        double num1,num2,num3,media;
        
        entrada=JOptionPane.showInputDialog("Digite o N�mero");
        num1 = Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Digite o N�mero");
        num2 = Integer.parseInt(entrada);		
        
        entrada=JOptionPane.showInputDialog("Digite o N�mero");
        num3 = Integer.parseInt(entrada);		
        
        media= (num1+num2+num3)/3;
        JOptionPane.showMessageDialog(null,"A somo �: "+ media);
        System.exit(0);
	}

}
