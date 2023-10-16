package pratica10POO1;

public class Main {
	public static void main(String[] args) {
       
        Cadastro cadastro = new Cadastro();

        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla", "123456789", "ABC123", "Prata");
        Veiculo veiculo2 = new Veiculo("Honda", "Civic", "987654321", "XYZ789", "Preto");

        cadastro.cadastrarVeiculo(veiculo1);
        cadastro.cadastrarVeiculo(veiculo2);

        cadastro.imprimirCadastro();
    }

}
