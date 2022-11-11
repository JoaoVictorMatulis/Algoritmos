package Aula_14;

public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios() {

    }

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Nome do funcionario: " + this.nome + "\nSalário: " + this.salario;
    }
}
