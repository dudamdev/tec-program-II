public class TesteAB {
    public static void main(String[] args) {
        ClasseA a = new ClasseA();
        a.metodo1();

        a = new ClasseB();
        a.metodo1();

        ClasseB b = new ClasseB();
        b.metodo1();
        b.metodo2();
    }
}


