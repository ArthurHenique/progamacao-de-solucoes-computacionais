package pratica02;
import java.util.Scanner;
public class Questãoo14 {

	public static void main(String[] args) {
		// Git
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um comando Git (git clone, git fetch, git pull)");
		String comando = scanner.nextLine();
		
		if (comando.equals("git clone")) {
		    System.out.println("Comando 'git clone' ");
		    System.out.println("O comando 'git clone' é usado para criar uma cópia local de um repositório Git remoto.");
		    System.out.println("Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git");
		} else if(comando.equals( "git fetch")) { 
		    System.out.println("Comando 'git fetch':");
		    System.out.println("O comando 'git fetch' é usado para buscar as atualizações do repositório remoto sem fazer merge com o seu código local."); 
		    System.out.println("Exemplo: git fetch origin"); 
	    } else if (comando.equals("git pull")) { 
		    System.out.println("Comando 'git pull':"); 
		    System.out.println("O comando 'git pull' é usado para buscar e incorporar as atualizações do repositório remoto no seu código local."); 
		    System.out.println("Exemplo: git pull origin master");
	    } else { 
			System.out.println("Comando Git desconhecido."); }
				
	    scanner.close();
	    
		}
		
	}