package Exercicios;

public abstract class Imposto {
    
    public Integer calcularImposto(Produto p, String tipo) {
        return 10;
    }

    public abstract Integer calcularICMS(Produto p);
}
