package pratica09POO3;

public class Main {
	 public static void main(String[] args) {
	        Cadastro cadastro = new Cadastro(10);
	        
	        Funcionario funcionario1 = new Funcionario("João", 30, "Gerente", 5000.0, "123-456-7890", "Rua A, 123");
	        Funcionario funcionario2 = new Funcionario("Maria", 25, "Assistente", 3000.0, "987-654-3210", "Avenida B, 456");

	        cadastro.cadastrarFuncionario(funcionario1);
	        cadastro.cadastrarFuncionario(funcionario2);

	        cadastro.imprimirCadastro();
	    }

}
