import java.util.Scanner;

public class aula08ex02 {
    //Faça um programa que mostre a tabuada a partir da escolha do usuário
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] valor = new int[2];

        System.out.println("Tabuada\nDigite um número: ");
        valor[0] = leitor.nextInt();
        System.out.println("Tabuada\nDigite outro número: ");
        valor[1] = leitor.nextInt();

        System.out.println("Resultado: "+valor[0]*valor[1]+".");
        leitor.close();
    }
}
