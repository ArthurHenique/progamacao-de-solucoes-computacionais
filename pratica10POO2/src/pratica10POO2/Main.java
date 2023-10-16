package pratica10POO2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

        PessoaFisica pessoaFisica = new PessoaFisica();
        System.out.print("Nome da Pessoa Física: ");
        pessoaFisica.setNome(scanner.nextLine());
        System.out.print("CPF da Pessoa Física: ");
        pessoaFisica.setCPF(scanner.nextLine());
        cadastro.cadastrarPessoa(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        System.out.print("Nome da Pessoa Jurídica: ");
        pessoaJuridica.setNome(scanner.nextLine());
        System.out.print("CNPJ da Pessoa Jurídica: ");
        pessoaJuridica.setCNPJ(scanner.nextLine());
        cadastro.cadastrarPessoa(pessoaJuridica);

        cadastro.imprimirCadastro();

        scanner.close();
    }

}
