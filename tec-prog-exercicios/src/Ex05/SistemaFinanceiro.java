package Ex05;

public class SistemaFinanceiro implements Observer {

    @Override
    public void update(Produto produto) {
        System.out.println("Fatura de cobrança solicitada ao depto. financeiro:\n - " + produto);
    }
}
