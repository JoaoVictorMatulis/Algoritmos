package Aula_9;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desse vetor"))];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }
        int[] auxiliar = new int[vetor.length];
        mergeSort(vetor, auxiliar, 0, vetor.length - 1);
        int achar = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Qual numero você quer achar?\n" + Arrays.toString(vetor)));
        achar = buscaBinario(vetor, achar);
        if (achar != -1) {
            JOptionPane.showMessageDialog(null, "Número encontrado no índice: " + achar);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível achar esse número");
        }
    }

    private static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio + 1, fim);
            intercalar(vetor, auxiliar, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }
        int esq = inicio;
        int dir = meio + 1;

        for (int i = inicio; i <= fim; i++) {
            if (esq > meio) {
                vetor[i] = auxiliar[dir++];
            } else if (dir > fim) {
                vetor[i] = auxiliar[esq++];
            } else if (auxiliar[esq] < auxiliar[dir]) {
                vetor[i] = auxiliar[esq++];
            } else {
                vetor[i] = auxiliar[dir++];
            }
        }
    }

    public static int buscaBinario(int v[], int x) {
        int i, m, f;
        i = 0;
        f = v.length - 1;
        while (i <= f) {
            m = (i + f) / 2;
            if (v[m] == x) {
                return m;
            }
            if (x < v[m]) {// esquerda
                f = m - 1;
            } else {// direita
                i = m + 1;
            }
        }
        return -1;
    }
}
