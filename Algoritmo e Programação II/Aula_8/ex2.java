package Aula_8;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int[] num = new int[Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer imprimir?"))];
        System.out.println("Forma Interativa:");
        fibonacci(num);
        int anterior = 0;
        int atual = 1;
        int auxiliar = 0;
        int i = 0;
        System.out.println(" ");
        System.out.println("Forma Recursiva:");
        fibonacciRecursivo(num, anterior, atual, auxiliar, i);
    }

    public static void fibonacciRecursivo(int[] num, int anterior, int atual, int auxiliar, int i) {
        if (i == num.length) {
            return;
        }
        num[i] = anterior;
        auxiliar = atual;
        atual += anterior;
        anterior = auxiliar;
        System.out.printf("[%d] ", num[i]);
        i++;
        fibonacciRecursivo(num, anterior, atual, auxiliar, i);
    }

    public static void fibonacci(int[] num) {
        int anterior = 0;
        int atual = 1;
        int auxiliar = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = anterior;
            auxiliar = atual;
            atual += anterior;
            anterior = auxiliar;

        }
        for (int v : num) {
            System.out.printf("[%d] ", v);
        }
    }
}

/*
 * import javax.swing.JOptionPane;
 * public class Fibonacci {
 * public static void main (String[] args) {
 * int n = Integer.parseInt(JOptionPane.
 * showInputDialog("Digite a quantidade de números fibonacci a gerar"));
 * for(int i = 0; i<=n; i++) {
 * System.out.print(gerarFibonacci(i)+ " ");
 * }
 * }
 * public static int gerarFibonacci(int n) {
 * if(n == 0){
 * return 0;
 * }
 * else if(n == 1) {
 * return 1;
 * }
 * else {
 * return (gerarFibonacci(n-1) + gerarFibonacci(n-2));
 * }
 * }
 * }
 * 
 * 
 */