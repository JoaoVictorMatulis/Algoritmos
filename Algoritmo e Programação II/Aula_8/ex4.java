package Aula_8;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite qual número você quer na forma binaria:"));
        int num2 = num;
        int tamanho = 0;
        while (num2 > 0) {
            num2 = num2 / 2;
            tamanho++;
        }
        int[] vetor = new int[tamanho];
        vetor = binario(num, vetor);
        for (int v : vetor) {
            System.out.printf("[%d] ", v);
        }
    }

    public static int[] binario(int num, int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            if (num % 2 == 0) {
                vetor[i] = 0;
                num = (int) (num / 2);
            } else {
                vetor[i] = 1;
                num = (int) (num / 2);
            }
        }
        return vetor;
    }
}
