public class TesteRetorno {

    public void naoRetornaNada() {
        int i = (int) (Math.random() * 100);
        if (i > 50) {
            return; //Aborta o método
        }
        System.out.println("OK");
    }

    int somar(int a, int b) {
        return a + b;
    }

    Carro criarUmCarro() {
        Carro c = new Carro();
        c.modelo = "Ferrari";
        c.cor = "vermelho";
        c.motor = "5.0 V12";

        return c;
    }
}
