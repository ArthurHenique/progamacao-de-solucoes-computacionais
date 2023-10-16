package pratica11POO3;

public class Cadastro {
	private Pessoa[] pessoas;
    private int numPessoas;

    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        numPessoas = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (numPessoas < pessoas.length) {
            pessoas[numPessoas] = pessoa;
            numPessoas++;
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }

    public void imprimirCadastro() {
        System.out.println("Cadastro de Pessoas:");
        for (int i = 0; i < numPessoas; i++) {
            Pessoa pessoa = pessoas[i];
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
                System.out.println("CPF: " + pessoaFisica.getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                System.out.println("CNPJ: " + pessoaJuridica.getCNPJ());
            }
            System.out.println();
        }
    }

}
