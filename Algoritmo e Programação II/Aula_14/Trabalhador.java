package Aula_14;

public class Trabalhador {
    private String nome;
    private char genero;
    private double salario;

    @Override
    public String toString() {
        return "Trabalhador [nome=" + nome + ", genero=" + genero + ", salario=" + salario + "]";
    }

    public Trabalhador() {

    }

    public Trabalhador(String nome, char genero, double salario) {
        this.nome = nome;
        this.genero = genero;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
