public class ValidacaoCPF {

    public boolean validar(String cpf) {
        return validar(Integer.parseInt(cpf));
    }

    public boolean validar(int cpf) {
        //Faz as verificações do CPF
        return false;
    }

    public boolean validar(int cpf, int digito) {
        return validar((cpf * 100) + digito);
    }
}


