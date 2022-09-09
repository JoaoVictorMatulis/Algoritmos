package Aula_5;

import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        for (int i = 0; i < nomes.length; i++) {
            String nome = JOptionPane.showInputDialog("Digite seu nome em até 20 caracteres: ");
            if (nome.length() > 20) {
                do {
                    nome = JOptionPane.showInputDialog("Erro  Digite seu nome em até 20 caracteres: ");
                } while (nome.length() > 20);
            } else {
                nomes[i] = nome;
            }
        }
        System.out.print("Nomes registrados: ");
        for (int i = 0; i < nomes.length; i++) {
            if (i == 2) {
                System.out.print(nomes[i] + ".");
            } else {
                System.out.print(nomes[i] + ", ");
            }
        }
        int contadorA = 0;
        int contadorE = 0;
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length(); j++) {
                char c = nomes[i].charAt(j);
                if (c == 'A' || c == 'a') {
                    contadorA++;
                }
                if (c == 'E' || c == 'e') {
                    contadorE++;
                }
            }
            System.out.printf("\nNo nome %s, tem %d A e tem %d E\n", nomes[i], contadorA, contadorE);
            contadorA = 0;
            contadorE = 0;
        }
    }
}
/*
 * public class Exercicio7Nomes {
 * public static void main(String[] args) {
 * String vetor[] = new String[3];
 * int totalA=0, totalE=0;
 * for(int i=0 ; i<vetor.length ; i++) {
 * vetor[i] = JOptionPane.showInputDialog
 * ("Digite um nome:");
 * }
 * for(int i=0 ; i<vetor.length ; i++) {
 * totalA=0;
 * totalE=0;
 * for(int n=0 ; n<vetor[i].length() ; n++) {
 * if(vetor[i].charAt(n)== 'A' || vetor[i].charAt(n)=='a')
 * totalA++;
 * else if(vetor[i].charAt(n) == 'E' || vetor[i].charAt(n)=='e')
 * totalE++;
 * }
 * System.out.print("\nO nome " + vetor[i] + " tem "
 * + totalA + " letra(s) A e "
 * + totalE + " letra(s) E");
 * }
 * }
 * }
 */