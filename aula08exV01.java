import java.util.Scanner;

public class aula08exV01 {
    //Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, calcule e apresente a soma destes valores
    public static void main(String[] args) {
        int[] valor = new int[5];
        int somatoria = 0;
        
        System.out.println("Somatória dos 5 valores. Digite 5 números inteiros de cada vez:");
        for(int i = 0; i<5; i++){
            valor[i] = new Scanner(System.in).nextInt();
        }

        for(int i = 0; i<5; i++){
            somatoria = valor[i] + somatoria;
        }

        System.out.println("O valor da somatória é: "+somatoria+".");
    }
}
