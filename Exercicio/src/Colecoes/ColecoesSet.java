package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ColecoesSet {

    public static void main(String[] args) {

        Set<Integer> setNumeros = new HashSet<Integer>();

        System.out.println("ADIÇÃO");
        System.out.println(setNumeros.add(10));
        System.out.println(setNumeros.add(22));
        System.out.println(setNumeros.add(33));
        System.out.println(setNumeros.add(22));

        System.out.println("\nREMOÇÃO");
        System.out.println(setNumeros.remove(10));
        System.out.println(setNumeros.remove(99));

        System.out.println("\nIMPRESSÃO");
        System.out.println(setNumeros);
        
        
        //gerar set (coleção) com 50 números entre 0 e 1000, garantindo que não haja nenhum número repetido
        Set<Integer> randomNumeros = new HashSet<Integer>();
        
        // for (int i = 0; i < 50; i++) {
            //     randomNumeros.add((int) (Math.random() * 1000));
            // }
            
         while (randomNumeros.size() < 50) {
            randomNumeros.add((int) (Math.random() * 1000));
        }
            
        System.out.println("\nGera 50 números aleatórios, não repetidos = " + randomNumeros);
        System.out.println("Tamanho = " + randomNumeros.size());
            
        Iterator<Integer> it = randomNumeros.iterator();
    
        System.out.println("50 números aleatórios não repetidos, com Iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nSET DE CLIENTE");
        Set<Cliente> setClientes = new HashSet<>();

        Cliente c1 = new Cliente(1, "João");
        Cliente c2 = new Cliente(2, "Ana");
        Cliente c3 = new Cliente(3, "João");
        Cliente c4 = new Cliente(2, "Pedro");

        System.out.println(setClientes.add(c1));
        System.out.println(setClientes.add(c2));
        System.out.println(setClientes.add(c3));
        System.out.println(setClientes.add(c4));

    }
    
}
