package pratica10POO4;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada X do círculo: ");
        int x = scanner.nextInt();
        System.out.print("Digite a coordenada Y do círculo: ");
        int y = scanner.nextInt();
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor para mover na coordenada X: ");
                    int movX = scanner.nextInt();
                    System.out.print("Digite o valor para mover na coordenada Y: ");
                    int movY = scanner.nextInt();
                    circulo.moveX(movX);
                    circulo.moveY(movY);
                    break;
                case 2:
                    System.out.print("Digite o valor para aumentar o raio: ");
                    double aumento = scanner.nextDouble();
                    circulo.aumenta(aumento);
                    break;
                case 3:
                    System.out.println(circulo.exibe());
                    break;
                case 4:
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
