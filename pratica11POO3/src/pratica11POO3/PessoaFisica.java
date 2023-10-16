package pratica11POO3;

class PessoaFisica extends Pessoa {
    private String CPF;

    public PessoaFisica(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
