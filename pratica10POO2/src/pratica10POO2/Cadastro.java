package pratica10POO2;
import java.util.ArrayList;
class Cadastro {
    private ArrayList<Pessoa> cadastro;

    public Cadastro() {
        cadastro = new ArrayList<>();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        cadastro.add(pessoa);
    }

    public void imprimirCadastro() {
        for (Pessoa pessoa : cadastro) {
            if (pessoa instanceof PessoaFisica) {
                System.out.println("Pessoa F�sica - Nome: " + pessoa.getNome() + ", CPF: " + ((PessoaFisica) pessoa).getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("Pessoa Jur�dica - Nome: " + pessoa.getNome() + ", CNPJ: " + ((PessoaJuridica) pessoa).getCNPJ());
            } else {
                System.out.println("Pessoa - Nome: " + pessoa.getNome());
            }
        }
    }
}
