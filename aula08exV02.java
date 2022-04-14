import java.util.Scanner;

public class aula08exV02 {
    //Faça um programa de lista de chamada que armazene o nome de 10 alunos e apresente a lista completa para o usuário
    public static void main(String[] args) {

        String[] listaChamada = new String[3];
        int i = 0;

        System.out.println("Digite 10 nomes de alunos, dando enter em cada nome: ");
        for(i = 0; i < listaChamada.length; i++){
            listaChamada[i] = new Scanner(System.in).nextLine();
        }

        System.out.println("### LISTA DE CHAMADA ###");

        for(i = 0; i <= listaChamada.length; i++){
        System.out.println(listaChamada[(i+1)]);
        }
    }
}
