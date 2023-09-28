package ExerciciosOOP;

public class Carro implements Veiculo {

    private String modelo;
    private int ano;
    private String placa;
    private Double valorHora;

    public Carro(String modelo, int ano, String placa, Double valorHora) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularTaxa() {
        Double tempoEstacionado = 2.5;
        
        return valorHora * tempoEstacionado;  
    }
    
}
