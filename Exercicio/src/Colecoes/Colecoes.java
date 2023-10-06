package Colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {

        //lista encadeada
        List<Integer> listaEncadeada = new LinkedList<Integer>();

        ((LinkedList<Integer>) listaEncadeada).addFirst(1);

        List<Integer> listaNumeros = new ArrayList<Integer>();

        List lista = new ArrayList();
        lista.add(333);
        lista.add("Raul");

        for (int i = 0; i < 100; i++) {
            listaNumeros.add((int) (Math.random() * 999));
        }
        
        listaNumeros.add(4, 999);

        //por posição
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        Integer somaMultiplos = 0;
        
        //for enhanced
        for (Integer n : listaNumeros) {
            if (n % 5 == 0) {
                somaMultiplos += 1;
            }
            
        }

        //stream
        listaNumeros.forEach(n -> {
            System.out.println(n);
        });

        //parallel
        listaNumeros.stream().parallel().forEach(n -> {
            System.out.println(Thread.currentThread().getName() + " - " + n);
        });
    }
}
