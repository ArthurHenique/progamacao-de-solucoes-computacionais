package pratica09POO1;
import java.util.Scanner;
public class Banco {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Informe o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        contaCorrente.iniciarContaCorrente(numeroConta, numeroAgencia);

        System.out.print("Informe o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        contaCorrente.depositar(valorDeposito);

        System.out.println("Dados da conta após o depósito:");
        contaCorrente.exibe();

        System.out.print("Informe o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        contaCorrente.sacar(valorSaque);

        System.out.println("Dados da conta após o saque:");
        contaCorrente.exibe();

        scanner.close();
	}

}
