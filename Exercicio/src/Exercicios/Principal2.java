package Exercicios;

public class Principal2 {
    public static void main(String[] args) {
        Imposto imposto = new ImpostoPadrao();
        imposto.calcularImposto(new Produto(), "AB");
    }
}
