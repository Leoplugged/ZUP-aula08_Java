import java.util.Scanner;

public class aula08exV03 {
    public static void main(String[] args) {
        //Faça um programa que receba 10 números inteiros, armazene-os e verifique quais numeros são pares, e exiba para o usuário apenas os números pares da lista
        
        int x = 10;
        int[] nArmazenados = new int[x];
        int i = 0;

        System.out.println("Digite 10 números inteiros. Dê enter para cada números para armazenar.");

        for(i = 0; i < x; i++) {
            nArmazenados[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Dentre 10 números armazenados, esses são pares: ");

        for(i = 0; i < x; i++) {
            if(nArmazenados[i] % 2 == 0){
            System.out.println(i+1+"º número armazenado: "+nArmazenados[i]);
            }
        }
    }
}