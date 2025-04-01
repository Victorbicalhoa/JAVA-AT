package Exercicios;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do emprestimo: ");
        double emprestimo = sc.nextDouble();

        int parcelas;
        while (true) {
            System.out.println("Digite a quantidade de parcelas (entre 6 e 48): ");
            parcelas = sc.nextInt();
            if (parcelas >= 6 && parcelas <= 48) {
                break;
            } else {
                System.out.println("O número de parcelas deve ser entre 6 e 48.");
            }
        }


        double juros = 1.03;
        double total = emprestimo * Math.pow(juros, parcelas);
        double valorParcelas = total / parcelas;

        System.out.println("Nome: " + nome);
        System.out.println("O valor total do emprestimo: R$ " + total);
        System.out.println("O valor das parcelas: R$ " + valorParcelas);


    }
}
