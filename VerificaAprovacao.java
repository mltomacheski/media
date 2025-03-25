import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlunos = 3; // declaração, atribuição e inicialização 
        int alunoAtual = 1;
       
        double notaAluno [] = new double [11]; // declaração atribuição e inicialização

        boolean aprovacao[] = new boolean[11]; // declaração, atribuição e inicialização

        do {
            //System.out.println("\033c");
            System.out.println("Aluno " + alunoAtual + " - Digite as tres notas do aluno");
            System.out.print("Digite a primeira nota --> ");
            double nota1 = scanner.nextDouble();

            notaAluno[0] = nota1; 
           
            System.out.print("Digite a segunda nota --> ");
            double nota2 = scanner.nextDouble();

            notaAluno[1] = nota2; 

            System.out.print("Digite a terceira nota --> ");
            double nota3 = scanner.nextDouble();

            notaAluno[2] = nota3; 
           
            System.out.print("Digite a frequencia --> ");
            double frequencia = scanner.nextDouble();

            notaAluno[3] = frequencia;
           
            double media = (nota1 + nota2 + nota3) / 3;
            boolean aprovado = (media >= 6) && (frequencia >= 75);

            notaAluno[4] = media;

            aprovacao[0] = aprovado;
           
            //System.out.println("Aluno " + alunoAtual + " - Media: " + media + " --> Frequencia: " + frequencia + "%");
            System.out.printf("Aluno %d - Média: %.2f, Frequência: %.2f%%\n", alunoAtual, media, frequencia);
           
            System.out.println(aprovado ? "Aprovado!" : "Reprovado!");
            System.out.println("---------------------------");
           
            alunoAtual++;
        } while (alunoAtual <= totalAlunos);

        for(int contador = 0; contador <= 10; contador++ ){
            System.out.println( notaAluno[ contador ]);
        }

        for(int contador = 0; contador <= 10; contador++ ){
            System.out.println( aprovacao[ contador ]);
        }

        System.out.println("Obrigado por utilizar nosso sistema.");
       
        scanner.close(); //fechar o scanner 
    }
}