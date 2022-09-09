package Aula_5;

import java.util.Random;
import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual será o tamanho desse vetor?"));
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            int verificador = 0;
            do {
                verificador = aleatorio.nextInt(20) + 1;
            } while (verificador % 2 != 0);
            vetor[i] = verificador;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        int numeroAchar = Integer.parseInt(JOptionPane.showInputDialog("Qual número você gostaria de achar?"));
        int achei = procurarNumero(numeroAchar, vetor);
        if (achei >= 0) {
            System.out.printf("\nO número %d foi achado no índice: %d\n", numeroAchar, achei);
        } else {
            System.out.println("\nNão foi possível achar esse número");
        }
    }

    static int procurarNumero(int numeroAchar, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroAchar) {
                return i;
            }
        }
        return -1;
    }
}

/*
 * public static void main(String[] args) {
 * int num = 2;
 * int[] vetor = new int[10];
 * for (int i = 0; i < vetor.length; i++) {
 * vetor[i] = num;
 * num += 2;
 * }
 * for (int i = 0; i < vetor.length; i++) {
 * System.out.printf("[%d] ", vetor[i]);
 * }
 * }
 */