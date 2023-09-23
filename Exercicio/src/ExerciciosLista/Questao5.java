package ExerciciosLista;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        
        if(numero < 2) {
            System.out.print("Número inválido");
        } else  {
            
                if (numero % 2 == 0 || numero % 3 == 0) {
                    System.out.println("O número NÃO é primo!");
                    
                } else {
                    boolean primo = true;
                    for (int j = 3; j < numero; j++) {
                        if (numero % j == 0) {
                            primo = false;
                            continue;
                        }
                    }
                    
                    if(primo) {
                        System.out.println("O número é primo!");
                    } else {
                        System.out.println("O número NÃO é primo!");

                    }
                }
        
        }
    }
}
