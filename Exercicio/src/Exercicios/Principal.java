package Exercicios;

public class Principal {
      public static void main(String[] args) {
     
        Produto p1 = new Produto();
        p1.setCodigo(334);
        p1.setDescricao("Celular bonito");
        p1.setTipo("A");
        p1.setQuantidade(6);
        p1.setPrecoCusto(100D);
        p1.setEstado("RS");
        
        Venda venda;
        
       if ("MG".equalsIgnoreCase(p1.getEstado())) {
           venda = new VendaMG();
       } else if ("RS".equalsIgnoreCase(p1.getEstado())) {
            venda = new VendaRS();
       } else {
           venda = new Venda();
       }
        System.out.println(venda.vender(p1));
    }    
}
