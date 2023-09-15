package Exercicio;

public class Produto {
    private Integer codigo;
    
    private String tipo;
    
    private String descricao;
    
    private Integer quantidade;
    
    private Double precoCusto;
    
    private Double precoVenda;
    
    private String estado;
    
    public Produto() {}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
      public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", tipo=" + tipo + ", descricao=" + descricao + ", quantidade=" + quantidade + ", precoCusto=" + precoCusto + ", precoVenda=" + precoVenda + '}';
    }         
}
