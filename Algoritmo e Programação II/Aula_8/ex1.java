package Aula_8;

public class ex1 {
    public static void main(String[] args) {
        imprimirRecursivo(10);
    }

    public static void imprimirRecursivo(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        imprimirRecursivo(num - 1);
    }

    public static void imprimir(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(num);
            num--;
        }
    }
}
