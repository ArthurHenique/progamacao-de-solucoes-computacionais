package pratica10POO2;

public class Pessoa {
	private String nome;

    /**
     * Construtor da classe Pessoa.
     */
    public Pessoa() {
        this.nome = "";
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}

