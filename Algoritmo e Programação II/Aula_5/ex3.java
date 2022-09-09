package Aula_5;

public class ex3 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++)
            vetor[i] = (i + 10);
        for (int num : vetor)
            System.out.print(num + " ");
    }
}
