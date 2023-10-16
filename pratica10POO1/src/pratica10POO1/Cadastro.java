package pratica10POO1;
import java.util.ArrayList;
public class Cadastro {
	private ArrayList<Veiculo> veiculos;

    public Cadastro() {
        veiculos = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void imprimirCadastro() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Número do Chassi: " + veiculo.getNumeroChassi());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println();
        }
    }
}
