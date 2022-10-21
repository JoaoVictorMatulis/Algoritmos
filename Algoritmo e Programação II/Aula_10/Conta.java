package Aula_10;

import javax.swing.JOptionPane;

public class Conta {

    private double saldo;
    private int numero;
    Cliente titular;

    /*
     * public String getTitular() {
     * return titular;
     * }
     * 
     * public void setTitular(String titular) {
     * this.titular = titular;
     * }
     */

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    void sacar(double valor) {
        if (saldo < valor) {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    void transferir(Conta destino, double valor) {
        if (saldo > valor) {
            this.saldo -= valor;
            destino.saldo = destino.saldo + valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }

    }
}
