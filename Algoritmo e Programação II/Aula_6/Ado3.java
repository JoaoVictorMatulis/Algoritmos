package Aula_6;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ado3 {

    static Random random = new Random();

    public static void main(String[] args) {
        int tamanho = Integer
                .parseInt(JOptionPane.showInputDialog("Quantos jogos você vai fazer?\n(Minimo:  15, Maximo: 19)"));
        if (tamanho < 15 || tamanho > 19) {
            do {
                tamanho = Integer.parseInt(JOptionPane.showInputDialog(
                        "Quantidade de jogos invalida\nDigite quantos jogos vai fazer\n(Minimo:  15, Maximo: 19)"));
            } while (tamanho < 15 || tamanho > 19);
        }
        int[] numeros = escolherNumeros(tamanho);
        int[] sorteados = numerosSorteados();
        int pontos = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int l = 0; l < sorteados.length; l++) {
                if (numeros[i] == sorteados[l]) {
                    pontos++;
                }
            }
        }
        for (int v : numeros) {
            System.out.print(v + ", ");
        }
        System.out.println(" ");
        for (int v : sorteados) {
            System.out.print(v + ", ");
        }
        System.out.printf("Você acertou %d números", pontos);
    }

    public static int[] escolherNumeros(int tamanho) {
        int[] numeros = new int[tamanho];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número de 1 a 25"));
            if (numEscolhido < 1 || numEscolhido > 25) {
                do {
                    numEscolhido = Integer
                            .parseInt(JOptionPane.showInputDialog("Escolha ínvalida\nEscolha um número de 1 a 25"));
                } while (numEscolhido < 1 || numEscolhido > 25);
            }
            if (contador > 0) {
                for (int v = 0; v < numeros.length; v++) {
                    if (numEscolhido == numeros[v] && v != i) {
                        do {
                            numEscolhido = Integer.parseInt(JOptionPane
                                    .showInputDialog("Você já escolheu esse número\nPor favor escolha outro"));
                        } while (numEscolhido == numeros[v]);
                    }
                }
            }
            numeros[i] = numEscolhido;
            contador++;
        }
        return numeros;
    }

    static int[] numerosSorteados() {
        int[] numSorteados = new int[15];
        int contador = 0;
        for (int i = 0; i < numSorteados.length; i++) {
            int sorteador = random.nextInt(25) + 1;
            if (contador > 0) {
                for (int v = 0; v < numSorteados.length; v++) {
                    if (sorteador == numSorteados[v] && v != i) {
                        do {
                            sorteador = random.nextInt(25) + 1;
                        } while (sorteador == numSorteados[v]);
                    }
                }
            }
            numSorteados[i] = sorteador;
            contador++;
        }
        return numSorteados;
    }
}
