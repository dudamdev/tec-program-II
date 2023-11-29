public class RH {
    public static void main(String[] args) {
        Gerente chefe = new Gerente();
        Empregado emp = new Empregado();

        pagarSalario(chefe);
        pagarSalario(emp);

        promoverEmp(chefe, emp);
    }

    private static void pagarSalario(Empregado e) {
        //Faz um lançamento do pagamento de salário
    }

    public static void promoverEmp(Gerente g, Empregado e) {
        //Apenas um gerente pode promover um empregado.
    }
}


