package Exercicios;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Set<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            int num = rand.nextInt(60) + 1;
            set.add(num);
        }

        System.out.println("Bem-vindo ao Jogo de Loteria!");
        System.out.println("Insira 6 números entre 1 e 60:");

        Set<Integer> numUsuario = new HashSet<>();
        while (numUsuario.size() < 6) {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            if (num >= 1 && num <= 60) {
                numUsuario.add(num);
            } else {
                System.out.println("Numero invalido! (1 a 60)");
            }
        }

        numUsuario.retainAll(set);
        int acerto = numUsuario.size();

        System.out.println("\nNúmeros sorteados: " + set);
        System.out.println("Seus números: " + numUsuario);
        System.out.println("Você acertou " + acerto + " número(s).");
    }
}
