package ExerciciosOOP;

public class Cd extends Midia {

    private String artista;
    
    public Cd(String titulo, int anodeLancamento, int codigo, String artista) {
        super(titulo, anodeLancamento, codigo);
        this.artista = artista;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("CD");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Lançamento: " + getAnodeLancamento());
        System.out.println("Código: " + getCodigo());
        System.out.println("Autor: " + artista);
    }
   
}
