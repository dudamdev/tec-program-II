/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author 1091392223010
 */
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
