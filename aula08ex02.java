import java.util.Scanner;

public class aula08ex02 {
    //Faça um programa que mostre a tabuada a partir da escolha do usuário
    public static void main(String[] args) {

        System.out.println("Digite um número para exibir a tabuada: ");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("Tabuada do "+numero);
        
        for(int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
}
