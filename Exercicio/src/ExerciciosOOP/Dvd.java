package ExerciciosOOP;

public class Dvd extends Midia {
    
    private String diretor;
    
    public Dvd(String titulo, int anodeLancamento, int codigo, String diretor) {
        super(titulo, anodeLancamento, codigo);
        this.diretor = diretor;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Dvd");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Lançamento: " + getAnodeLancamento());
        System.out.println("Código: " + getCodigo());
        System.out.println("Autor: " + diretor);
    }
}
