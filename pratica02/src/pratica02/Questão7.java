package pratica02;
import java.util.Scanner;
public class Quest�o7 {

	public static void main(String[] args) {
		// equa��o segundo grau
		Scanner input = new Scanner(System.in);
		double a, b, c, delta;
		
		System.out.println("Digite o coeficiente 'a': ");
		a = input.nextDouble();
		
		System.out.println("Digite o coeficiente 'b': ");
		b = input.nextDouble();
		
		System.out.println("Digite o coeficiente 'c': ");
		c = input.nextDouble();
		
		delta = b * b - 4 * a * c;
		
		if (a == 0 && b == 0 && c == 0) {
		System.out.println("Igualdade confirmada: 0 = 0"); 
		  } 
		else if (a == 0 && b ==0) 
		{ System.out.println("Coeficientes informados incorretamente"); 
		  } 
		else if(a == 0) { 
	    System.out.println("Esta � uma equa��o de primeiro grau: x = " +(-c / b));
	    } 
	    else {
	    System.out.println("Esta � uma equa��o de segundo grau.");
	    if (delta < 0) { 
	    System.out.println("Esta equa��o n�o possui ra�zes reais (delta < 0): delta = " +delta);
	      } 
	    else if (delta == 0) { double x = -b / (2 * a); System.out.println("Esta equa��o possui duas ra�zes reais iguais: x' = x'' = " + x); 
	    }
		else
		{ double x1 = (-b + Math.sqrt(delta)) / (2 * a); double x2 = (-b -Math.sqrt(delta)) / (2 * a); 
		System.out.println("Esta equa��o possui duas ra�zes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2); } }
			  
		

	}

}
