package ExerciciosOOP;

public class Livro extends Midia {

    private String autor; 

    public Livro(String titulo, int anodeLancamento, int codigo, String autor) {
        super(titulo, anodeLancamento, codigo);
        this.autor = autor; 
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Livro");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Lançamento: " + getAnodeLancamento());
        System.out.println("Código: " + getCodigo());
        System.out.println("Autor: " + autor);
    }
 

}
