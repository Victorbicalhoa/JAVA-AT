package Exercicios;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Segundo usuário: ");
        String usuario2 = scanner.nextLine();

        // Array para armazenar as mensagens
        String[] mensagens = new String[10];

        System.out.println("\nTroca de mensagens iniciada!");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(usuario1 + ", digite sua mensagem: ");
                mensagens[i] = usuario1 + ": " + scanner.nextLine();
            } else {
                System.out.print(usuario2 + ", digite sua mensagem: ");
                mensagens[i] = usuario2 + ": " + scanner.nextLine();
            }
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println("\nObrigado por utilizarem o sistema!");

        scanner.close();
    }

}
