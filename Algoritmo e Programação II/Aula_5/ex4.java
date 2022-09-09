package Aula_5;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vetor = new int[8];
        int contador = 0;
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(50);
            if (vetor[i] > 30) {
                soma += vetor[i];
                contador++;
            }
        }
        int contador2 = 1;
        System.out.printf("Foi encontrado %d números maiores que 30\nEsse número foram: ", contador);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 30) {
                if (contador == contador2) {
                    System.out.print(vetor[i] + ".");
                } else {
                    System.out.print(vetor[i] + ", ");
                }
                contador2++;
            }
        }
        System.out.println("\nA soma desse número é de: " + soma);
    }
}
