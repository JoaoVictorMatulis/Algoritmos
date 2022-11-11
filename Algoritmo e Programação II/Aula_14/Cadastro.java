package Aula_14;

import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionarios serão registrados?"));
        Funcionarios[] func = new Funcionarios[qtd];

        for (int i = 0; i < func.length; i++) {
            func[i] = new Funcionarios();
            criarFuncionairo(func[i]);
        }
        double maior = 0;
        int contador = 0;
        double media = 0;
        int indice = 0;
        for (int i = 0; i < func.length; i++) {
            media += func[i].getSalario();
            if (func[i].getSalario() > maior) {
                maior = func[i].getSalario();
                indice = i;
            }
            if (func[i].getSalario() < 850) {
                contador++;
            }
        }
        System.out.println("Média dos salários: " + (media = media / qtd) +
                "Fúncionario com maior salário: " + func[indice].getNome() +
                "\nMaior salário: " + maior +
                "\nSalários menores que R$850.00: " + contador);
    }

    public static void criarFuncionairo(Funcionarios funcionario) {
        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario:"));
        funcionario.setSalario(Double.parseDouble(
                JOptionPane.showInputDialog("Digite o salário do funcionario " + funcionario.getNome() + ":")));
    }
}
