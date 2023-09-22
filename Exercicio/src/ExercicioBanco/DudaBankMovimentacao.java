package ExercicioBanco;

public class DudaBankMovimentacao extends MovimentacaoPadrao implements Emprestimo {

    private static final Integer MULTIPLO_EMPRESTIMO = 3;
    @Override
    public void emprestar(Conta conta, Double valor) {
        final Double limiteEmprestimo = conta.getSaldo() * MULTIPLO_EMPRESTIMO;

        // valida a regra do empréstimo
        if (valor > limiteEmprestimo) {
            System.out.println("Valor maior que o limite!");
            return;
        }

        conta.setEmprestimo(valor);
    }
    

}
