package Ex02;

public class ImpostoMunicipal implements Impostos {

    private static final double TAXA = 0.08;

    @Override
    public double calcularImposto(double valor) {
        return valor * TAXA;
    }
}
