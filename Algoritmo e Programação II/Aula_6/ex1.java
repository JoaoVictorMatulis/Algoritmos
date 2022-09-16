package Aula_6;

import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desse vetor"))];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        }
        for (int v : vetor) {
            System.out.print(v + ", ");
        }
        insertionSort(vetor);
    }

    public static void insertionSort(int[] vetor) {
        int contador = 0;
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            int x = vetor[j];
            while (j > 0 && x < vetor[j - 1]) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = x;
            contador++;
        }
        for (int v : vetor) {
            System.out.print(v + ", ");
        }
        System.out.println(contador);
    }
}
