import javax.swing.JOptionPane;

class ex1{
    public static void main(String[] args){
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual vai ser o tamanho desse vetor?"));
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            vetor[i] = num;
        }

        System.out.println("Vetor Desorganizado:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print("["+vetor[i]+"] ");
        }
        int aux = 0;
        System.out.println("");
        System.out.println("Vetor Organizado:");
        for(int l = 0; l < vetor.length; l++){
            for(int i = 0; i<vetor.length-1; i++){
                if(vetor[i] > vetor[i+1]){
                    aux = vetor[i+1];
                    vetor[i+1] = vetor[i];
                    vetor[i] = aux;
                } 
            }  
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.print("["+vetor[i]+"] ");
        }
    }
}