package pratica02;
import java.util.Scanner;
public class Quest�oo14 {

	public static void main(String[] args) {
		// Git
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um comando Git (git clone, git fetch, git pull)");
		String comando = scanner.nextLine();
		
		if (comando.equals("git clone")) {
		    System.out.println("Comando 'git clone' ");
		    System.out.println("O comando 'git clone' � usado para criar uma c�pia local de um reposit�rio Git remoto.");
		    System.out.println("Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git");
		} else if(comando.equals( "git fetch")) { 
		    System.out.println("Comando 'git fetch':");
		    System.out.println("O comando 'git fetch' � usado para buscar as atualiza��es do reposit�rio remoto sem fazer merge com o seu c�digo local."); 
		    System.out.println("Exemplo: git fetch origin"); 
	    } else if (comando.equals("git pull")) { 
		    System.out.println("Comando 'git pull':"); 
		    System.out.println("O comando 'git pull' � usado para buscar e incorporar as atualiza��es do reposit�rio remoto no seu c�digo local."); 
		    System.out.println("Exemplo: git pull origin master");
	    } else { 
			System.out.println("Comando Git desconhecido."); }
				
	    scanner.close();
	    
		}
		
	}