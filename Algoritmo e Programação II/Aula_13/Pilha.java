package Aula_13;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Pilha {
    private int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho dessa pilha?"));
    private char[] elementos = new char[tamanho];
    private int topo = -1;

    @Override
    public String toString() {
        return "\nPilha [elementos=" + Arrays.toString(elementos) + "]";
    }

    public int getTamanho() {
        return elementos.length;
    }

    public int getTopo() {
        return topo;
    }

    public void push(char elemento) {
        if (topo < elementos.length) {
            topo++;
            elementos[topo] = elemento;
        }
    }

    public char pop() {
        char elemento = elementos[topo];
        topo--;
        return elemento;
    }
}