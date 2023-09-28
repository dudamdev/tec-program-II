package ExerciciosOOP;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    
    private String nome;
    private List<Departamento> departamentos; 

    
    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void exibirDepartamentos() {
        System.out.println("Departamentos da Universidade " + nome + ":");
        for (Departamento departamento : departamentos) {
            System.out.println(departamento.getNome());
        }
    }

    public Departamento procurarDepartamento(Departamento departamento) {
        for (Departamento dep : departamentos) {
            if (dep.equals(departamento)) {
                return dep;
            }
        }
        return null;
    }

    public Pessoa getDepartamento() {
        return null;
    }  
    
}
