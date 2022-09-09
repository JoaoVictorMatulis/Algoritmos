import javax.swing.JOptionPane;
import java.util.Random;

public class OrdenaçãoVetor {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desse vetor: "))];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        // For Each
        for (int v : vetor) {
            System.out.print(v + ", ");
        }

        int x = Integer.parseInt(JOptionPane.showInputDialog("Qual numero gostaria de procurar nesse vetor?"));
        int num = buscaBinario(bubbleSort(vetor), x);
        if (num != -1) {
            System.out.println("Numero encontrado no índice: " + num);
        } else {
            System.out.println("Não foi possível achar esse número");
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

    public static int[] bubbleSort(int[] vetor) {
        int aux = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        return vetor;
    }

}
/*
 * class OrdenaVetor{
 * public static void main(String ar[]){
 * int qtd = Integer.parseInt(JOptionPane.showInputDialog(“Digite o tamanho do
 * vetor”));
 * int vetor[] = new int[qtd];
 * for(int i=0 ; i<vetor.length ; i++)
 * vetor[i] = (int) (Math.random()*20);
 * bubbleSort (vetor);
 * for(int v : vetor)
 * System.out.print(v + “ ”);
 * }
 * 
 * public static void bubbleSort (int [] vetor) {
 * int aux = 0;
 * // Fase de Ordenação
 * for (int i = 0; i < vetor.length - 1; i++) {
 * for (int j = 0; j < vetor.length - i - 1; j++) {
 * // Troca dos Elementos
 * if (vetor[j] > vetor[j+1]) {
 * aux = vetor[j];
 * vetor[j] = vetor[j+1];
 * vetor[j+1] = aux;
 * }
 * }
 * }
 * }
 * }
 */