package Aula_14;

import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos vendedores trabalharam hoje?"));
        int[] vendedor = new int[qtd];
        int[] quantidade = new int[qtd];
        String[] nome = new String[qtd];
        double[] preco = new double[qtd];
        double[] valorTotalvend = new double[qtd];
        for (int i = 0; i < vendedor.length; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite seu Nome:");
        }
        int qtdTotal = 0;
        double valorTotal = 0;
        for (int i = 0; i < nome.length; i++) {
            quantidade[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do vendedor " + nome[i]));
            preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite por quanto você vendeu cada peça:"));
            qtdTotal += quantidade[i];
            valorTotalvend[i] = quantidade[i] * preco[i];
            valorTotal += valorTotalvend[i];
        }
        System.out.println("Quantidade total vendida por todos os vendedores: " + qtdTotal);
        System.out.println("Valor total ganho pelas vendas: " + valorTotal);
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Valor total vendido pelo vendedor " + nome[i] + ": " + valorTotalvend[i]);
        }
    }
}
