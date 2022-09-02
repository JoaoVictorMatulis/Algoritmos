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
        for (int i = 0; i < numerosEscolhidos.length; i++) {
            System.out.println("\nEscolha um número de 1 a 36 para sua aposta!");
            numerosEscolhidos[i] = leitor.nextInt();
            if (numerosEscolhidos[i] <= 0 || numerosEscolhidos[i] > 36) {
                do {
                    System.out.println("\nNúmero escolhido inválido!\n por favor escolha um número de 1 a 36.\n");
                    numerosEscolhidos[i] = leitor.nextInt();
                } while (numerosEscolhidos[i] <= 0 || numerosEscolhidos[i] > 36);
            }
            int verificador = numerosEscolhidos[i];
            int escolha = 2;
            int contador = 0;
            if (contador > 0) {
                for (int l = 0; l < numerosEscolhidos.length; l++) {
                    if (numerosEscolhidos[l] == verificador) {
                        System.out.printf(
                                "\nEsse número já foi escolhido!\nPor favor escolha uma das seguintes opções\n(1)Trocar valor de aposta do número %d\n(2)Escolher outro número.",
                                numerosEscolhidos[l]);
                        escolha = leitor.nextInt();
                        if (escolha > 2 || escolha < 1) {
                            do {
                                System.out.printf(
                                        "Escolha inválida!\nPor favor escolha uma das seguintes opções\n(1)Trocar valor de aposta do número %d\n(2)Escolher outro número.",
                                        numerosEscolhidos[l]);
                                escolha = leitor.nextInt();
                            } while (escolha > 2 || escolha < 1);
                        }
                        if (escolha == 2) {
                            System.out.println("\nEscolha um número de 1 a 36 para sua aposta!");
                            numerosEscolhidos[i] = leitor.nextInt();
                            if (numerosEscolhidos[i] <= 0 || numerosEscolhidos[i] > 36) {
                                do {
                                    System.out.println(
                                            "\nNúmero escolhido inválido!\n por favor escolha um número de 1 a 36.\n");
                                    numerosEscolhidos[i] = leitor.nextInt();
                                } while (numerosEscolhidos[i] <= 0 || numerosEscolhidos[i] > 36);
                            }
                        }
                        if (escolha == 1) {
                            System.out.printf(
                                    "\nSaldo Atual: %.2f\nO valor apostado do número %d é de: %.2f\nQual vai ser o novo valor de aposta desse número?",
                                    saldo, numerosEscolhidos[l], quantidadeDinheiroAposta[l]);
                        }
                    }
                }
            }
            contador++;
            if (escolha == 2) {
                System.out.println("\nSaldo Atual:" + saldo + "\nQuanto você quer apostar no numero "
                        + numerosEscolhidos[i] + "?");
                quantidadeDinheiroAposta[i] = leitor.nextInt();
                saldo -= quantidadeDinheiroAposta[i];
            }
        }
    }

    public static int numeroAleatorio() {
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(37);
        return aleatorio;
    }

}
