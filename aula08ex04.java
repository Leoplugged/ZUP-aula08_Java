import java.util.Scanner;

public class aula08ex04 {
    //Ler um valor N e imprimir todos os valores pares entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Defina um valor para N:");
        int N = leitor.nextInt();

        for(int i = 0; i <= N; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        leitor.close();
    }
}
