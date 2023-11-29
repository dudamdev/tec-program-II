public class MainCadastroUsuario {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        CadastroUsuario cad = new CadastroUsuarioBanco();
        cad.inserir(usuario);

        cad = new CadastroUsuarioArquivo();
        cad.inserir(usuario);
    }
}

