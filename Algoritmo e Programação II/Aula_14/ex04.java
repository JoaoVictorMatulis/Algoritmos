package Aula_14;

import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de trabalhadores: "));
        String[][] trabalhadores = new String[qtd][3];
        int media = 0;
        int contadorf = 1;
        double menor = Integer.MAX_VALUE;
        int indice = 0;
        int contador = 0;
        for (int i = 0; i < qtd; i++) {
            trabalhadores[i][0] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º trabalhador");
            trabalhadores[i][1] = JOptionPane.showInputDialog(
                    "Digite o gênero do trabalhador " + trabalhadores[i][0] + ": \n(M = masculino, F = feminino)");
            trabalhadores[i][2] = JOptionPane
                    .showInputDialog("Digite quanto ganha o trabalhador " + trabalhadores[i][0] + ": ");

            if (trabalhadores[i][1].equals("F") || trabalhadores[i][1].equals("f")) {
                media += Integer.parseInt(trabalhadores[i][2]);
                contadorf++;
            }
            if (trabalhadores[i][1].equals("M")
                    || trabalhadores[i][1].equals("m") && Double.parseDouble(trabalhadores[i][2]) > 1000) {
                contador += 1;
            }

            if (Integer.parseInt(trabalhadores[i][2]) < menor) {
                menor = Double.parseDouble(trabalhadores[i][2]);
                indice = i;
            }
        }
        System.out.println("Média de sálario das mulheres: " + (media = media / contadorf) +
                "\nNúmero de Homens que ganham mais de R$1000.00: " + contador +
                "\nTrabalhador com menor sálario da empresa:\nNome: " + trabalhadores[indice][0] + "\nGênero: "
                + trabalhadores[indice][1] + "\nSálario: " + trabalhadores[indice][2]);
    }
}
