package Aula_5;

import javax.swing.JOptionPane;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual será o tamanho desse vetor?"));
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(2);
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
 * package aulasAlgProg2.set08;
 * import javax.swing.JOptionPane;
 * public class ExercicioRev1 {
 * public static void main(String[] args) {
 * int qtd = Integer.parseInt(JOptionPane.showInputDialog
 * ("Digite o tamanho do vetor:"));
 * int vetor[] = new int[qtd];
 * int localizou = -1;
 * preencherVetor(vetor);
 * int num=Integer.parseInt(JOptionPane.showInputDialog
 * ("Digite o número a pesquisar:"));
 * localizou = localizarNumero(vetor, num);
 * if(localizou != -1)
 * {
 * System.out.print("\nNúmero localizado no índice: " + localizou);
 * }
 * else
 * System.out.print("\nNúmero não localizado no vetor!!!");
 * 
 * }
 * 
 * public static int localizarNumero(int vetor[], int num)
 * {
 * for(int i=0 ; i<vetor.length ; i++) {
 * if(num==vetor[i]) {
 * localizou =i;
 * return localizou;
 * }
 * }
 * return localizou;
 * }
 * 
 * public static void preencherVetor(int vetor[])
 * {
 * //preenchendo o vetor com números de 0 a vinte
 * for(int i=0 ; i<vetor.length ; i++) {
 * vetor[i] = (int)(Math.random()*20);
 * System.out.print(vetor[i] + " ");
 * }
 * }
 * }
 * 
 */