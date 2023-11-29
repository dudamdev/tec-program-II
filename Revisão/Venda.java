// Usando os diferentes construtores

public class Venda {

    public Venda() {
        //Construtor Default
    }

    public void fecharVenda() {
        //cria uma NF com um numero gerado
        NotaFiscal nf = new NotaFiscal();

        NotaFiscal nf2 = new NotaFiscal(12345);

    }

}



