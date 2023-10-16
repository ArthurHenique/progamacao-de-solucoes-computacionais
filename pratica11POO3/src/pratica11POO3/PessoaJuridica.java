package pratica11POO3;

class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}
