package ExercicioBanco;

public class BancoApp {
    public static void main(String[] args) {
        MovimentacaoBusiness movimentacao = new MoroBankMovimentacao();
        Conta samuel = new Conta(101022);
        System.out.println(samuel);

        movimentacao.depositar(samuel, 250D);
        System.out.println(samuel);

        movimentacao.sacar(samuel, 50D);
        System.out.println(samuel);

        movimentacao.sacar(samuel, 500D);
        System.out.println(samuel);

        // Teste do banco Franca
        System.out.println("\n\nMOVIMENTAÇÕES BANCO FRANCA");
        Conta duda = new Conta(101526, 1000D);
        movimentacao = new FrancaBankMovimentacao();
        System.out.println(duda);

        movimentacao.depositar(duda, 1000D);
        System.out.println(duda);

        movimentacao.sacar(duda, 1500D);
        System.out.println(duda);

        // Teste do banco Franca
        System.out.println("\n\nMOVIMENTAÇÕES BANCO DUDA");
        movimentacao = new DudaBankMovimentacao();

        Conta contaDuda = new Conta(555);
        movimentacao.depositar(contaDuda, 1000D);

        System.out.println(contaDuda);

        Emprestimo emprestimo = new DudaBankMovimentacao();
        emprestimo.emprestar(contaDuda, 220D);
        movimentacao.depositar(contaDuda, 10.99);
        movimentacao.depositar(contaDuda, 33.99);
        movimentacao.depositar(contaDuda, 22.99);
        movimentacao.sacar(contaDuda, 22.99);
        contaDuda.mostrarExtrato();
        
        System.out.println(contaDuda);



     

    }
}
