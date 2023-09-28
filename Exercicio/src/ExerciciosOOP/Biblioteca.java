package ExerciciosOOP;

public class Biblioteca {
    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anés", 1954, 12345, "J.R.R. Tolkien");

        Dvd dvd = new Dvd("Matrix", 1999, 67890, "The Wachowskis");

        Cd cd = new Cd("Thriller", 1982, 13579, "Michael Jackson");

        livro.imprimirInformacoes();
        System.out.println();
        dvd.imprimirInformacoes();
        System.out.println();
        cd.imprimirInformacoes();
        System.out.println();

    }
}
