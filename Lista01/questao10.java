import java.util.Scanner;

public class questao10{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        int quantDivisoes = 0;
        float num;

        System.out.print("Digite um número: ");
        num = leitor.nextFloat();

        while(num >= 1){
            num /= 2;
            quantDivisoes++;
        }

        System.out.printf("Número final: %f\nNúmero de divisões: %d\n", num, quantDivisoes);

    }
}