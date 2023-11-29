package Ex05;

public class SistemaLogistica implements Observer {

    @Override
    public void update(Produto produto) {
        System.out.println("Expedição autorizada para o depto. de logística:\n - " + produto);
    }
}
