import javax.swing.JOptionPane;
import java.util.Random;

public class OrdenarPar {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desse vetor: "))];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }
        int numeroAchar = Integer.parseInt(JOptionPane.showInputDialog("Qual número gostaria de achar?"));
        bubbleSort(vetor, numeroAchar);

        // For Each
        for (int v : vetor) {
            System.out.print(v + ", ");
        }
    }

    public static int bubbleSort(int[] vetor, int numeroAchar) {
        int aux = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] % 2 == 1) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        int numero = ordenarParImpar(vetor, numeroAchar);
        return numero;
    }

    public static int ordenarParImpar(int[] vetor, int numeroAchar) {
        int contador = 0;
        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int i = contador; i < vetor.length - 1; i++) {
            for (int j = contador; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        int i, m, f;
        if (numeroAchar % 2 == 0) {
            i = 0;
            f = vetor.length - 1;
            while (i <= f) {
                m = (i + f) / 2;
                if (vetor[m] == numeroAchar) {
                    return m;
                }
                if (numeroAchar < vetor[m]) {// esquerda
                    f = m - 1;
                } else {// direita
                    i = m + 1;
                }
            }
            return -1;
        } else {
            i = 0;
            f = vetor.length - 1;
            while (i <= f) {
                m = (i + f) / 2;
                if (vetor[m] == numeroAchar) {
                    return m;
                }
                if (numeroAchar < vetor[m]) {// esquerda
                    f = m - 1;
                } else {// direita
                    i = m + 1;
                }
            }
            return -1;
        }
    }
}