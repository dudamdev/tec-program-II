package exercicio;

public class Venda {
    public Produto vender(Produto produto) {
      
        if(produto.getQuantidade() <= 5) {
            produto.setPrecoVenda(produto.getPrecoCusto() * 1.35);
        } else {
            produto.setPrecoVenda(produto.getPrecoCusto() * 1.25);
        }
        
        return produto;
    }    
}
