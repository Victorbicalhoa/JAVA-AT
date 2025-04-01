package Exercicios;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu salário mensal (em R$):");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0; //
        } else if (salarioAnual <= 33919.80) {
            imposto = (salarioAnual - 22847.76) * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = (salarioAnual - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        } else {
            imposto = (salarioAnual - 45012.60) * 0.275
                    + (45012.60 - 33919.80) * 0.15
                    + (33919.80 - 22847.76) * 0.075;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("Nome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioAnual);
        System.out.printf("Imposto: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido anual: R$ %.2f\n", salarioLiquido);
    }


}
