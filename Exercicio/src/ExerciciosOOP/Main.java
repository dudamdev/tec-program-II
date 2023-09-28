package ExerciciosOOP;

public class Main {
    
    public static void main(String[] args) {

        Universidade princeton = new Universidade("Princeton");

        for (int i = 1; i <= 10; i++) {
            Departamento departamento = new Departamento(i, "Departamento " + i, "Área " + i);
            princeton.adicionarDepartamento(departamento);
        }
        
        princeton.exibirDepartamentos();

        Departamento departamentoProcurado = new Departamento(5, "Departamento 5", "Área 5");
        
        Departamento encontrado = princeton.procurarDepartamento(departamentoProcurado);

        if (encontrado != null) {
            System.out.println("\nDepartamento encontrado:");
            System.out.println("Nome: " + encontrado.getNome());
            System.out.println("Área de Conhecimento: " + encontrado.getAreaConhecimento());
        } else {
            System.out.println("\nDepartamento não encontrado.");
        }
    }
}
