package Aula_12.Carros;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

    // liga o carro
    void liga() {
        System.out.println("O carro está ligado");
    }

    // acelera uma certa quantidade
    void acelera(double quantidade) {
        this.velocidadeAtual += quantidade;
    }

    // devolve a marcha do carro
    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\nCor: " + cor + "\n" + motor;
    }
}
