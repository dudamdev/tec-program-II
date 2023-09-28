package ExerciciosOOP;

public abstract class Midia {

    private String titulo;

    private int anodeLancamento;

    private int codigo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnodeLancamento() {
        return anodeLancamento;
    }

    public void setAnodeLancamento(int anodeLancamento) {
        this.anodeLancamento = anodeLancamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Midia(String titulo, int anodeLancamento, int codigo) {

        this.titulo = titulo;
        this.anodeLancamento = anodeLancamento;
        this.codigo = codigo;
    }

    public abstract void imprimirInformacoes();
    
}
