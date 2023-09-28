package ExerciciosOOP;

public class Bicicleta implements Veiculo {
    
    private String modelo;

    private int ano;

    private String tipo;

    public Bicicleta(String modelo, int ano, String tipo) {
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    @Override
    public Double calcularTaxa() {
        return 0D;
    }
    
}
