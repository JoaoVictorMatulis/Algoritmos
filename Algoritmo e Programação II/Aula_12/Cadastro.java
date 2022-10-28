package Aula_12;

import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Senac senac = new Senac("Senac", aluno);
        senac.aluno = aluno;

        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno:"));
        aluno.setRA(Integer.parseInt(JOptionPane.showInputDialog("Digite Seu ra:")));
        aluno.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Digite Sua 1º nota:")));
        aluno.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Digite Sua 2º nota:")));
        aluno.setFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite o total de faltas:")));
        aluno.setStatus(aluno);
        System.out.println(senac);
    }
}