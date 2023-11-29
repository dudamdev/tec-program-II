public class ConCafe extends BlendDecorator {

    private Bebida bebida;

    public ConCafe(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return "ConCafe + " + this.bebida.getDescricao();
    }

    @Override
    public Double getValor() {
        return 8.99 + this.bebida.getValor();
    }
    

}
