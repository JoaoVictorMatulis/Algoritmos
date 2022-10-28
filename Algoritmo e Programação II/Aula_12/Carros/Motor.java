package Aula_12.Carros;

public class Motor {
    int potencia;
    // tipo eletrico e combustivel
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor [potencia=" + potencia + ", tipo=" + tipo + "]";
    }
}
