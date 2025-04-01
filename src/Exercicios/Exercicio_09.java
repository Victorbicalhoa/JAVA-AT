package Exercicios;

public class Exercicio_09 {
    public static class ContaBancaria {
        String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        public void deposito(double valor) {
           if (valor > 0){
               saldo += valor;
               System.out.println("Deposito realizado com sucesso! Saldo: " + saldo);
           } else {
               System.out.println("Valor inválido!");
           }
        }
        public void sacar(double valor) {
            if (saldo >= valor && valor > 0) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso! Saldo: " + saldo);
            } else if (valor <= 0) {
                System.out.println("Valor invalido!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        public double exibirSaldo() {
            System.out.println("Saldo: R$" + saldo);
            return saldo;
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Victor", 5000.0);

        System.out.println("--- Saldo Inicial ---");
        conta.exibirSaldo();

        System.out.println("\n--- Depósito ---");
        conta.deposito(5000.0);

        System.out.println("\n--- Saque Válido ---");
        conta.sacar(3000.0);

        System.out.println("\n--- Saque Inválido ---");
        conta.sacar(15000.0);

        System.out.println("\n--- Saque com Valor Negativo ---");
        conta.sacar(-50.0);

        System.out.println("\n--- Saldo Final ---");
        conta.exibirSaldo();
    }
}

