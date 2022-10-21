package Aula_10;

import javax.swing.JOptionPane;

public class CriarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Cliente c = new Cliente();
        conta1.titular = c;
        conta2.titular = c;
        // Criação das Contas
        criarConta(conta1);
        criarConta(conta2);

        // Apresentar os Dados das contas
        apresentacaoDados(conta1);
        apresentacaoDados(conta2);

        // fazer uma transferencia de uma conta para outra
        conta1.transferir(conta2, Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da transferencia")));

    }

    public static void criarConta(Conta conta) {
        conta.titular.setNome(JOptionPane.showInputDialog("Digite o nome do titular da Conta:"));

        conta.titular.setSobrenome(JOptionPane.showInputDialog("Digite Seu sobre nome:"));

        conta.titular.setCPF(JOptionPane.showInputDialog("Digite Seu sobre CPF:"));

        conta.setSaldo(Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo:")));

        conta.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Conta:")));

        int escolha = Integer.parseInt(
                JOptionPane.showInputDialog("Gotaria de fazer alguma função?\n(1)Sacar\n(2)Depositar\n(3)Fazer Nada"));

        switch (escolha) {
            case 1:
                conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite quanto você quer sacar: ")));
                break;
            case 2:
                conta.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite quanto você quer depositar: ")));
                break;
            case 3:
                return;
        }
    }

    public static void apresentacaoDados(Conta conta) {
        // Apresentação dos dados da Conta:
        System.out.println("\nDados da conta: " +
                conta.titular.toString() +
                "\nSaldo: " + conta.getSaldo());
    }
}
