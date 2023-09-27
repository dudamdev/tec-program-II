package ExerciciosLista;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar variáveis para rastrear as informações
        int codigoProdutoMaxVenda = 0;
        int quantidadeMaxVenda = 0;
        double valorTotalMaxVenda = 0;

        int codigoProdutoMinVenda = 0;
        int quantidadeMinVenda = Integer.MAX_VALUE;
        double valorTotalMinVenda = Double.MAX_VALUE;

        double valorTotalVendido = 0;
        int quantidadeTotalItensVendidos = 0;

        double valorMedioVendido = 0;

        // Loop para registrar as vendas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe os detalhes da venda #" + i);

            System.out.print("Código do Produto: ");
            int codigoProduto = scanner.nextInt();

            System.out.print("Valor Unitário: ");
            double valorUnitario = scanner.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            // Calcular o valor total da venda
            double valorTotal = valorUnitario * quantidade;

            // Atualizar as variáveis de rastreamento
            valorTotalVendido += valorTotal;
            quantidadeTotalItensVendidos += quantidade;

            if (valorTotal > valorTotalMaxVenda) {
                codigoProdutoMaxVenda = codigoProduto;
                quantidadeMaxVenda = quantidade;
                valorTotalMaxVenda = valorTotal;
            }

            if (valorTotal < valorTotalMinVenda) {
                codigoProdutoMinVenda = codigoProduto;
                quantidadeMinVenda = quantidade;
                valorTotalMinVenda = valorTotal;
            }

            // Calcular o valor médio
            valorMedioVendido = valorTotalVendido / i;

            // Mostrar o valor total da venda
            System.out.println("Valor Total da Venda #" + i + ": " + valorTotal);
        }

        // Mostrar os resultados finais
        System.out.println("\nResumo das Vendas:");
        System.out.println("Valor Médio Vendido: " + valorMedioVendido);
        System.out.println("Produto com Maior Venda:");
        System.out.println("Código do Produto: " + codigoProdutoMaxVenda);
        System.out.println("Quantidade: " + quantidadeMaxVenda);
        System.out.println("Valor Total: " + valorTotalMaxVenda);
        System.out.println("Produto com Menor Venda:");
        System.out.println("Código do Produto: " + codigoProdutoMinVenda);
        System.out.println("Quantidade: " + quantidadeMinVenda);
        System.out.println("Valor Total: " + valorTotalMinVenda);
        System.out.println("Valor Total Vendido: " + valorTotalVendido);
        System.out.println("Quantidade Total de Itens Vendidos: " + quantidadeTotalItensVendidos);

        scanner.close();
    }
}
