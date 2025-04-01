package Exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";

        System.out.println("Cadastro de Compras:");

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Compra " + i + ":");
                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade;
                try {
                    quantidade = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Quantidade inválida! Tente novamente.");
                    continue;
                }

                System.out.print("Preço Unitário: ");
                double precoUnitario;
                try {
                    precoUnitario = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Preço unitário inválido! Tente novamente.");
                    continue;
                }

                escritor.write("Produto: " + produto + ", Quantidade: " + quantidade + ", Preço Unitário: R$ " + precoUnitario);
                escritor.newLine();
            }
            System.out.println("\nAs compras foram registradas com sucesso no arquivo " + nomeArquivo + ".");
        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }

        System.out.println("\nCompras Registradas:");
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}



