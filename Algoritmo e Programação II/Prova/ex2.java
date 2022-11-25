import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String args[]){
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual vai ser o tamanho desse vetor?"));
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            vetor[i] = num;
        }

        System.out.println("Vetor Desorganizado:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print("["+vetor[i]+"] ");
        }
        
        insertionSort(vetor);
        System.out.println("");
        System.out.println("Vetor Organizado Após Insertion Sort: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print("["+vetor[i]+"] ");
        }
        System.out.println("");
        int buscar = buscaBinario(vetor, Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser procurado")));
        if (buscar != -1) {
            System.out.println("Numero encontrado no índice: " + buscar);
        } else {
            System.out.println("Não foi possível achar esse número");
        }
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            int x = vetor[j];
            while (j > 0 && x < vetor[j - 1]) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = x;
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