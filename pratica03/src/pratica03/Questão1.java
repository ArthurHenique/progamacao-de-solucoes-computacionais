package pratica03;
import java.util.Scanner;
public class Questão1 {

	public static void main(String[] args) {
		// Nota
		Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;
        int alunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Digite a nota final e o total de faltas dos alunos (digite uma nota negativa para encerrar):");

        while (true) {
            System.out.print("Nota final: ");
            double nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            System.out.print("Total de faltas: ");
            int faltas = scanner.nextInt();

            totalAlunos++;

            if (nota >= 90) {
                alunosAprovados++;
            } else if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            somaNotas += nota;
        }

        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;

            System.out.println("a. Quantidade de alunos com nota maior ou igual a 90: " + alunosAprovados);
            System.out.println("b. Quantidade de alunos reprovados por nota ou falta: " + alunosReprovados);
            System.out.println("c. Maior nota: " + maiorNota);
            System.out.println("   Menor nota: " + menorNota);
            System.out.println("d. Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }

        scanner.close();
    }
}
		
