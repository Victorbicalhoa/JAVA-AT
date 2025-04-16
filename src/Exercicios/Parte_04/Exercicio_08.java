package Exercicios.Parte_04;

public class Exercicio_08 {

    public static class Funcionario {
        String nome;
        double salarioBase;

        public Funcionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Salário Base: R$ " + salarioBase);
        }
    }

    public static class Gerente extends Funcionario {
        public Gerente(String nome, double salarioBase) {
            super(nome, salarioBase);
        }

        public double calcularSalario() {
            return salarioBase * 1.2;
        }

        @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Salário Gerente: R$ " + calcularSalario());
        }
    }

    public static class Estagiario extends Funcionario {
        public Estagiario(String nome, double salarioBase) {
            super(nome, salarioBase);
        }

        public double calcularSalario() {
            return salarioBase * 0.9;
        }

        @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Salário Estagiário: R$ " + calcularSalario());
        }
    }

    public static void main(String[] args) {
        // Criando um gerente
        Gerente gerente = new Gerente("Victor", 5000.0);
        System.out.println("--- Dados do Gerente ---");
        gerente.exibirDados();

        // Criando um estagiário
        Estagiario estagiario = new Estagiario("João", 1500.0);
        System.out.println("\n--- Dados do Estagiário ---");
        estagiario.exibirDados();
    }
}
