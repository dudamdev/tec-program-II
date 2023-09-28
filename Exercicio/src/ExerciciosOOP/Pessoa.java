package ExerciciosOOP;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUniversidade() {
        return "Trabalha na Universidade de " + universidade.getNome() +
                ", Departamento de " + universidade.getDepartamento().getNome() +
                ", Área de Conhecimento: " + universidade.getDepartamento().getAreaConhecimento();
    }

    private String getAreaConhecimento() {
        return null;
    }   

}
