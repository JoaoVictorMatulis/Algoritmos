package Aula_4;

import java.util.Random;
import java.util.Scanner;

public class Roleta {

    static Scanner leitor = new Scanner(System.in);
    static double saldo = 120000.00;

    public static void main(String[] args) {
        System.out.println("================== Bem vindo a Roleto do Jão ==================");
        System.out.println("Escolha o modo de jogo:\n(1) Roleta");
        int modoJogo = leitor.nextInt();
        switch (modoJogo) {
            case 1:
                escolhaNumeroAposta();
                break;
        }

    }

    public static void escolhaNumeroAposta() {
        System.out.println("\nEm quantos números você quer aposta?");
        int numeroApostas = leitor.nextInt();
        int[] numerosEscolhidos = new int[numeroApostas];
        int[] quantidadeDinheiroAposta = new int[numeroApostas];
        int contador = 1;
        for (int i = 0; i < numerosEscolhidos.length; i++) {
            System.out.println("\nEscolha um número de 1 a 36 para sua aposta!");
            numerosEscolhidos[i] = leitor.nextInt();
            int verificador = numerosEscolhidos[i];
            if (contador > 1) {
                for (int l = 0; l < numerosEscolhidos.length; l++) {
                    if (numerosEscolhidos[i] == verificador) {
                        System.out.println(
                                "Você já escolheu esse número, por favor escolha uma das seguintes opções.\n(1)Trocar valor de aposta desse número\n(2)Escolher outro número");
                        int escolha = leitor.nextInt();
                    }
                }
            }
            contador++;
            System.out.println(
                    "\nSaldo Atual:" + saldo + "\nQuanto você que apostar no numero " + numerosEscolhidos[i] + "?");
            quantidadeDinheiroAposta[i] = leitor.nextInt();
            saldo -= quantidadeDinheiroAposta[i];
        }
    }

    public static int numeroAleatorio() {
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(37);
        return aleatorio;
    }

}