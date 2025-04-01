package Exercicios;

import java.util.Scanner;

public class Exercicio_07 {
    public static class Aluno{
         String nome;
         int matricula;
         double nota1;
         double nota2;
         double nota3;
         double media;

         public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
             this.nome = nome;
             this.matricula = matricula;
             this.nota1 = nota1;
             this.nota2 = nota2;
             this.nota3 = nota3;
         }

         public void calcularMedia() {
             media = (nota1 + nota2 + nota3) / 3;
         }

         public void verificarAprovacao() {
             if (media >= 7) {
                 System.out.println("Aprovado");
             } else {
                 System.out.println("Reprovado");
             }
         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        aluno.calcularMedia();

        System.out.println("\n--- Resultado Final ---");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Média: " + aluno.media);
        aluno.verificarAprovacao();

        scanner.close();
    }

}
