package Aula_12;

public class Aluno {
    private String nome;
    private int ra;
    private double nota1;
    private double nota2;
    private String status;
    private float faltas;
    private float faltaPorcentagem;

    public Aluno() {

    }

    public Aluno(String nome, int ra, double nota1, double nota2, String status, float faltas) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.status = status;
        this.faltas = faltas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return ra;
    }

    public void setRA(int ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(Aluno aluno) {
        if (aprovar(aluno)) {
            status = "aprovado";
        } else {
            status = "reprovado";
        }
    }

    public float getFaltas() {
        return faltas;
    }

    public void setFaltas(float faltas) {
        this.faltas = faltas;
        faltaPorcentagem = faltas / 18;
    }

    public boolean aprovar(Aluno aluno) {
        if ((nota1 + nota2) / 2 >= 6 && faltaPorcentagem < 0.25) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "\nRA: " + ra + "\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nFaltas: " + faltas
                + "\nStatus: " + status;
    }
}
