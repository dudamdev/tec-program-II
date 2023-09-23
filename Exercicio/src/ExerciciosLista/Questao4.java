package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadeValores;

        List<Integer> listaNumeros = new ArrayList<>();

        System.out.print("Digite a quantidade de valores: ");

        quantidadeValores = input.nextInt();

        System.out.println(quantidadeValores);
        
        System.out.println("Digite os valores: ");

        int cont = 0;

        for (int i = 1; i <= quantidadeValores; i++) {
            int numero = input.nextInt();
            listaNumeros.add(numero);

            if (numero < 0) {
                cont += 1;
            }
        }

        System.out.println("Lista: " + listaNumeros);
        System.out.println("Quantidade de números negativos: " + cont);


    }
}