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
public class VendaMG extends Venda {
 
    @Override
    public Produto vender(Produto produto) {
        
        produto = super.vender(produto);
        produto.setPrecoVenda((produto.getPrecoVenda()*1.085));
        
        return produto;
    }
    
}
