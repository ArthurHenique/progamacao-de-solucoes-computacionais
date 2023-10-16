package pratica11POO2;
import java.util.Scanner;
public class Inteiro {
	public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int resultado = a;
        for (int i = 1; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int quociente = 0;
        while (a >= b) {
            a = a - b;
            quociente++;
        }
        return quociente;
    }

    public int resto(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }

    public static void main(String[] args) {
        Inteiro inteiro = new Inteiro();
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Multiplicação.");
            System.out.println("2 - Potência.");
            System.out.println("3 - Divisão.");
            System.out.println("4 - Par.");
            System.out.println("5 - Sair.");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Resultado: " + inteiro.multiplicacao(num1, num2));
                    break;
                case 2:
                    System.out.print("Informe a base: ");
                    int base = scanner.nextInt();
                    System.out.print("Informe o expoente: ");
                    int expoente = scanner.nextInt();
                    System.out.println("Resultado: " + inteiro.potencia(base, expoente));
                    break;
                case 3:
                    System.out.print("Informe o dividendo: ");
                    int dividendo = scanner.nextInt();
                    System.out.print("Informe o divisor: ");
                    int divisor = scanner.nextInt();
                    System.out.println("Quociente: " + inteiro.divisao(dividendo, divisor));
                    break;
                case 4:
                    System.out.print("Informe um número: ");
                    int numero = scanner.nextInt();
                    System.out.println("É par? " + inteiro.par(numero));
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

}
