import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlunos = 3;
        int alunoAtual = 1;
       
        do {
            System.out.println("\033c");
            System.out.println("Aluno " + alunoAtual + " - Digite as tres notas do aluno");
            System.out.print("Digite a primeira nota --> ");
            double nota1 = scanner.nextDouble();
           
            System.out.print("Digite a segunda nota --> ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota --> ");
            double nota3 = scanner.nextDouble();
           
            System.out.print("Digite a frequencia --> ");
            double frequencia = scanner.nextDouble();
           
            double media = (nota1 + nota2 + nota3) / 3;
            boolean aprovado = (media >= 6) && (frequencia >= 75);
           
            //System.out.println("Aluno " + alunoAtual + " - Media: " + media + " --> Frequencia: " + frequencia + "%");
            System.out.printf("Aluno %d - Média: %.2f, Frequência: %.2f%%\n", alunoAtual, media, frequencia);
           
            System.out.println(aprovado ? "Aprovado!" : "Reprovado!");
            System.out.println("---------------------------");
           
            alunoAtual++;
        } while (alunoAtual <= totalAlunos);

        System.out.println("Obrigado por utilizar nosso sistema.");
       
        scanner.close();
    }
}