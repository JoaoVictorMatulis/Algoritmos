package Aula_5;

import javax.swing.JOptionPane;

public class ex5 {
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
    }
}

/*
 * import javax.swing.JOptionPane;
 * public class ExercicioRevVetorNomes {
 * public static void main(String[] args) {
 * String vetor[] = new String[3];
 * for(int i=0 ; i<vetor.length ; i++) {
 * do {
 * vetor[i] = JOptionPane.showInputDialog
 * ("Digite um nome com no máximo 20 letras:");
 * }while(vetor[i].length()>20);
 * System.out.println(vetor[i] + " ");
 * }
 * }
 * }
 */