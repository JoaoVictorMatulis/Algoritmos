package Aula_14;

import javax.swing.JOptionPane;

public class CadastroTrabalho {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de trabalhadores: "));
        Trabalhador[] trab = new Trabalhador[qtd];
        for (int i = 0; i < qtd; i++) {
            trab[i] = new Trabalhador();
            cadastro(trab[i], i);
        }
        for (int i = 0; i < qtd; i++) {
            System.out.println(trab[i].toString());
        }
    }

    public static void cadastro(Trabalhador trab, int ind) {
        trab.setNome(JOptionPane.showInputDialog("Digite o " + (ind + 1) + "º nome:"));
        trab.setGenero(JOptionPane.showInputDialog("Digite o Genero desse funcionario\n(M = masculino, F = feminino)")
                .charAt(0));
        trab.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário desse funcionario:")));
    }
}
