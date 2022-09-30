package Aula_8;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite qual número você quer fazer a potencia: "));
        int pot = Integer.parseInt(JOptionPane.showInputDialog("Digite a potencia desse número: "));
        System.out.println("Forma Interativa:");
        int num2 = potencia(num, pot);
        System.out.printf("A potencia do número %d elevado a %d é de : %d\n", num, pot, num2);
        System.out.println("Forma Recursiva:");
        num2 = num;
        System.out.printf("A potencia do número %d elevado a %d é de : %d\n", num, pot,
                potenciaRecursiva(num, pot, num2));
    }

    public static int potencia(int num, int pot) {
        int num2 = num;
        if (pot == 0) {
            num = 1;
        }
        for (int i = 0; i < pot - 1; i++) {
            num *= num2;
        }
        return num;
    }

    public static int potenciaRecursiva(int num, int pot, int num2) {
        if (pot == 0) {
            return 1;
        }
        if (pot == 1) {
            return num;
        }
        pot--;
        return potenciaRecursiva(num * num2, pot, num2);
    }
}
