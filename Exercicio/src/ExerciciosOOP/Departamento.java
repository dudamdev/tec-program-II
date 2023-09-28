package ExerciciosOOP;

import java.util.Objects;

public class Departamento {
    
    private int codigo;
    private String nome;
    private String areaConhecimento;

    public Departamento(int codigo, String nome, String areaConhecimento) {

        this.codigo = codigo;
        this.nome = nome;
        this.areaConhecimento = areaConhecimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Departamento that = (Departamento) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    
}
