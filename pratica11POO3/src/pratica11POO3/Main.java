package pratica11POO3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do cadastro: ");
        int tamanhoCadastro = scanner.nextInt();
        scanner.nextLine(); // Limpar a quebra de linha

        Cadastro cadastro = new Cadastro(tamanhoCadastro);

        while (true) {
            System.out.println("Escolha o tipo de pessoa a ser cadastrada:");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.println("3 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar a quebra de linha

            if (escolha == 3) {
                break;
            }

            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Informe o CPF: ");
                String CPF = scanner.nextLine();
                PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
                cadastro.cadastrarPessoa(pessoaFisica);
            } else if (escolha == 2) {
                System.out.print("Informe o CNPJ: ");
                String CNPJ = scanner.nextLine();
                PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
                cadastro.cadastrarPessoa(pessoaJuridica);
            }
        }

        cadastro.imprimirCadastro();

        scanner.close();
    }

}
