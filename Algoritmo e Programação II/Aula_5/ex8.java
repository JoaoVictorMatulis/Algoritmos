package Aula_5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos alunos serão dados as notas?");
        int tamanho = leitor.nextInt();
        String[] nome = new String[tamanho];
        float[] notaP1 = new float[tamanho];
        float[] notaP2 = new float[tamanho];
        float[] media = new float[tamanho];
        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite o nome do primeiro aluno: ");
            nome[i] = leitor.next();
            System.out.printf("Digite a nota P1 do aluno: %s\n", nome[i]);
            notaP1[i] = leitor.nextInt();
            System.out.printf("Digite a nota P2 do aluno: %s\n", nome[i]);
            notaP2[i] = leitor.nextInt();
            media[i] = (notaP1[i] + notaP2[i]) / 2;
        }
        for (int i = 0; i < media.length; i++) {
            if (media[i] > 5) {
                System.out.printf("\nO aluno: %s\nEstá aprovado\n", nome[i]);
            } else {
                System.out.printf("\nO aluno: %s\nEstá reprovado\n", nome[i]);
            }
        }
    }
}
