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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto p1 = new Produto();
        p1.setCodigo(334);
        p1.setDescricao("Celular bonito");
        p1.setTipo("A");
        p1.setQuantidade(6);
        p1.setPrecoCusto(100D);
        p1.setEstado("MG");
        
        Venda venda;
        
       if ("MG".equalsIgnoreCase(p1.getEstado())) {
           venda = new VendaMG();
       } else {
           venda = new Venda();
       }
        System.out.println(venda.vender(p1));
    }
    
}
