public class ServicoMensagens {
    public static void main(String[] args) {

        Mensagem m = new MensagemTexto("Duda");
        m.corpoMensagem("Gabi, eu te amo por TXT");
        m.enviar();

        m = new MensagemFax("Duda");
        m.corpoMensagem("Gabi, eu te amo por FAX");
        m.enviar();
    }
}


