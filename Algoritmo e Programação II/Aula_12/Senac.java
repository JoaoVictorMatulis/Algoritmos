package Aula_12;

public class Senac {
    private String nome;
    Aluno aluno;

    public Senac(String nome, Aluno aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public Senac() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Faculdade: " + nome + "\n\nDados do Aluno:\n\n" + aluno.toString();
    }
}
