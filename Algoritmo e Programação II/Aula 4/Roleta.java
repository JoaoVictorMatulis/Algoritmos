import java.util.Random;
import java.util.Scanner;

public class Roleta {

    static Scanner leitor = new Scanner(System.in);
    static double saldo = 120000.00;

    public static void main(String[] args) {
        System.out.println("================== Bem vindo a Roleto do Jão ==================");
        menu();
    }

    public static void menu() {
        System.out.println("Escolha o modo de jogo:\n(1) Roleta");
        int modoJogo = leitor.nextInt();
        switch (modoJogo) {
            case 1:
                escolhaNumeroAposta();
                break;
        }
    }

    public static void escolhaNumeroAposta() {
        System.out.println("\nEm quantos Números quer apostar?");
        int tamanho = leitor.nextInt();
        int[] numerosAposta = new int[tamanho];
        double[] apostaDinheiro = new double[tamanho];
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\nPor favor escolha um número de 1 a 36 para apostar: ");
            int numEscolha = leitor.nextInt();
            if (numEscolha < 1 || numEscolha > 36) {
                do {
                    System.out.println(
                            "\nNúmero escolhido inválido\nPor favor escolha um número de 1 a 36 para apostar: ");
                    numEscolha = leitor.nextInt();
                } while (numEscolha < 1 || numEscolha > 36);
            }
            if (contador > 0) {
                for (int v = 0; v < numerosAposta.length; v++) {
                    if (numEscolha == numerosAposta[v]) {
                        do {
                            System.out.println("Número já escolhido\nPorfavor escolha outro númeor");
                            numEscolha = leitor.nextInt();
                        } while (numEscolha == numerosAposta[v]);

                    }
                }
            }
            numerosAposta[i] = numEscolha;
            System.out.printf("Quanto você quer apostar no número %d?\nSaldo: R$ %.2f\n", numerosAposta[i], saldo);
            double valorAposta = leitor.nextDouble();
            if (valorAposta > saldo || valorAposta < 1) {
                do {
                    System.out.printf(
                            "\nValor de aposta inválido\nPorfavor Escolha quanto você quer aposta no número %d dentro do saldo disponível\nSaldo:R$ %.2f\n",
                            numerosAposta[i], saldo);
                    valorAposta = leitor.nextDouble();
                } while (valorAposta > saldo || valorAposta < 1);
            }
            apostaDinheiro[i] = valorAposta;
            saldo = saldo - valorAposta;
            contador++;
        }
        int numAleatorio = numeroAleatorio();
        System.out.printf("\nNúmero roletado: %d\n", numAleatorio);
        verificador(numerosAposta, apostaDinheiro, numAleatorio);
    }

    public static void verificador(int[] numerosAposta, double[] apostaDinheiro, int numAleatorio) {
        int verificador = 0;
        for (int i = 0; i < numerosAposta.length; i++) {
            if (numerosAposta[i] == numAleatorio) {
                apostaDinheiro[i] = apostaDinheiro[i] * 2;
                saldo += apostaDinheiro[i];
                System.out.printf("Parabéns\nVocê acertou o número sortiado\nGanhou:R$ %.2f\nSaldo Atual: R$ %.2f",
                        apostaDinheiro[i], saldo);
                verificador = 1;
            }
        }
        if (verificador < 1) {
            System.out.println("Que pena, você não consegui acertar o número");
        }
        if (saldo <= 0) {
            System.out.println("Saldo zerado\nVocê não pode mais jogar");
            System.exit(0);
        } else {
            escolhaFinal();
        }
    }

    public static void escolhaFinal() {
        System.out.printf(
                "\nSaldo Atual:R$ %.2f\nEscolha umas das opções:\n(0)Encerrar o Programa\n(1)Voltar ao menu(Não reinicia seu saldo)\n(2)Jogar de novo no mesmo modo\n",
                saldo);
        int escolha = leitor.nextInt();
        switch (escolha) {
            case 0:
                System.out.println(
                        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.exit(0);
                break;
            case 1:
                menu();
                break;
            case 2:
                escolhaNumeroAposta();
                break;
        }
    }

    public static int numeroAleatorio() {
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(37);
        return aleatorio;
    }

}
