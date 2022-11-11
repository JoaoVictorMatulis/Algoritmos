package Aula_14;

import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos salários serão registrados?"));
        float[] salarios = new float[qtd];
        float maior = 0;
        int contador = 0;
        float media = 0;
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º salario"));
            media += salarios[i];
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < 850) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Média dos salários: " + (media = media / qtd) + "\nMaior salário: " + maior
                + "\nSalários menores que R$850.00: " + contador);
    }
}