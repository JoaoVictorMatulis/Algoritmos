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
        double[] quantidadeDinheiroAposta = new double[numeroApostas];
        int contador = 0;
        int escolha = 2;
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
            int local = 0;
            if (contador > 0) {
                for (int l = 0; l < numerosEscolhidos.length; l++) {
                    if (i != l) {
                        if (numerosEscolhidos[l] == verificador) {
                            System.out.println("\nNúmeros escolhidos:");
                            for (int v : numerosEscolhidos) {
                                System.out.print(v + ", ");
                            }
                            System.out.printf(
                                    "\nEsse número já foi escolhido!\nPor favor escolha uma das seguintes opções\n(1)Trocar valor de aposta do número %d\n(2)Escolher outro número.\n",
                                    numerosEscolhidos[l]);
                            escolha = leitor.nextInt();
                            if (escolha > 2 || escolha < 1) {
                                do {
                                    System.out.printf(
                                            "\nEscolha inválida!\nPor favor escolha uma das seguintes opções\n(1)Trocar valor de aposta do número %d\n(2)Escolher outro número.\n",
                                            numerosEscolhidos[l]);
                                    escolha = leitor.nextInt();
                                    local = l;
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
                        }
                    }
                }
            }
            verificador = -1;
            contador++;
            if (escolha == 2) {
                System.out.println("\nSaldo Atual:" + saldo + "\nQuanto você quer apostar no numero "
                        + numerosEscolhidos[i] + "?");
                quantidadeDinheiroAposta[i] = leitor.nextInt();
                saldo -= quantidadeDinheiroAposta[i];
            } else {
                System.out.printf(
                        "Valor do número %d: %.2f\nDigite o que você quer fazer?\n(some o quanto dinheiro você quer ou subtraia)",
                        numerosEscolhidos[local], quantidadeDinheiroAposta[local]);
                double trocaValor = leitor.nextDouble();
                saldo += quantidadeDinheiroAposta[local];
                quantidadeDinheiroAposta[local] = quantidadeDinheiroAposta[local] + trocaValor;
                saldo -= quantidadeDinheiroAposta[local];
            }
            escolha = 2;
        }
    }

    public static int numeroAleatorio() {
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(37);
        return aleatorio;
    }

}
