package ExerciciosLista;

public class AlunoTeste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.setNome("Duda");

        a1.setP1(9.5);

        a1.setP2(7.5);

        System.out.println("Nome: " + a1.getNome());

        System.out.println("P1 - A1: " + a1.getP1());
        System.out.println("P2 - A1: " + a1.getP2());

        Aluno a2 = a1;

        a2.setP1(8.5);

        a2.setP2(10D);

        System.out.println("P1 - A2: " + a2.getP1());
        System.out.println("P2 - A2: " + a2.getP2());

    }
}

// Quando fazemos a2 = a1, não estamos criando um novo objeto "Aluno". Em vez disso, a1 e a2 apontam para o mesmo objeto na memória. 
// Portanto, qualquer modificação feita em a1 ou a2 afetará o mesmo obejto e atualizará os valores de ambos.
