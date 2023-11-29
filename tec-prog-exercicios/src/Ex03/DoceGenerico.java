package Ex03;

public class DoceGenerico extends Produto {

    @Override
    public Double calcularPrecoVenda(Double precoCusto) {
        return precoCusto * 1.44;
    }
}
