
/*Nome: JoÃo Victor Matulis
  Proposta: Escrever uma funÃ§Ã£o que recebe uma matriz quadrada Anxn e retorna true se a matriz for um quadrado mÃ¡gico e false caso contrÃ¡rio
*/
import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        if (cuboMagico(criarMatriz()) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static int[][] criarMatriz() {
        int ordem = Integer.parseInt(JOptionPane.showInputDialog("Digite a dimensão da Matriz: "));
        int[][] A = new int[ordem][ordem];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
        return A;
    }

    static boolean cuboMagico(int[][] matrizA) {

        int diagonalP = 0;
        int diagonalS = 0;
        for (int i = 0; i < matrizA.length; i++) {
            diagonalP += matrizA[i][i];
            diagonalS += matrizA[i][matrizA.length - 1 - i];
        }

        int linha1 = 0;
        int linha2 = 0;
        int linha3 = 0;
        for (int l = 0; l < matrizA.length - 1; l++) {
            for (int c = 0; c < matrizA[0].length; c++) {
                linha1 += matrizA[l][c];
                linha2 += matrizA[l + 1][c];
            }
            if (linha1 != linha2) {
                return false;
            } else {
                linha3 = linha1;
            }
            linha1 = 0;
            linha2 = 0;
        }

        int coluna1 = 0;
        int coluna2 = 0;
        int coluna3 = 0;
        for (int c = 0; c < matrizA[0].length - 1; c++) {
            for (int l = 0; l < matrizA.length; l++) {
                coluna1 += matrizA[l][c];
                coluna2 += matrizA[l][c + 1];
            }
            if (coluna1 != coluna2) {
                return false;
            } else {
                coluna3 = coluna1;
            }
            coluna1 = 0;
            coluna2 = 0;
        }

        if (coluna3 == linha3 && coluna3 == diagonalP && coluna3 == diagonalS) {
            return true;
        } else {
            return false;
        }
    }
}