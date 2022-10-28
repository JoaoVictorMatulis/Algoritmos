package Aula_12.Carros;

import javax.swing.JOptionPane;

class TestaCarro {
    public static void main(String[] args) {
        int qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carro a cadastrar"));
        Carro[] carros = new Carro[qt];

        for (int i = 0; i < carros.length; i++) {
            Motor motor = new Motor();
            motor.setTipo(JOptionPane.showInputDialog("Qual o motor do carro?\n(Eletrico ou combustível)"));
            motor.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Qual a potencia do motor?")));
            Carro meuCarro = new Carro();
            meuCarro.cor = JOptionPane.showInputDialog("Qual a cor do carro?");
            meuCarro.modelo = JOptionPane.showInputDialog("Qual o modelo do carro?");
            meuCarro.velocidadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade atual"));
            meuCarro.velocidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade maxima"));

            // liga o carro
            meuCarro.liga();

            // acelera o carro
            meuCarro.acelera(20);
            System.out.println(meuCarro.velocidadeAtual);
            carros[i] = meuCarro;
        }
        for (int i = 0; i < qt; i++) {
            System.out.println(carros[i]);
        }
    }
}