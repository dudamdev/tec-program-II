public class ExemploCarro {
    public static void main(String[] args) {
        
        //Criando uma instância da classe Carro
        Carro umCarro = new Carro();

        //Atribuindo os valores dos atributos
        umCarro.modelo = "Gol";
        umCarro.cor = "preto";
        umCarro.motor = "1.0";

        //Executando os métodos do objeto
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();

        //Atribuir null para a variável diz que
        //agora ela não aponta para lugar nenhum
        umCarro = null;
    }
}


