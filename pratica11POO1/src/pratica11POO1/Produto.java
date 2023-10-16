package pratica11POO1;
import java.util.Scanner;
public class Produto {
	private int id;
    private String nome;
    private double preco;
    private static int ultimo_id = 0;

    public Produto() {
        this.id = ++ultimo_id;
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public static int getUltimoId() {
        return ultimo_id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

    public void reajustaPreco(double percentual) {
        this.preco = this.preco * (1 + percentual / 100);
    }
    
}
