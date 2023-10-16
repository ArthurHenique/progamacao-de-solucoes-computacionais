package pratica09POO3;
import java.util.Arrays;

class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;

    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void exibe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
    }
}

class Cadastro {
    private Funcionario[] funcionarios;
    private int numFuncionarios;

    public Cadastro(int tamanhoVetor) {
        funcionarios = new Funcionario[tamanhoVetor];
        numFuncionarios = 0;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (numFuncionarios < funcionarios.length) {
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
        } else {
            System.out.println("Erro: Capacidade máxima atingida. Não é possível cadastrar mais funcionários.");
        }
    }

    public void imprimirCadastro() {
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            funcionarios[i].exibe();
            System.out.println();
        }
    }
}
