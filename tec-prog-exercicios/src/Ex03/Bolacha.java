package Ex03;

public class Bolacha extends Produto {

    @Override
    public Double calcularPrecoVenda(Double precoCusto) {
        return precoCusto * 1.1;
    }
}
