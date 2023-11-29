package Ex05;

public class EmailCliente implements Observer {

    @Override
    public void update(Produto produto) {
        System.out.println("Cliente notificado por email:\n - " + produto);
    }
}
