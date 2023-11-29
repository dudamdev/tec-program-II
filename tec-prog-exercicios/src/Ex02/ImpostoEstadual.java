package Ex02;

public class ImpostoEstadual implements Impostos {

    private static final double TAXA = 0.1;

    @Override
    public double calcularImposto(double valor) {
        return valor * TAXA;
    }
}
