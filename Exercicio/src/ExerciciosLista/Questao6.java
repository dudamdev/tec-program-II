package ExerciciosLista;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu salário bruto: ");
        double salarioBruto = input.nextDouble();

        double aliquota;
        double deducao;

        if (salarioBruto <= 1212D) {
            aliquota = .075;
            deducao = 0D;


        } else if (salarioBruto <= 2427.35) {
            aliquota = .09;
            deducao = 18.18;


        } else if (salarioBruto <= 3641.03) {
            aliquota = .12;
            deducao = 91D;


        } else {
            aliquota = .14;
            deducao = 163.82;

        }
        
        double valorINSS = (salarioBruto * aliquota) - deducao;

        double salarioLiquido = salarioBruto - valorINSS;

        System.out.println("#############################");
        System.out.println("CALCULADORA DE INSS");
        System.out.println("#############################");
        System.out.println("Salário bruto............: " + salarioBruto);
        System.out.println("Aliquota INSS (%)........: " + aliquota * 100);
        System.out.println("Desconto INSS............: " + deducao);
        System.out.println("O valor salário liquido é: " + salarioLiquido);

    }
}
