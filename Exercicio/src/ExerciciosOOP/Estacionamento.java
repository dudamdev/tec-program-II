package ExerciciosOOP;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Veiculo> veiculosEstacionados;
    
    public Estacionamento() {
        veiculosEstacionados = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosEstacionados.add(veiculo);
    }

    public Double calcularTotal() {
        Double total = 0D;
        
        for (Veiculo veiculo : veiculosEstacionados) {
            total += veiculo.calcularTaxa();
        }

        return total;
    }
}
