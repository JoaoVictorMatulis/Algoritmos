package Aula_13;

import javax.swing.JOptionPane;

public class CriarPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        int escolha;
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n(1)Adicionar um caracter na Pilha\n(2)Remover um valor da Pilha\n(3)Vericar a pilha para String\n(4)Parar o Programa"));
            switch (escolha) {
                case 1:
                    adicionarElemento(pilha);
                    break;
                case 2:
                    removerElemento(pilha);
                    break;

                case 3:
                    System.out.println(pilha.toString());
                    break;
                case 4:
                    break;
            }
        } while (escolha != 4);
    }

    public static void adicionarElemento(Pilha pilha) {
        if (pilha.getTopo() < pilha.getTamanho() - 1) {
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
                    "Quantos caracteres quer adicionar na pilha?\n(quantidade maxima: " + pilha.getTamanho()
                            + ")"));
            if (quantidade <= pilha.getTamanho()) {
                while (quantidade != 0) {
                    pilha.push(JOptionPane.showInputDialog("Insira o charactere").charAt(0));
                    quantidade--;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilha cheia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilha cheia");
        }
    }

    public static void removerElemento(Pilha pilha) {
        if (pilha.getTopo() > -1) {
            int qtd = Integer.parseInt(JOptionPane.showInputDialog(
                    "Quantos caracteres quer remover da pilha?\n(quantidade maxima: "
                            + (pilha.getTopo() + 1) + ")"));
            do {
                if (qtd <= pilha.getTamanho()) {
                    while (qtd != 0) {
                        pilha.pop();
                        qtd--;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade inválida");
                    qtd = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantos caracteres quer remover da pilha?\n(quantidade maxima: "
                                    + (pilha.getTopo() + 1) + ")"));
                }
            } while (qtd > pilha.getTamanho());
        } else {
            JOptionPane.showMessageDialog(null, "Pilha vazia");
        }
    }
}