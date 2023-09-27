package ExerciciosLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao8 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>(Arrays.asList(2, 7, 4, 3, 2));

        List<Integer> y = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 5));
        
        int n = 5;
        int soma = 0;
        int soma1 = 0;
        int soma2 = 0;

        for (int j = 0; j < n; j++) {
            soma += x.get(j);
        }

        System.out.println("Soma dos primeiros " + n + " elementos de x: " + soma);

        for (int j = 0; j < n; j++) {
            soma += x.get(j) * y.get(j);
        }

        System.out.println("Soma dos primeiros " + n + " elementos de x e y: " + soma);

        for (int j = 2; j <= n; j++) {
            soma1 += x.get(j - 1) * Math.pow(y.get(j - 1), 2);
        }

        for (int j = 1; j <= n; j++) {
            soma2 += 3;
        }

        int resultado = soma1 + soma2;

        System.out.println("Soma das somatórias: " + resultado);


    }
}
