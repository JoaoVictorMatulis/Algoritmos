package Aula_9;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] vetor = { 4, 5, 7, 1, 3, 8, 2, 9, 1, 2, 3, 2, 1, 5, 8, 9, 6, 4, 7, 100 };
        int[] auxiliar = new int[vetor.length];

        mergeSort(vetor, auxiliar, 0, vetor.length - 1);

        System.out.println(Arrays.toString(vetor));
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
}