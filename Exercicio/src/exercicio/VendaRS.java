package exercicio;
public class VendaRS extends Venda {

    @Override
    public Produto vender(Produto produto) {
        if(produto.getPrecoCusto() <= 1000) {
            produto.setPrecoVenda(produto.getPrecoCusto() * 1.15);
        } else {
            produto.setPrecoVenda(produto.getPrecoCusto() * 1.10);
        }

        return produto;
    }

}
