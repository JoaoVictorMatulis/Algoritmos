package Aula_5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos alunos serão dados as notas?");
        int tamanho = leitor.nextInt();
        String[] nome = new String[tamanho];
        float[] notaP1 = new float[tamanho];
        float[] notaP2 = new float[tamanho];
        float[] media = new float[tamanho];
        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite o nome do primeiro aluno: ");
            nome[i] = leitor.next();
            System.out.printf("Digite a nota P1 do aluno: %s\n", nome[i]);
            notaP1[i] = leitor.nextInt();
            System.out.printf("Digite a nota P2 do aluno: %s\n", nome[i]);
            notaP2[i] = leitor.nextInt();
            media[i] = (notaP1[i] + notaP2[i]) / 2;
        }
        for (int i = 0; i < media.length; i++) {
            if (media[i] > 5) {
                System.out.printf("\nO aluno: %s\nEstá aprovado\n", nome[i]);
            } else {
                System.out.printf("\nO aluno: %s\nEstá reprovado\n", nome[i]);
            }
        }
    }
}

/*
public class Exercicio8NotasAlunos {
	public static void main(String[] args) {
	int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
	String nomes[] = new String[qtd];
	float notas1[], notas2[];
	notas1 = new float[qtd];
	notas2 = new float[qtd];
	for(int i=0 ; i<qtd; i++)		{
	nomes[i] = JOptionPane.showInputDialog("Digite um nome:");
	notas1[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota:"));
	notas2[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota:"));		}
	for(int i=0 ; i<qtd ; i++)		{
	   float media = (notas1[i]+notas2[i])/2;
	   if(media>5)
		System.out.println("O aluno(a) " + nomes[i] + " foi aprovado(a) com a média:  " +   media); 
	else
	System.out.println("O aluno(a) " + nomes[i] + " foi reprovado(a) com a média:  "  + media); 
       }
    }
}
  
*/
