package Aula_6;

import javax.swing.JOptionPane;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desse vetor"))];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        for (int v : vetor) {
            System.out.print(v + ", ");
        }

        int achar = Integer.parseInt(JOptionPane.showInputDialog("Qual número gostaria de achar?"));

        achar = insertionSort(vetor, achar);

        if (achar != -1) {
            System.out.println("\nNúmero achado no índice: " + achar);
        } else {
            System.out.println("\nNão foi possível achar esse número");
        }
    }

    public static int insertionSort(int[] vetor, int achar) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            int x = vetor[j];
            while (j > 0 && x < vetor[j - 1]) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = x;
        }

        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            int x = vetor[j];
            while (j > 0 && x % 2 == 1) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = x;
        }

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                contador++;
            }
        }

        for (int i = 1; i < contador; i++) {
            int j = i;
            int x = vetor[j];
            while (j > 0 && x < vetor[j - 1]) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = x;
        }

        System.out.println("\n");

        for (int v : vetor) {
            System.out.print(v + ", ");
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == achar) {
                return i;
            }
        }
        return -1;
    }
}
