package pratica09POO2;
import java.util.Scanner;
public class Main {
	public static void main(String Args[]) {
        Retangulo ret = new Retangulo();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a altura do ret�ngulo: ");
        ret.setAltura(input.nextFloat());
        System.out.print("Informe a largura do ret�ngulo: ");
        ret.setLargura(input.nextFloat());

        System.out.println("Informa��es do ret�ngulo:");
        ret.exibe();
    }

}
