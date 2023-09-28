package ExerciciosOOP;

public class MainEstacionamento {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 2020, "ABC123", 10D);
        Bicicleta bicicleta1 = new Bicicleta("BikeOne", 2019, "Montanha");

        Estacionamento estacionamento = new Estacionamento();
        
        estacionamento.adicionarVeiculo(carro1);
        estacionamento.adicionarVeiculo(bicicleta1);

        Double receitaTotal = estacionamento.calcularTotal();

        System.out.println("Receita total do estacionamento: R$" + receitaTotal);
    }
}
