package pratica10POO2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

        PessoaFisica pessoaFisica = new PessoaFisica();
        System.out.print("Nome da Pessoa F�sica: ");
        pessoaFisica.setNome(scanner.nextLine());
        System.out.print("CPF da Pessoa F�sica: ");
        pessoaFisica.setCPF(scanner.nextLine());
        cadastro.cadastrarPessoa(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        System.out.print("Nome da Pessoa Jur�dica: ");
        pessoaJuridica.setNome(scanner.nextLine());
        System.out.print("CNPJ da Pessoa Jur�dica: ");
        pessoaJuridica.setCNPJ(scanner.nextLine());
        cadastro.cadastrarPessoa(pessoaJuridica);

        cadastro.imprimirCadastro();

        scanner.close();
    }

}
