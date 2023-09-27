package ExerciciosLista;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        // Criando um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a taxa Selic
        System.out.print("Informe a taxa Selic (porcentagem): ");
        double taxaSelic = scanner.nextDouble() / 100.0;

        // Solicitar ao usuário para inserir o capital inicial
        System.out.print("Informe o capital inicial: ");
        double capitalInvestido = scanner.nextDouble();

        // Fechar o Scanner
        scanner.close();

        // Dados do CDB Banco Pague Mais
        double rendimentoCDBPagueMais = 0.85 * taxaSelic;
        double taxaAdministrativaCDBPagueMais = 0.10;

        // Dados do CDB Fura Bolso
        double rendimentoCBDFuraBolso = 0.93 * taxaSelic;
        double taxaAdministrativaCBDFuraBolso = 0.01;
        double impostoCBDFuraBolso = 0.06;

        // Variáveis para acompanhar os saldos e rendimentos
        double saldoCDBPagueMais = capitalInvestido;
        double saldoCBDFuraBolso = capitalInvestido;
        double rendimentoTotalCDBPagueMais = 0;
        double rendimentoTotalCBDFuraBolso = 0;

        // Imprime cabeçalho
        System.out.println("Taxa Selic = " + (taxaSelic * 100) + "%");
        System.out.println("Capital investido: " + capitalInvestido + "\n");

        // Calcula o rendimento mês a mês
        System.out.println("Mês\tCapital\t\tRendimento\tTotal");
        for (int mes = 1; mes <= 12; mes++) {
            // Rendimento CDB Banco Pague Mais
            double rendimentoMesCDBPagueMais = saldoCDBPagueMais * (rendimentoCDBPagueMais / 12);
            double descontoAdministrativoCDBPagueMais = rendimentoMesCDBPagueMais * taxaAdministrativaCDBPagueMais;
            saldoCDBPagueMais += rendimentoMesCDBPagueMais - descontoAdministrativoCDBPagueMais;
            rendimentoTotalCDBPagueMais += rendimentoMesCDBPagueMais - descontoAdministrativoCDBPagueMais;

            // Rendimento CDB Fura Bolso
            double rendimentoMesCBDFuraBolso = saldoCBDFuraBolso * (rendimentoCBDFuraBolso / 12);
            double descontoAdministrativoCBDFuraBolso = saldoCBDFuraBolso * taxaAdministrativaCBDFuraBolso;
            double descontoImpostoCBDFuraBolso = rendimentoMesCBDFuraBolso * impostoCBDFuraBolso;
            saldoCBDFuraBolso += rendimentoMesCBDFuraBolso - descontoAdministrativoCBDFuraBolso - descontoImpostoCBDFuraBolso;
            rendimentoTotalCBDFuraBolso += rendimentoMesCBDFuraBolso - descontoAdministrativoCBDFuraBolso - descontoImpostoCBDFuraBolso;

            // Imprime resultados do mês
            System.out.println(mes + "\t" + capitalInvestido + "\t\t" + rendimentoMesCDBPagueMais + "\t\t" + saldoCDBPagueMais + "\t\t" + capitalInvestido + "\t\t" + rendimentoMesCBDFuraBolso + "\t\t" + saldoCBDFuraBolso);
        }

        // Resultados finais
        double rendimentoLiquidoCDBPagueMais = rendimentoTotalCDBPagueMais - (capitalInvestido * taxaAdministrativaCDBPagueMais);
        double rendimentoLiquidoCBDFuraBolso = rendimentoTotalCBDFuraBolso - (capitalInvestido * taxaAdministrativaCBDFuraBolso) - (rendimentoTotalCBDFuraBolso * impostoCBDFuraBolso);

        // Imprime resultados finais
        System.out.println("\nRendimento Total:");
        System.out.println("CDB Banco Pague Mais: " + rendimentoTotalCDBPagueMais);
        System.out.println("CDB Fura Bolso: " + rendimentoTotalCBDFuraBolso);
        System.out.println("\nDescontos:");
        System.out.println("CDB Banco Pague Mais: " + (capitalInvestido * taxaAdministrativaCDBPagueMais));
        System.out.println("CDB Fura Bolso: " + ((capitalInvestido * taxaAdministrativaCBDFuraBolso) + (rendimentoTotalCBDFuraBolso * impostoCBDFuraBolso)));
        System.out.println("\nRendimento Líquido:");
        System.out.println("CDB Banco Pague Mais: " + rendimentoLiquidoCDBPagueMais);
        System.out.println("CDB Fura Bolso: " + rendimentoLiquidoCBDFuraBolso);

        // Verifica qual investimento é mais vantajoso
        String investimentoVantajoso = "Nenhum"; // Inicialmente nenhum é vantajoso

        if (rendimentoLiquidoCDBPagueMais > rendimentoLiquidoCBDFuraBolso) {
            investimentoVantajoso = "CDB Banco Pague Mais";
        } else if (rendimentoLiquidoCBDFuraBolso > rendimentoLiquidoCDBPagueMais) {
            investimentoVantajoso = "CDB Fura Bolso";
        }

        // Imprime o investimento mais vantajoso
        System.out.println("\nInvestimento mais vantajoso: " + investimentoVantajoso);
    }
}
