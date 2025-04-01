package Exercicios;

public class Exercicio_06 {
    public static class Veiculo {
        public String placa;
        public String modelo;
        public int ano;
        public double km;

        public Veiculo(String placa, String modelo, int ano, double km) {
            this.placa = placa;
            this.modelo = modelo;
            this.ano = ano;
            this.km = km;
        }

        public void exibirDetalhes() {
            System.out.println("Detalhes do veiculo:");
            System.out.println("Placa: " + placa);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Km: " + km);
        }

        public void registrarViagem(double kmViagem) {
            km += kmViagem;
            System.out.println("Viagem registrada! Quilometragem atualizada: " + km);
        }
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("MRX-7444", "Celta", 2007, 70000.0);
        veiculo.exibirDetalhes();
        veiculo.registrarViagem(5000);
    }
}
