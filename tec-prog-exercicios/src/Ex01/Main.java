package Ex01;

public class Main {

    public static void main(String[] args) {

        Veiculo terrestre = new Terrestre();
        Veiculo aquatico = new Aquatico();
        Veiculo aereo = new Aereo();

        Veiculo[] veiculos = {terrestre, aquatico, aereo};

        for (Veiculo veiculo : veiculos) {
            System.out.println("Tipo de veículo: " + veiculo.exibirTipoVeiculo());
        }
    }
}
