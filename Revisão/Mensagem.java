public abstract class Mensagem {
    private String from;
    private String msg;

    public Mensagem(String remetente) {
        from = remetente;
    }

    public void corpoMensagem(String msg) {
        this.msg = msg;
    }

    public abstract void enviar();
}

