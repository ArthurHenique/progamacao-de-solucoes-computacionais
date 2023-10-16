package pratica09POO1;

public class ContaCorrente {
	 private int numero, agencia;
	    private double saldo;

	    public void iniciarContaCorrente(int n, int ag) {
	        numero = n;
	        agencia = ag;
	        saldo = 0;
	    }

	    public void sacar(double valor) {
	        if (valor <= saldo) {
	            saldo -= valor;
	        } else {
	            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
	        }
	    }

	    public void depositar(double valor) {
	        saldo += valor;
	    }

	    public double consultarSaldo() {
	        return saldo;
	    }

	    public void exibe() {
	        System.out.println("Agência: " + agencia);
	        System.out.println("Conta: " + numero);
	        System.out.println("Saldo: R$ " + saldo);
	}

}
