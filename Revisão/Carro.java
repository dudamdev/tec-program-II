class Carro {
    String cor;
    String modelo;
    String motor;

    void ligar() {
        System.out.println("Ligando o carro");
    }

    void desligar() {
        System.out.println("Desligando o carro");
    }

    void mudarMarcha() {
        System.out.println("Marcha engatada");
    }

    void acelerar() {
        System.out.println("Acelerando o carro");
    }

    void brecar() {
        System.out.println("Brecando o carro");
    }

    /*  As variáveis apontam para duas áreas de memórias diferentes.
    Carro c1 = new Carro();
    Carro c2 = new Carro();
    */

    /* As variáveis apontam para a mesma área da memória. 
    Carro c1 = new Carro();
    Carro c2 = c1;
    */
}


