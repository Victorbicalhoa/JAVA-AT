package Exercicios.Parte_02;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senha;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

         while (true){
            System.out.println("Digite uma senha com pelo menos uma letra maiúscula, um número e um caractere especial : ");
            senha = sc.nextLine();

             if (senha.length() < 8) {
                 System.out.println("A senha deve ter no mínimo 8 caracteres.");
             } else if (!senha.matches(".*[A-Z].*")) {
                 System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
             } else if (!senha.matches(".*\\d.*")) {
                 System.out.println("A senha deve conter pelo menos um número.");
             } else if (!senha.matches(".*[@#$%^&+=*].*")) {
                 System.out.println("A senha deve conter pelo menos um caractere especial.");
             } else {
                 System.out.println("Senha cadastrada com sucesso, " + nome + "!");
                 break;
             }

         }
    }
}
