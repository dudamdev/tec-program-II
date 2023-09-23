package ExerciciosLista;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = input.nextDouble();

        double aliquota;
        double deducao;

        if (salario <= 1212D) {
            aliquota = .075;
            deducao = 0D;


        } else if (salario <= 2427.35) {
            aliquota = .09;
            deducao = 18.18;


        } else if (salario <= 3641.03) {
            aliquota = .12;
            deducao = 91D;


        } else {
            aliquota = .14;
            deducao = 163.82;

        }
        
        double valorINSS = (salario * aliquota) - deducao;

        double salarioLiquido = salario - valorINSS;

        System.out.println("O valor do INSS é: " + valorINSS);
        System.out.println("O valor salário liquido é: " + salarioLiquido);

    }
}
